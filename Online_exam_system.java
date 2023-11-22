import java.util.Scanner;
class reg
{
    Scanner sc=new Scanner(System.in);
    menu mn=new menu();
    void r1()
    {
       System.out.println("\n Enter your name :");
       String name=sc.next();
       System.out.println("Enter your Mail :");
       String mail=sc.next();
       System.out.println("Enter your passsord :");
       int pp=sc.nextInt();
       System.out.println("\n Registration Successful !!");
       System.out.println("\n -----LOGIN-----");

       while(true)
       {
            System.out.println("Enter your mail");
            String s=sc.next();
            System.out.println("Enter your password");
            int p=sc.nextInt();
            
            if(s.equals(mail) && (p== pp))
            {
                mn.m2();
                break;
            }
            else
            {
                 System.out.println("You Entered mail or Password are incorrect");
            }
       }
    }

}

class abt
{
    void display()
    {
       System.out.println("Name : Pravalika");
       System.out.println("Mail : pothrajpravalika1854@gmail.com");
    }
}

class menu
{
    java j=new java();
    python p=new python();
    dbms d=new dbms();
    abt a=new abt();
    Scanner sc=new Scanner(System.in);
    public void m2()
    {
       System.out.println("\n Login Successful");
       while(true)
       {
      System.out.println("\n 1.My Account\n 2.Exam\n 3.About\n 4.Exit");
      System.out.println("\n Enter your option");
      int o=sc.nextInt();
      if(o == 1)
      {
     a.display();
     System.out.println("\n1.Back   2.Exit");
     int g1=sc.nextInt();
     if(g1==1)
     {
    System.out.println("\n");
     }
     else{
    break;
     }
      }
      else if(o==2)
      {
     System.out.println("\n1.JAVA\n2.PYTHON\n3.DBMS");
     System.out.println("\nSelect the Subject");
     int su=sc.nextInt();
     if(su == 1)
     {
    j.s1();
     }
     else if(su == 2)
     {
    p.p1();
     }
     else if(su==3)
     {
    d.db();
     }
     else
     {
    System.out.println("Choose the correct one");
     }
     System.out.println("\n1.Back      2.Exit");
     int g2 = sc.nextInt();
     if(g2==1)
     {
    System.out.println("\n");
     }
     else
     {
    break;
     }
      }
      else if(o==3)
      {
     System.out.println("\n---Online Exam portal---");
     System.out.println("\n Designed by Pravalika oasisinfobyte");
     System.out.println("\n1.Back   2.Exit");
     int g3 = sc.nextInt();
     if(g3==1)
     {
    System.out.println("\n");
     }
     else{
    break;
     }
      }
      else if(o==4)
      {
     break;
      }
      else{
     System.out.println("Choose the correct one");
      }

       }
    }
}

class logA
{
    Scanner sc = new Scanner(System.in);
    public void m1()
    {
       menu m = new menu();
       int pswd = 1234;
       System.out.println("enter your mail");
       String s =sc.next();
       while(true)
       {
            System.out.println("Enter your password");
            int p = sc.nextInt();
            if(p==pswd)
            {
                    m.m2();
                    break;
            }
            else
            {
                    System.out.println("You Entered inocrrect mail/password");
            }
       }
    }
}

class java
{
    Scanner sc = new Scanner(System.in);
    void s1()
    {
    int count=0;
    System.out.println("\n");
    System.out.println(" There are 10 questions each question carries 2 marks");
    System.out.println("\nQuestion No.1 :");
    System.out.println("\nWhat is the size of float and double in java?");
    System.out.println("\n1.64&32");
    System.out.println("2.32&64");
    System.out.println("3.32&32");
    System.out.println("4.64&64\n");
    int u1 = sc.nextInt();
    if(u1 ==2)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.2 :");
    System.out.println("\nNumber of primitive datatypes in java are");
    System.out.println("\n1.6");
    System.out.println("2.4");
    System.out.println("3.7");
    System.out.println("4.8\n");

    int u2 = sc.nextInt();
    if(u2 ==4)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.3 :");
    System.out.println("\nWhen an array is passses to a method,what does the method receive?");
    System.out.println("\n1.The reference of the array");
    System.out.println("2.A copy of the array");
    System.out.println("3.Length of the array");
    System.out.println("4.Copy of first element\n");

    int u3 = sc.nextInt();
    if(u3 ==1)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.4 :");
    System.out.println("\nSelect the valid statement to declare and initialize an array");
    System.out.println("\n1.int[]A={}");
    System.out.println("2.int[]={1,2,3}");
    System.out.println("3.int[]A=(1,2,3)");
    System.out.println("4.int[][]A={1,2,3}\n");

    int u4 = sc.nextInt();
    if(u4 ==2)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.5 :");
    System.out.println("\nArrays in java are -");
    System.out.println("\n1.Object references");
    System.out.println("2.objects");
    System.out.println("3.Primitive datatype");
    System.out.println("4.None\n");

    int u5 = sc.nextInt();
    if(u5 ==2)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.6 :");
    System.out.println("\nWhen is the object created with new keyword?");
    System.out.println("\n1.At run time");
    System.out.println("2.At compile time");
    System.out.println("3.Depends on the code");
    System.out.println("4.None\n");

    int u6 = sc.nextInt();
    if(u6 ==1)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.7 :");
    System.out.println("\nIn which of the following is toString() method defined?\n");
    System.out.println("\n1.java.lang.Object");
    System.out.println("2.java.lang.String");
    System.out.println("3.java.lang.util");
    System.out.println("4.None\n");

    int u7 = sc.nextInt();
    if(u7 ==1)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.8 :");
    System.out.println("\ncompareTo() returns\n");
    System.out.println("\n1.True");
    System.out.println("2.False");
    System.out.println("3.An int value");
    System.out.println("4.None\n");

    int u8 = sc.nextInt();
    if(u8 ==3)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.9:");
    System.out.println("\nIdentify the return typenof a method that does not return any value.\n");
    System.out.println("\n1.int");
    System.out.println("2.void");
    System.out.println("3.double");
    System.out.println("4.None\n");
    int u9 = sc.nextInt();
    if(u9 ==2)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.10 :");
    System.out.println("\nOutput of Math.floor(3.6)?");
    System.out.println("\n1.3");
    System.out.println("2.3.0");
    System.out.println("3.4");
    System.out.println("4.4.0\n");
    int u10=sc.nextInt();
    if(u10==2)
    {
        count++;
    }
    else{
        count=count;

    }
    if(count >8 ){
        System.out.println("\n Your performance is excellent...");
    }
    else if(count>4 && count<8){
        System.out.println("\n Your perfomance is not bad..Try again next time");
    }
    else{
        System.out.println("\n Your perfomance is too bad!!");
    }
    System.out.println("\n ----------------------------------------");
    System.out.println("Your total score is :"+count*2);
    System.out.println("\n ----------------------------------------");
    System.out.println("\n No of Question you did correct are : "+count);
    System.out.println("\n Summary of your Exams");
    System.out.println("\nYour Option :"+u1+"\n Actual Option:2\n Your Option :"+u1+"\n Actual Option:4\n Your Option :"+u1+"\n Actual Option:1\n Your Option :"+u1+"\n Actual Option:2\n Your Option :"+u1+"\n Actual Option:2\n Your Option :"+u1+"\n Actual Option:1\n Your Option :"+u1+"\n Actual Option:1\n Your Option :"+u1+"\n Actual Option:3\n Your Option :"+u1+"\n Actual Option:2\n Your Option :"+u1+"\n Actual Option:2\n");

}
}



class python
{
    Scanner sc = new Scanner(System.in);
    void p1()
    {
    int count=0;
    System.out.println("\n There are 10 questions each question carries 2 marks");
    System.out.println("\nQuestion No.1 :");
    System.out.println("\n Who developed python programming language?");
    System.out.println("\n1.wick van rossum");
    System.out.println("2.rasmum lerdorf");
    System.out.println("3.guido van rossum");
    System.out.println("4.niene stom\n");
    int u1 = sc.nextInt();
    if(u1 ==3)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.2 :");
    System.out.println("\nwhich of the following is the correct extension of python file? ");
    System.out.println("\n1. .python");
    System.out.println("2. .pl");
    System.out.println("3. .py");
    System.out.println("4. .p\n");

    int u2 = sc.nextInt();
    if(u2 ==3)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.3 :");
    System.out.println("\nWhich keyword is used for function in python?");
    System.out.println("\n1.Function");
    System.out.println("2.def");
    System.out.println("3.fun");
    System.out.println("4.Define\n");

    int u3 = sc.nextInt();
    if(u3 ==2)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.4 :");
    System.out.println("\nWhich of the following character is used to give single line comments?");
    System.out.println("\n1. //");
    System.out.println("2.#");
    System.out.println("3.!");
    System.out.println("4./*\n");

    int u4 = sc.nextInt();
    if(u4 ==2)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.5 :");
    System.out.println("\nWhich of the functions can help us to find the version of python currently working on?");
    System.out.println("\n1.sys.version(1)");
    System.out.println("2.sys.version(0)");
    System.out.println("3.sys.version()");
    System.out.println("4.sys.version\n");

    int u5 = sc.nextInt();
    if(u5 ==4)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.6 :");
    System.out.println("\nPython supports the creation of anonymous function at runtime,using a constructs called");
    System.out.println("\n1.pi");
    System.out.println("2.anonymous");
    System.out.println("3.lamdba");
    System.out.println("4.None\n");

    int u6 = sc.nextInt();
    if(u6 ==3)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.7 :");
    System.out.println("\nWhat does pip stands for pythom?");
    System.out.println("\n1.Pip installs python");
    System.out.println("2.Pip installs packages");
    System.out.println("3.Preferred installer program");
    System.out.println("4.All\n");

    int u7 = sc.nextInt();
    if(u7 ==3)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.8 :");
    System.out.println("Which of the following is truncation division operator\n");
    System.out.println("\n1.|");
    System.out.println("2.//");
    System.out.println("3./");
    System.out.println("4.%\n");

    int u8 = sc.nextInt();
    if(u8 ==2)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.9:");
    System.out.println("Which of the following statements is used to create an empty set in python?.\n");
    System.out.println("\n1.()");
    System.out.println("2.[]");
    System.out.println("3.{}");
    System.out.println("4.set()\n");
    int u9 = sc.nextInt();
    if(u9 ==4)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.10 :");
    System.out.println("\nOutput of print (math.pow(3.2))?");
    System.out.println("\n1.9.0");
    System.out.println("2.None");
    System.out.println("3.9");
    System.out.println("4.4\n");
    int u10=sc.nextInt();
    if(u10==1)
    {
        count++;
    }
    else{
        count=count;

    }
    if(count >8 ){
        System.out.println("\n Your performance is excellent...");
    }
    else if(count>4 && count<8){
        System.out.println("\n Your perfomance is not bad..Try again next time");
    }
    else{
        System.out.println("\n Your perfomance is too bad!!");
    }
    System.out.println("\n ----------------------------------------");
    System.out.println("Your total score is :"+count*2);
    System.out.println("\n ----------------------------------------");
    System.out.println("\n No of Question you did correct are : "+count);
    System.out.println("\n Summary of your Exams");
    System.out.println("\n1.Your Option :"+u1+"\n Actual Option:2\n 1.Your Option :"+u1+"\n Actual Option:4\n 1.Your Option :"+u1+"\n Actual Option:1\n 1.Your Option :"+u1+"\n Actual Option:2\n 1.Your Option :"+u1+"\n Actual Option:2\n 1.Your Option :"+u1+"\n Actual Option:1\n 1.Your Option :"+u1+"\n Actual Option:1\n v 1.Your Option :"+u1+"\n Actual Option:3\n 1.Your Option :"+u1+"\n Actual Option:2\n 1.Your Option :"+u1+"\n Actual Option:2\n");

}
}


class dbms
{
    Scanner sc = new Scanner(System.in);
    void db()
    {
    int count=0;
    System.out.println("\n There are 10 questions each question carries 2 marks");
    System.out.println("\nQuestion No.1 :");
    System.out.println("\n Full form of DBMS is");
    System.out.println("\n1.Database monitor system");
    System.out.println("2.Data backup management system");
    System.out.println("3.Data of binary management system");
    System.out.println("4.Database management system\n");
    int u1 = sc.nextInt();
    if(u1 ==4)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.2 :");
    System.out.println("\nWho created the first DBMS");
    System.out.println("\n1.edgar codd");
    System.out.println("2.charles bachman");
    System.out.println("3.charles babbage");
    System.out.println("4.sharonlodd\n");

    int u2 = sc.nextInt();
    if(u2 ==2)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.3 :");
    System.out.println("\nWhich of the following is not an example of DBMS?");
    System.out.println("\n1.MYSQL");
    System.out.println("2.Microsoft Access");
    System.out.println("3.IBM DB2");
    System.out.println("4.Google\n");

    int u3 = sc.nextInt();
    if(u3 ==4)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.4 :");
    System.out.println("\nWhich of the following is component of DBMS");
    System.out.println("\n1.Data");
    System.out.println("2.Data languages");
    System.out.println("3.Data manager");
    System.out.println("4.All\n");

    int u4 = sc.nextInt();
    if(u4 ==4)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.5 :");
    System.out.println("\nWhat is information about data called");
    System.out.println("\n1.Hyperdata");
    System.out.println("2.Teradata");
    System.out.println("3.Metadeta");
    System.out.println("4.relations\n");

    int u5 = sc.nextInt();
    if(u5 ==3)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.6 :");
    System.out.println("\nWhat does an RDBMS consists of?");
    System.out.println("\n1.Collections of records");
    System.out.println("2.Collections of tables");
    System.out.println("3.Collections of keys");
    System.out.println("4.Collections of fields\n");

    int u6 = sc.nextInt();
    if(u6 ==2)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.7 :");
    System.out.println("\nWhich command is used to remove relation in SQL?");
    System.out.println("\n1.drop");
    System.out.println("2.delete");
    System.out.println("3.purge");
    System.out.println("4.remove\n");

    int u7 = sc.nextInt();
    if(u7 ==1)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.8 :");
    System.out.println("\nOldest DB model is");
    System.out.println("\n1.Network");
    System.out.println("2.Physical");
    System.out.println("3.Hierarchical");
    System.out.println("4.relations\n");

    int u8 = sc.nextInt();
    if(u8 ==3)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.9:");
    System.out.println(".\n_______ are conatined in the File");
    System.out.println("\n1.Rows");
    System.out.println("2.Columns");
    System.out.println("3.Records");
    System.out.println("4.Tables\n");
    int u9 = sc.nextInt();
    if(u9 ==2)
    {
       count++;
    }
    else{
       count=count;
    }
    System.out.println("\nQuestion No.10 :");
    System.out.println("\nFull form of DML?");
    System.out.println("\n1.Data manipulation Language");
    System.out.println("2.Database modify language");
    System.out.println("3.Defination manipulation language");
    System.out.println("4.None\n");
    int u10=sc.nextInt();
    if(u10==1)
    {
        count++;
    }
    else{
        count=count;

    }
    if(count >8 ){
        System.out.println("\n Your performance is excellent...");
    }
    else if(count>4 && count<8){
        System.out.println("\n Your perfomance is not bad..Try again next time");
    }
    else{
        System.out.println("\n Your perfomance is too bad!!");
    }
    System.out.println("\n ----------------------------------------");
    System.out.println("Your total score is :"+count*2);
    System.out.println("\n ----------------------------------------");
    System.out.println("\n No of Question you did correct are : "+count);
    System.out.println("\n Summary of your Exams");
    System.out.println("\n1.Your Option :"+u1+"\n Actual Option:2\n 1.Your Option :"+u1+"\n Actual Option:4\n 1.Your Option :"+u1+"\n Actual Option:1\n 1.Your Option :"+u1+"\n Actual Option:2\n 1.Your Option :"+u1+"\n Actual Option:2\n 1.Your Option :"+u1+"\n Actual Option:1\n 1.Your Option :"+u1+"\n Actual Option:1\n v 1.Your Option :"+u1+"\n Actual Option:3\n 1.Your Option :"+u1+"\n Actual Option:2\n 1.Your Option :"+u1+"\n Actual Option:2\n");
    }
}

public class Online_exam_system{
    public static void main(String []args)
    {
        logA l1=new logA();
        reg rr=new reg();

        Scanner sc=new Scanner(System.in);
        System.out.println("\n Welcome to Online Examination Portal !!!!");
        System.out.println("\n1.Login \n2.SignUp");
        System.out.println("\nEnter your option");
        int r=sc.nextInt();
        if(r==1)
        {
            System.out.println("\n Welcome come back");
            System.out.println("\n ----- Login -----");
            l1.m1();
        }
        else{
            System.out.println("\n ----- SignUp ----");
            rr.r1();
        }
    }
}
