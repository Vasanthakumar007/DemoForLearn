import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Properties;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Entry {
    static BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws  Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        int ch=0;
        Entry main=new Entry();
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/VKbank","root","");
        while (true) {
            System.out.println("----------Bank Management System----------");
            System.out.println("1.Create\n2.Signin\n3.Exit");
            System.out.print("Enter your option:");
            try {
                ch = Integer.parseInt(bufferedReader.readLine());
                System.out.println(ch);
            }catch (Exception e){
                System.out.println("Please Enter the right choice.");
                continue;
            }
            switch (ch) {
                case 1:
                    main.createUser(con);
                    
                    break;
                case 2:
                	main.Login(con);
                    //login
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }
    }
    public void createUser(Connection con) throws Exception{
    	Pattern pattern = Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2}");
        Pattern regexForPhone = Pattern.compile("[0-9]{10}");
        Pattern regexForAadhar = Pattern.compile("[0-9]{12}");
        PreparedStatement stmt=con.prepareStatement("insert into users(name,aadhar,phone,amount,gender,dob,email,password)values(?,?,?,?,?,?,?,?)");
        String name ="",dob="",email="",password="",phone="",adhar="";
        int amount=0,gender=0;
        while (true){
            
        	if (name.length() == 0) {
                System.out.print("Enter the name :");
                name = bufferedReader.readLine().trim();
                continue;
            }
            if (!pattern.matcher(dob).matches()) {
                System.out.print("Enter the Date (YYYY-MM-DD):");
                dob = bufferedReader.readLine();
                continue;
            }
            if (!email.contains("@")||!email.contains(".com")) {
                System.out.print("Enter the Email :");
                email = bufferedReader.readLine();
                continue;
            }
            if (password.length() < 4) {
                System.out.print("Enter the Password :");
                password = bufferedReader.readLine();
                continue;
            }
            if (!regexForPhone.matcher(phone).matches()) {
                System.out.print("Enter your Phone no :");
                phone = bufferedReader.readLine();
                continue;
            }
            if (!regexForAadhar.matcher(adhar).matches()) {
                System.out.print("Enter your Adhaar no :");
                adhar = bufferedReader.readLine();
                continue;
            }
           
            if (gender != 1 && gender != 2 && gender != 3) {
            	try {
                    System.out.print("Select your Gender \n1.Male\n2.Female\n3.Others\nEnter :");
                    gender = Integer.parseInt(bufferedReader.readLine());
                }catch (Exception e) {
                    System.out.print("Enter the Given options in number only.");
                    continue;
                }
            } 
            
            if (String.valueOf(amount).contains("-") || String.valueOf(amount).length() == 0 || (String.valueOf(amount).length() == 1 && String.valueOf(amount).equals("0"))) {
            	try {
                System.out.print("Enter your Amount :");
                amount = Integer.parseInt(bufferedReader.readLine());
                
                }catch(Exception e) {
            	  System.out.println("Please enter correct value...");
            	  continue;
                }
            
                } else {
                    stmt.setString(1, name);
                    stmt.setString(2, adhar);
                    stmt.setString(3, phone);
                    stmt.setInt(4, amount);
                    stmt.setInt(5, gender);
                    stmt.setString(6, dob);
                    stmt.setString(7, email);
                    stmt.setString(8, password);
                    int gnotp= 0;
                    if (stmt.executeUpdate() == 1) {
                    	 sendMail(email);
                       while(true) {	 
                    	 try {
                         System.out.print("Enter OTP : ");
                         Scanner sc = new Scanner(System.in);
                         gnotp = sc.nextInt();
                         if(gnotp != OTP) {
                        	 System.out.println("please enter correct OTP ...");
                        	 continue;
                         }
                         break;
                         
                         
                    	 }catch(Exception e) {
                    		 continue;
                    	 }
                       } 
                         if(gnotp==OTP) {
                         
                         
                         
                        System.out.println("\nData Inserted Successfully.\n");
//                        
                        LoginedPage p=new LoginedPage(adhar,con);
                        p.main();
                         }
                         else {
                        	 System.out.println("incorrect OTP.");
                        	 createUser(con);
                         }
                    } else {
                        System.out.println("Failed.");
                    }
                    break;
                }
           
        }
    }
    
    public void Login(Connection con) throws Exception{
		try {
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter your account-name: ");
	    	int ac_no=Integer.parseInt(bufferedReader.readLine());
	    	System.out.print("Enter Your Password: ");
	    	String pass=bufferedReader.readLine();
	    	PreparedStatement stmt=con.prepareStatement("select * from users where acc_no=?;");
	    	stmt.setInt(1,ac_no);
	    	int acc=0;
	    	String pas="";
	    	String name="";
	    	String aadhar="";
	    	ResultSet rs=stmt.executeQuery();
	    	while (rs.next()) {
	    	 acc=rs.getInt(1);
	    	 pas=rs.getString(9);
	    	 name=rs.getString(2);
	    	 aadhar=rs.getString(3);
	    	}
	    	if((ac_no==acc) && (pass.contentEquals(pas))) {
	    		System.out.println("Logined Successfully!");
	    		LoginedPage q=new LoginedPage(aadhar,con);
	    		q.main();
	    	}else {
	    		System.out.println("failed");
	    	}
		}catch(Exception e){
			System.out.println(e);
		}
    	
     
	}
    public static void sendMail(String recepient) throws Exception {
		System.out.println("preparing ....");
		
		Properties properties = new Properties();
		
		 properties.put("mail.smtp.auth","true");
	        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
	        properties.put("mail.smtp.starttls.enable","true");
	        properties.put("mail.smtp.host","smtp.gmail.com");
	        properties.put("mail.smtp.port","587");
		
		String username = "manmade5051@gmail.com";
		String password = "securecooker@5051";
		
		Session session = Session.getInstance(properties,new Authenticator(){
			
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
			
		});
		
		
		Message message = prepareMessage(session,username,recepient);
		
			Transport.send(message);
			
		
		
	}
static int OTP = 0;
	private static Message prepareMessage(Session session,String username, String recepient)
	 {
		Message message=new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(username));
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
			message.setSubject("OTP Verification");
			
//			int rnd = (int) (Math.random()*50000 + Math.random()*50000 + 100000);
			
			Random random = new Random();
			 OTP =  random.nextInt(899999)+100000; 
			
			message.setText("Your OTP is : " + OTP + "\nEnter this OTP to create account in our bank.");
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return message;
		
	}
    
}
