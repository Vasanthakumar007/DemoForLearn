class Adding{
  int a=0;
  int b=0; 
  int c=0;
  Adding(int a,int b,int c) {
    this.a=a;
    this.b=b;
    this.c=c;
  }
  public int addTwo() {
    return a+b;
  }
  public int addThree(){
    return a+b+c;
  }
}
class Main {
  public static void main(String[] args) {
    Adding add1=new Adding(3,4,5);
    System.out.println("Adding(2): "+add1.addTwo());
    System.out.println("Adding(3  ): "+add1.addThree());
  }
}