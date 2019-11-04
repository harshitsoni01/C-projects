import java.util.*;

class Menu

{

Scanner sc=new Scanner(System.in);

int ch,i,c;

String ch1;

String cartitem[];

int cartquantity[];

double cartprice[],total;

Menu()

{

  i=0;

  total=0;

  cartitem=new String[100];

  cartprice=new double[100];

  cartquantity=new int[100];

}

void choosing()

{

do

 {

  System.out.println("\n\n\t\t   *** WELCOME TO PH GATHER ONLINE SHOPPING SITE ***  ");

  System.out.println("\t\tENTER THE CHOICE OF ITEM THAT YOU'RE LOOKING FOR, MAXIMUM 50 ITEMS CAN BE BOUGHT AT A TIME");

  System.out.println("\t\t\t ITEM \t PRICE");

  System.out.println("\t\t\t 1.PHONES\t $1200 \n\t\t\t 2.LAPTOP\t $8000 \n\t\t\t 3.SMARTWATCH\t $200 \n\t\t\t 4.I don't want anything, I want to checkout");

  ch=sc.nextInt();

  switch(ch)

  {

   case 1: System.out.println("Do you want to add this item to the cart?");

    System.out.println("Enter yes or no");

    ch1=sc.next();

    ch1=ch1.toLowerCase();

    if(ch1.equals("yes"))

    {

     System.out.println("Enter the quantity");

     cartquantity[i]=sc.nextInt();

     cartprice[i]=1200*cartquantity[i];

     cartitem[i]="Phones";

     i++;

     System.out.println("Do you want to  1:CONTINUE SHOPPING\n\t\t2:PROCEED TO CHECKOUT");

     c=sc.nextInt();

    }

    else

    {

     System.out.println("Do you want to  1:CONTINUE SHOPPING\n\t\t2:PROCEED TO CHECKOUT");

     c=sc.nextInt();

    }

    break;



   case 2: System.out.println("Do you want to add this to the cart?");

    System.out.println("Enter yes or no");

    ch1=sc.next();

    ch1=ch1.toLowerCase();

    if(ch1.equals("yes"))

    {

     System.out.println("Enter the quantity");

     cartquantity[i]=sc.nextInt();

     cartprice[i]=8000*cartquantity[i];

     cartitem[i]="Laptop";

     i++;

     System.out.println("Do you want to  1:CONTINUE SHOPPING\n\t\t2:PROCEED TO CHECKOUT");

     c=sc.nextInt();

    }

    else

    {

     System.out.println("Do you want to  1:CONTINUE SHOPPING\n\t\t2:PROCEED TO CHECKOUT");

     c=sc.nextInt();

    }

    break;

  

   case 3: System.out.println("Do you want to add this to the cart?");

    System.out.println("Enter yes or no");

    ch1=sc.next();

    ch1=ch1.toLowerCase();

    if(ch1.equals("yes"))

    {

     System.out.println("Enter the quantity");

     cartquantity[i]=sc.nextInt();

     cartprice[i]=200*cartquantity[i];

     cartitem[i]="Smartwatch";

     i++;

     System.out.println("Do you want to  1:CONTINUE SHOPPING\n\t\t2:PROCEED TO CHECKOUT");

     c=sc.nextInt();

    }

    else

    {

     System.out.println("Do you want to  1:CONTINUE SHOPPING\n\t\t2:PROCEED TO CHECKOUT");

     c=sc.nextInt();

    }

    break;

   case 4: c=2;

    break;

   default: System.out.println("Choice doesn't exist");

  }

  if (c==2)

  {

   break;

  }

}while(1>0);

}

}

class Bill extends Menu

{

 Scanner sc=new Scanner(System.in);

void calculate()

{

  super.choosing();

  double tax=0,discount=0;

  int choice;

  for(int j=0;j<super.i;j++)

  {

   super.total+=super.cartprice[j];

  }

  if(super.total<2000)

  {

   System.out.println("\t*** Shop for $"+(2000-super.total)+" more and get a 20% discount!! ***");

   System.out.println("Do you want to  1:CONTINUE SHOPPING\n\t\t2:PROCEED TO CHECKOUT");

   System.out.println("\t\tEnter choice:");

   choice=sc.nextInt();

   if(choice==1)

     {super.choosing();

     }

   for(int j=0;j<super.i;j++)

   {

    super.total+=super.cartprice[j];

   }

  }

 

  super.total=0;

  System.out.println("\n\t\t\t *** BILL *** ");

  System.out.println("\t\tITEM \t\tQUANTITY \tPRICE ");

  for(int j=0;j<super.i;j++)

  {

   super.total+=super.cartprice[j];

   System.out.println("\t\t"+cartitem[j]+"\t\t"+ cartquantity[j]+ "\t\t" + cartprice[j]);

  }

  if(super.total>=2000)

  {

   discount=0.2*super.total;

  }

  tax=0.025*(super.total-discount);

  System.out.println("\n\n\t\tTOTAL BEFORE DISCOUNT:$"+super.total);

  System.out.println("\t\tDISCOUNT:$"+discount);

  System.out.println("\t\tTOTAL AFTER DISCOUNT:$"+(super.total-discount));

  System.out.println("\t\tGST:$"+tax);

  System.out.println("\t\tGRAND TOTAL:$"+(super.total-discount+tax));

  System.out.println("\t\tThank you for shopping with us. Visit again :)");

}

}

public class Project

{

public static void main(String h[])

{

 

  Bill obj2=new Bill();

  obj2.calculate();

}

}