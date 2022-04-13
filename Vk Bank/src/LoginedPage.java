import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;

public class LoginedPage {
	static Connection con;
    static String adhar;
	static HashMap<String,String> p1;
	LoginedPage(String adhar,Connection con){
		this.adhar=adhar;
		this.con=con;
	}
	
  
	public static void main() throws Exception {
		// TODO Auto-generated method stub
		FetchUser();
		System.out.println("<--------------WELCOME---------->");
		System.out.println("Account-name: "+p1.get("name"));
		System.out.println("Account-no: "+p1.get("acc_no"));
		System.out.println("Account-balance: "+p1.get("amount"));
		System.out.println("Enter option for below:\n1.Widraw\n2.deposite \n3.Transfer\n4.Loan\n5.Edit\n6.Transaction History\n7.Exit");
		System.out.println("Enter your option");
		Scanner in=new Scanner(System.in);
		int inp=in.nextInt();
		switch (inp) {
		case 1:
			FetchUser();
			withdraw(con,p1.get("acc_no"));
			main();
			break;
		case 2:
			FetchUser();
			Deposite(con,p1.get("acc_no"));
			main();
			break;
		case 3:
			//Transfer
			FetchUser();
			Transfer(con,adhar);
			
		case 4:
			System.out.println("Your Account doesn't Aligible for loa");
			main();
			break;
		case 5:
			FetchUser();
			Edit(con,p1.get("acc_no"));
			main();
			break;
		case 6:
			//Transaction history
		case 7:
			Entry goup=new Entry();
			String[] x= {"1"};
			goup.main(x);
			break;
			
		}
		
		
		

	}
	public static void History(Connection con,int acc_no,int amount, int balance,int type) throws Exception {
		PreparedStatement stmt=con.prepareStatement("insert into transaction(acc_no,transaction_type,amount,balance,date)values(?,?,?,?,?)");
		stmt.setInt(1,acc_no);
		if(type==1) {
			stmt.setString(2, "Deposite");
		}else if(type==2) {
			stmt.setString(2,"Widthdraw");
		}else if(type==3) {
			stmt.setString(2,"Transaction");
		}
		stmt.setInt(3,amount);
		stmt.setInt(4, balance);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
		stmt.setString(5, dtf.format(now));
		stmt.executeUpdate();
	}
	public static void Transfer(Connection con,String aadhar) throws Exception{
		System.out.println("<----------Welcome to Transfer Panel----------->");
		System.out.println("\t\t\t\tName: "+p1.get("name"));
		System.out.println("\t\t\t\tYour account number: "+p1.get("acc_no"));
		System.out.println("\t\t\t\tYour Balance: "+p1.get("amount")+"\n\n\n");
		System.out.print("Enter the Reciver Account number: ");
		Scanner input= new Scanner(System.in);
		String reciverAno=input.next();
		PreparedStatement stmt=con.prepareStatement("Select * from users where acc_no=?");
		stmt.setString(1,reciverAno);
		HashMap<String,String>receive=new HashMap<String,String>();
		ResultSet rs=stmt.executeQuery();
		while(rs.next()) {
			receive.put("acc_no",rs.getString(1));
			receive.put("name",rs.getString(2));
			receive.put("amount",rs.getString(5));
		}
		System.out.println("\t\t\t\tReceiver Name: "+receive.get("name"));
		System.out.println("\t\t1.Proceed\n2.Exit");
		int decision=input.nextInt();
		switch(decision) {
		case 1:
			//proceed
			System.out.print("Enter the amount to send: ");
			int send=input.nextInt();
			if(send<Integer.parseInt(p1.get("amount"))) {
				int total=send+Integer.parseInt(receive.get("amount"));
				int remain=Integer.parseInt(p1.get("amount"))-send;
				PreparedStatement stmt1=con.prepareStatement("update users set amount=? where acc_no=?");
				stmt1.setInt(1, total);
				stmt1.setInt(2,Integer.parseInt(receive.get("acc_no")));
				stmt1.executeUpdate();
				PreparedStatement stmt2=con.prepareStatement("update users set amount=? where acc_no=?");
				stmt2.setInt(1, remain);
				stmt2.setInt(2,Integer.parseInt(p1.get("acc_no")));
				stmt2.executeUpdate();
				 History(con,Integer.parseInt(p1.get("amount")),send,remain,3);
				System.out.println("Success fully transfered :~)");
				main();
				
			}else {
				System.out.println("invalid Information :(");
			}
			break;
		 
		case 2:
			main();
			break;
		}
	}
	public static void FetchUser( ) throws Exception{
		p1=new HashMap<>();
		PreparedStatement stmt=con.prepareStatement("Select * from users where aadhar=?");
		stmt.setString(1,adhar);
		ResultSet rs=stmt.executeQuery();
		while(rs.next()){
			p1.put("acc_no",rs.getString(1));
			p1.put("name",rs.getString(2));
			p1.put("aadhar",rs.getString(3));
			p1.put("phone",rs.getString(4));
			p1.put("amount",rs.getString(5));
			p1.put("gender",rs.getString(6));
			p1.put("D-O-B",rs.getString(7));
			p1.put("email",rs.getString(8));
			p1.put("password",rs.getString(9));
		}
		
	}
   public static void withdraw(Connection con,String acc_n)throws Exception {
	   PreparedStatement stmt=con.prepareStatement("update users set amount=? where acc_no=?");
	   System.out.println("Enter the Amount to withdraw:");
	   Scanner nm=new Scanner(System.in);
	   int withdrawAmount=nm.nextInt();
	   int balance=Integer.parseInt(p1.get("amount"));
	   if(withdrawAmount<balance) {
		   int remain=balance-withdrawAmount;
		   stmt.setInt(1, remain);
		   stmt.setString(2, p1.get("acc_no"));
		   stmt.executeUpdate();
		   History(con,Integer.parseInt(acc_n),withdrawAmount,remain,2);
		   System.out.println("Transaction Successful :)");
		   
	   }else {
		   System.out.println("Insufficient Balance");
		   System.exit(0);
	   }
   }
   
   public static void Deposite(Connection con,String acc_n)throws Exception {
	   PreparedStatement stmt=con.prepareStatement("update users set amount=? where acc_no=?");
	   System.out.println("Enter the Amount to Deposite:");
	   Scanner in=new Scanner(System.in);
	   int depositeAmount=in.nextInt();
	   int balance=Integer.parseInt(p1.get("amount"));
	   if(true) {
		   int remain=balance+depositeAmount;
		   stmt.setInt(1, remain);
		   stmt.setString(2, p1.get("acc_no"));
		   stmt.executeUpdate();
		   History(con,Integer.parseInt(acc_n),depositeAmount,remain,1);
		   System.out.println("Amount Successfully Deposited :~) ");
		   
	   }
   }
    
   
   public static void Edit(Connection con,String acc_n)throws Exception{
//	   PreparedStatement stmt=con.prepareStatement("");
	   System.out.println("<---Welcome tho Edit Pannel--->");
	   System.out.println("1.name\n2.phone\n3.aadhar\n4.date of birth\n5.email\n6.password\n7.Exit");
	   System.out.println("Enter your option th change:  ");
	   Scanner in=new Scanner(System.in);
	   int changinValue=in.nextInt();
	   switch(changinValue) {
	   case 1:
		   PreparedStatement stmt=con.prepareStatement("update users set name=? where acc_no=?;");
		   Scanner inp=new Scanner(System.in);
		   System.out.println("Enter Your New name: ");
		   String name=inp.nextLine();
		   stmt.setString(1,name);
		   stmt.setString(2,acc_n);
		   stmt.executeUpdate();
		   System.out.println("Name Changed Sucessfully changed :~)\n\n\n");
		   Edit(con,acc_n);
		   break;
	   case 2:
		   PreparedStatement stmt1=con.prepareStatement("update users set phone=? where acc_no=?;");
		   System.out.println("Enter Your New Phone-number: ");
		   String number=in.next();
		   stmt1.setString(1,number);
		   stmt1.setString(2,acc_n);
		   stmt1.executeUpdate();
		   System.out.println("Phone-number Changed Sucessfully changed :~)\n\n\n");
		   Edit(con,acc_n);
		   break;
	   case 3:
		   PreparedStatement stmt2=con.prepareStatement("update users set aadhar=? where acc_no=?;");
		   System.out.println("Enter Your New Aadhar number: ");
		   String nadhar=in.next();
		   adhar=nadhar;
		   in.nextLine();
		   stmt2.setString(1,nadhar);
		   stmt2.setString(2,acc_n);
		   stmt2.executeUpdate();
		   if(stmt2.executeUpdate()==1) {
		   System.out.println("Aadhar Changed Sucessfully changed :~)\n\n\n");
		   }
		   Edit(con,acc_n);
		   break;
	   case 4:
		   PreparedStatement stmt3=con.prepareStatement("update users set dob=? where acc_no=?;");
		   System.out.println("Enter Your New Date Of Birth: ");
		   String dob=in.next();
		   stmt3.setString(1,dob);
		   stmt3.setString(2,acc_n);
		   stmt3.executeUpdate();
		   System.out.println("Date Of Birth Changed Sucessfully changed :~)\n\n\n");
		   Edit(con,acc_n);
		   break;
	   case 5:
		   PreparedStatement stmt4=con.prepareStatement("update users set email=? where acc_no=?;");
		   System.out.println("Enter Your Email: ");
		   String email=in.next();
		   stmt4.setString(1,email);
		   stmt4.setString(2,acc_n);
		   stmt4.executeUpdate();
		   System.out.println("Email Changed Sucessfully changed :~)\n\n\n");
		   Edit(con,acc_n);
		   break;
	   case 6:
		   PreparedStatement stmt5=con.prepareStatement("update users set password=? where acc_no=?;");
		   System.out.println("Enter Your New Password: ");
		   in.nextLine();
		   String Pass=in.next();
		   stmt5.setString(1,Pass);
		   stmt5.setString(2,acc_n);
		   stmt5.executeUpdate();
		   System.out.println("Password Changed Sucessfully changed :~)\n\n\n");
		   Edit(con,acc_n);
		   break;
	   case 7:
		   main();
		   break;
		   
		   
		   
	   }
	   in.close();
   }
}
