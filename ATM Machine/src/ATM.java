import java.time.LocalDateTime;
import java.util.*;
 class Hert{

	protected int AccountBalance;
	protected String BankName;
	protected int AccountNumber;
	protected String AccountType;
	protected String AccountName;
	protected int Fastcash=0;
	protected int pin=2003;
	
	LinkedList<Integer> statementcreate= new LinkedList<>();
	
public void Addfastcash(int a){
	
	Fastcash=+a;
}

public void Balfastcash(){
	System.out.println("Your FastCash Balance is ="+Fastcash);
}

public void Withfastcash(){
	System.out.println("Enter amount  ");
	Scanner o= new Scanner(System.in);
	int a=o.nextInt();
	Fastcash-=a;
	statementcreate.add(-a);
	System.out.println("You have successfully withdraw money Rs " + a
            + " \nNow your balance is " +Fastcash );
}

public void Statement() {
	Iterator itr=statementcreate.iterator();
	LocalDateTime date = LocalDateTime.now();
	System.out.println("Genrated Mini Statement......."+date);
	while(itr.hasNext()) {
		System.out.println();

		System.out.print(itr.next());
		System.out.print("/-Rs......."+date);
	}
}

public int BalanceInquiry () {
	LocalDateTime myObj = LocalDateTime.now(); // Create a date object
    System.out.println(myObj); 
	System.out.println("Your Balance is ="+AccountBalance);
	return AccountBalance;
}

public int UtilityBillPayment(){
	System.out.println("1.LightBill Payments\n2.GasBill Payment");
    Scanner o= new Scanner(System.in);
	int opt=o.nextInt();
    if(opt==1) {
    	 System.out.println("1.Enter light bill number and amount");
    	 Scanner u= new Scanner(System.in);
    	 int lightBillnum=u.nextInt();
    	 int billpayment=u.nextInt();
    	 if(billpayment<=AccountBalance) {
    	 System.out.println("1.confirm\n2.cancel");
    	 Scanner con= new Scanner(System.in);
    	 int conf=con.nextInt();
    	 
    	 if(conf==1) {
    		PinCheck();
    	 AccountBalance-=billpayment;
    	 System.out.println("You have successfully pay your lightbill No."+lightBillnum+" with Rs " + billpayment
                    + " \nNow your balance is " +AccountBalance );
    	 statementcreate.add(billpayment);
    	 
    	 
    	
    	 }
    	 else if(conf==2) {
    		 System.err.println("Payment cancel......");
    	 }}
    	 else {
    	 System.err.println("your account balance is lessthan billpayment");
     	 }
    }
    else if(opt==2) {
    	 System.out.println("1.Enter gas bill number and payment");
    	 Scanner qo= new Scanner(System.in);
    	 int gasBillnum=qo.nextInt();
    	 int gasbillpayment=qo.nextInt();
    	 if(gasbillpayment<=AccountBalance) {
    	 System.out.println("1.confirm\n2.cancel");
    	 Scanner con= new Scanner(System.in);
    	 int conf=con.nextInt();
    	 
    	 if(conf==1) {PinCheck();

    	 AccountBalance-=gasbillpayment;
    	 System.out.println("You have successfully pay your gasbill No."+gasBillnum+" with Rs " + gasbillpayment
                    + " \nNow your balance is " +AccountBalance );
    	 statementcreate.add(gasbillpayment);
    	 
    }
    	 else if(conf==2) {
    		 System.err.println("Payment cancel......");
    	 }}
    	 else {
    		 System.err.println("your account balance is lessthan billpayment");
    		 
    		 
    		 
    	 } }return AccountBalance;}
    
public void OtherService() {
	System.out.println("1.Near Bank Branch\n2.Contact No\n3.Help Protect Yourself at the ATM");
    Scanner other= new Scanner(System.in);
    int oth= other.nextInt();
    if(oth==1) {
    	System.out.println("Bank of Maharashtra\n\n"+"\r\n"
    			+ "No 25, Ayurved Rasashala Building\r\n"
    			+ "Karve Road\r\n"
    			+ "Pune - 411004");
    	
    }
    else if(oth==2) {
    	System.out.println("Phone No.\r\n"
    			+ "18002334526");
    	
    }
    else if(oth ==3) {
    	System.out.println("Keep your personal identification number (PIN) just that - personal. Never write it down or share it with anyone - not even family members. It's also a good idea to update your PIN number once a year to keep it fresh.\r\n"
    			+ "Be aware of your surroundings, particularly at night. If you see any suspicious activity, like a person waiting a few feet away or if there aren't any lights around, avoid using that machine and find another in a more public area.\r\n"
    			+ "Bring someone with you when using an ATM. If you can't find a buddy, use an ATM that is located in a public area like a convenience or grocery store. This way, store personnel are there to help and you'll have the video surveillance from both the store and the bank.\r\n"
    			+ "Have your debit card ready to go as you approach the ATM. If you need to search through your purse or wallet, you'll give criminals more of a chance to catch you off guard.\r\n"
    			+ "Use your body to “shield” the ATM keyboard as you enter your PIN. If someone seems to be lingering behind you, walk away and come back later.\r\n"
    			+ "Always take your receipts or transaction records with you. This will avoid any of your personal information getting into the wrong hands.\r\n"
    			+ "Do not count or visually display any money you received from the ATM. After taking your money out of the ATM, immediately place the cash in your purse or wallet, and count it later.\r\n"
    			+ "If you're using a drive-up ATM, be sure passenger windows are rolled up and all doors are locked. If you leave your car and walk to the ATM, lock your car. It can also help to turn down the radio so you can be more alert.\r\n"
    			+ "Check the ATM for a card skimmer. A card skimmer is a device attached to the payment terminal of an ATM that is used to steal your card information when inserting your card to withdraw money. You can often spot a card skimmer with your own inspection. If the card reader slot feels loose or is oddly a different color scheme than the bank's branding, or the keyboard doesn't feel right (too thick, buttons don't press easily, etc.), these are often signs that a skimmer is in place.");
    }
    else {
    	System.err.println("You enter wrong option");  
    }
}

public int CashWihtdraw() {
	System.out.println("Enter amount  ");  
    Scanner qw=new Scanner(System.in);
    int amount12=qw.nextInt();
    if( AccountBalance>amount12) {
    	System.out.println("1.confirm\n2.cancel");
    	if(qw.nextInt()==1) {
    		PinCheck();
    AccountBalance-=amount12;
    System.out.println("You withdraw "+amount12+" your remaining balance is "+AccountBalance);
    statementcreate.add(amount12);}
    	else{System.err.println("Payment cancel......");
    		}    	}
    else {
    	System.err.println("You doesn't have sufficient balance");
    }
    return AccountBalance; 
}
	
public void PinCheck() {
	System.out.println("Enter ATM pin.... ");
	Scanner in=new Scanner(System.in);
	int check=in.nextInt();
	if(pin==check) {
		System.out.println("Pin is correct");
	}
	else {
		 throw new ArithmeticException("Pin is wrong");   
		
	}


}
	
public int FastCash() {
	System.out.println("Enter amount  ");  
Scanner qw=new Scanner(System.in);
int amount12=qw.nextInt();
if( AccountBalance>=amount12) {
	System.out.println("1.confirm\n2.cancel");
	if(qw.nextInt()==1) {PinCheck();
AccountBalance-=amount12;
Addfastcash(+amount12);
System.out.println("You added "+amount12+" to your fast cash wallet and your remaining balance is "+AccountBalance);
statementcreate.add(+amount12);}
else{System.err.println("Payment cancel......");}}
else {
	System.err.println("You doesn't have sufficient balance");
}return AccountBalance;
}
	
public int FundTransfer()
 {
	 System.out.println("1.Enter Account Number and amount");
	 Scanner u= new Scanner(System.in);
	 int lightBillnum=u.nextInt();
	 int billpayment=u.nextInt();
	 if(billpayment<=AccountBalance) {
	 System.out.println("1.conform\n2.cancel");
	 Scanner con= new Scanner(System.in);
	 int conf=con.nextInt();
	 
	 if(conf==1) {PinCheck();
	 AccountBalance-=billpayment;
	 System.out.println("You have successfully Tranfer Fund Your To Account No."+lightBillnum+" with Rs " + billpayment
               + " \nNow your balance is " +AccountBalance );
	 statementcreate.add(billpayment);
	
	 }
	 else if(conf==2) {
		 System.err.println("Payment cancel......");
	 }}
	 else {
	 System.err.println("your account balance is lessthan billpayment");
	 }return AccountBalance;
	
}

}


public class ATM extends Hert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Hert h=new Hert();
		h.AccountBalance=7777;
		h.AccountName="Pravin Devakate";
		h.AccountNumber=2424252;
		h.AccountType="Savings";
		h.BankName="Bank of Maharastra";
		h.PinCheck();
		// TODO Auto-generated method stub
				System.out.println("---------------------------------------Bank Of Maharastra ATM service------------------------------------");
				System.out.println("--------------------------------------------------------------------------------------");
				System.out.println("----------------------------------------------------------------------");
				System.out.println("------------------------------------------------");
				
		
		
		while(true){

			 System.out.println("\n1.Balance Inquiry\n2.Utility Bill Payment\n3.Other Service\n4.Add Money In Fast cash\n5.Withdraw money from Fastcash \n6.Check Fast cash Ballance\n7.Cash Withdraw\n8.Fund Transfer\n9.mini Statement\n10.Account Details\n11.exit");
Scanner opt=new Scanner(System.in);
int a=opt.nextInt();

switch(a) {

case 1:
	h.BalanceInquiry(); 
	 
break;  
case 2:
	h.UtilityBillPayment();
break; 
case 3: h.OtherService();
break;
case 4:h.FastCash();
break;
case 5:  h.Withfastcash();
break;
case 6:  h.Balfastcash();
break;
case 7:  h.CashWihtdraw();
break;
case 8:h.FundTransfer() ;
break;
case 9:h.Statement();
break;
case 10:
	System.out.println("------------------------------------"+h.BankName+"------------------------------------");
	System.out.println("Account name is =  "+h.AccountName+"\n"+"Account number is =  "+h.AccountNumber+"\n"+"Account Balance is =  "+h.AccountBalance+"\nAccount Type = "+h.AccountType);
	
	break;
case 11:
	System.out.println("Thankyou for using our service");
System.exit(0);
break;

	}}

	}}
