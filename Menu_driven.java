
import java.util.Scanner;

class Menu_driven{
public static void main(String args[]){
int a,b,c;
int ch;
Scanner sc = new Scanner(System.in);
do{
System.out.println("1.Addition");
System.out.println("2.Substraction");
System.out.println("3.Multiplication");
System.out.println("4.Divission");
System.out.println("5.Remainder");
System.out.println("Make your choice");
ch = sc.nextInt();
switch(ch){
case 1 :
System.out.println("Enter first value");
a=sc.nextInt();
System.out.println("Enter second value");
b=sc.nextInt();
c=a+b;
System.out.println("Total :"+ c);
break;
case 2 :
System.out.println("Enter first value");
a=sc.nextInt();
System.out.println("Enter second value");
b=sc.nextInt();
c=a-b;
System.out.println("Total :"+ c);
break;
case 3 :
System.out.println("Enter first value");
a=sc.nextInt();
System.out.println("Enter second value");
b=sc.nextInt();
c=a*b;
System.out.println("Total :"+ c);
break;
case 4 :
System.out.println("Enter first value");
a=sc.nextInt();
System.out.println("Enter second value");
b=sc.nextInt();
c=a/b;
System.out.println("Total :"+ c);
break;
case 5 :
System.out.println("Enter first value");
a=sc.nextInt();
System.out.println("Enter second value");
b=sc.nextInt();
c=a%b;
System.out.println("Total :"+ c);
break;
default :
System.out.println("Invalid");
break;
}
}while(ch<6);
}
}