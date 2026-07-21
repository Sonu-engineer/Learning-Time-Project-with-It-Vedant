import java.util.*;
public  class grantenandless{
public  static  void  main(String [] agrs ){
Scanner sc=new Scanner(System.in);
System.out.println("******Compare To Number :******");
System.out.println("Please  Entery Here First Number");
int  greater= sc.nextInt();
System.out.println("Please  Entery Here Second Number");
int less=sc.nextInt();

if(greater<less){
System.out.println("This "   +greater+   " number is greater than  =  " + less );}
else if(greater>less){
System.out.println("This "  + less +  "number is less than  =  " + greater);
}else  if(greater==less){
System.out.println(greater+" and  "+ less + " Both number are   equal ");
}
}
}
