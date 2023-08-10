// Simple Banking Application Project

// Simple Banking Application is a simple Java project for beginners to start their career in
// coding. You’ll learn about Scanner class to take inputs, and the basics of strings, loops,
// methods, and conditional statements. Here, simple banking operations like deposit,
// withdrawal, checking balance, exit, etc.

// Abstract: In this modernized world, where time is money, everyone has got the habit of
// doing their tasks online. Within a click, a task is done. You get this application to make
// transactions just by sitting in your comfort zone. Every operation like money transfer and
// balance inquiry can be done in seconds.

// Technologies Required: Java Programming Language, Oracle Database (if needed), and Java methods
// Operations to perform - login, depositing money, withdrawing money, checking account balance, and exiting the application.




import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class SimpleBankingApp {
    int time_debit_index=0 , time_credit_index=0 ;
    int date_debit_index=0 , date_credit_index=0 ;

    String[] Debited_Amount_Transaction_Date = new String[99];
    String[] Debited_Amount_Transaction_Time = new String[99];

    String[] Credited_Amount_Transaction_Date = new String[99];
    String[] Credited_Amount_Transaction_Time = new String[99];
    

    


    void Debit_Date_and_Time(){
        LocalDateTime now = LocalDateTime.now(); 
        LocalDateTime now1 = LocalDateTime.now(); 
        DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
        String formattedDate = now.format(dateformatter); 
        Debited_Amount_Transaction_Date[date_debit_index]=formattedDate;
        date_debit_index++;

        DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HH:mm:ss"); 
        String formattedTime = now1.format(timeformatter); 
        Debited_Amount_Transaction_Time[time_debit_index]=formattedTime;
        time_debit_index++;
    }
    void Credit_Date_and_Time(){
        LocalDateTime now = LocalDateTime.now(); 
        LocalDateTime now1 = LocalDateTime.now(); 
        DateTimeFormatter dateformatter = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
        String formattedDate = now.format(dateformatter); 
        Credited_Amount_Transaction_Date[date_credit_index]=formattedDate;
        date_credit_index++;

        DateTimeFormatter timeformatter = DateTimeFormatter.ofPattern("HH:mm:ss"); 
        String formattedTime = now1.format(timeformatter); 
        Credited_Amount_Transaction_Time[time_credit_index]=formattedTime;
        time_credit_index++;
    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Name : Devendra Singh");
        System.out.println("URN  : 2022-B-09072004C");
        System.out.println("Project : Simple Banking Application");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        SimpleBankingApp sba = new SimpleBankingApp();
        int Total_Transactions = 0;
        double Total_Balance = 0;
        int choice;
        int debit_index=0 , credit_index=0 ;
        double[] Debited_Amount_Transaction = new double[99];
        double[] Credited_Amount_Transaction = new double[99];
        Scanner s = new Scanner(System.in);

        String Login_ID;
        String Password;
        do{
        System.out.print("LOGIN ID : ");              // ID INPUT
        Login_ID = s.next();
        System.out.print("PASSWORD : ");             // PASSWORD INPUT
        Password = s.next();
        

        if(Login_ID.equals("7465") && Password.equals("dev")){          // IF ID PASS MATCH 
            do {
                System.out.println("|--------- MENU ----------|");
                System.out.println("| 1. DEPOSIT (Credit)     |");
                System.out.println("| 2. WITHDRAW (Debit)     |");
                System.out.println("| 3. CHECK BALANCE        |");
                System.out.println("| 4. TRANSACTION HISTORY  |");
                System.out.println("| 5. LOGOUT               |");
                System.out.println("|-------------------------|");
                System.out.print("ENTER YOUR CHOICE : ");
                choice = s.nextInt();


                if(choice==1){
                    System.out.print("ENTER AMOUNT WHICH YOU WANT TO DEPOSIT : $");
                    double Depost_Amount = s.nextDouble();
                    if(Depost_Amount>0){
                        Total_Balance = Total_Balance + Depost_Amount;
                        System.out.println("YOUR TOTAL BALANCE : $"+Total_Balance);
                        
                        Total_Transactions++;
                        Debited_Amount_Transaction[debit_index] = Depost_Amount;
                        debit_index++;
                        sba.Debit_Date_and_Time();
                        
                    }
                    else{
                        System.out.println("INVALID AMOUNT");
                    }


                }
                
                else if(choice==2){
                    System.out.println("YOUR TOTAL BALANCE : $"+Total_Balance);
                    System.out.print("ENTER AMOUNT WHICH YOU WANT TO WITHDRAW : $");
                    double Withdraw_Amount= s.nextDouble();
                    if(Withdraw_Amount<=Total_Balance){
                        Total_Balance = Total_Balance - Withdraw_Amount;
                        System.out.println("YOUR CURRENT BALANCE : $"+Total_Balance);
                        Total_Transactions++;
                        Credited_Amount_Transaction[credit_index] = Withdraw_Amount;
                        credit_index++;
                        sba.Credit_Date_and_Time();
                    }
                    else{
                        System.out.println("INSUFFICIENT BALANCE");
                    }
                }

                else if(choice==3){
                    System.out.println("YOUR TOTAL BALANCE : $"+Total_Balance);
                }

                else if(choice==4){


                    int length_debited = sba.Debited_Amount_Transaction_Date.length + sba.Debited_Amount_Transaction_Time.length + Debited_Amount_Transaction.length;
                    String Debited_Transaction_List[] = new String[length_debited];
                    for(int i = 0; i < sba.Debited_Amount_Transaction_Date.length; i++){
                        Debited_Transaction_List[i] = sba.Debited_Amount_Transaction_Date[i];
                    }
                    for(int i = 0; i < sba.Debited_Amount_Transaction_Time.length; i++){
                        Debited_Transaction_List[i + sba.Debited_Amount_Transaction_Date.length] = sba.Debited_Amount_Transaction_Time[i];
                    }
                    for(int i = 0; i < Debited_Amount_Transaction.length; i++){
                        Debited_Transaction_List[i + sba.Debited_Amount_Transaction_Date.length + sba.Debited_Amount_Transaction_Time.length] = Double.toString(Debited_Amount_Transaction[i]);
                    }
                    int halfLength1 = Debited_Transaction_List.length / 3;
                    String[] concatenatedList1 = new String[halfLength1];
                    for (int i = 0; i < halfLength1; i++) {
                        concatenatedList1[i] = "| "+(Debited_Transaction_List[i])+" | " + (Debited_Transaction_List[i + halfLength1]) +" | Credited | + $" + (Debited_Transaction_List[i + halfLength1 + halfLength1]);
                    }
                    // System.out.println(Arrays.toString(concatenatedList1));

                    int length_credited = sba.Credited_Amount_Transaction_Date.length + sba.Credited_Amount_Transaction_Time.length + Credited_Amount_Transaction.length;
                    String Credited_Transaction_List[] = new String[length_credited];
                    for(int i = 0; i < sba.Credited_Amount_Transaction_Date.length; i++){
                        Credited_Transaction_List[i] = sba.Credited_Amount_Transaction_Date[i];
                    }
                    for(int i = 0; i <sba.Credited_Amount_Transaction_Time.length; i++){
                        Credited_Transaction_List[i + sba.Credited_Amount_Transaction_Date.length] = sba.Credited_Amount_Transaction_Time[i];
                    }
                    for(int i = 0; i < Credited_Amount_Transaction.length; i++){
                        Credited_Transaction_List[i + sba.Credited_Amount_Transaction_Date.length + sba.Credited_Amount_Transaction_Time.length] = Double.toString(Credited_Amount_Transaction[i]);
                    }
                    int halfLength2 = Credited_Transaction_List.length / 3;
                    String[] concatenatedList2 = new String[halfLength2];
                    for (int i = 0; i < halfLength2; i++) {
                        concatenatedList2[i] = "| "+(Credited_Transaction_List[i])+" | " + (Credited_Transaction_List[i + halfLength2]) +" | Debited  | - $" + (Credited_Transaction_List[i + halfLength2 + halfLength2]);
                    }
                    // System.out.println(Arrays.toString(concatenatedList2));
                    
                    String Final_Transaction_List[] = new String[concatenatedList1.length + concatenatedList2.length];
                    for(int i = 0; i < concatenatedList1.length; i++){
                        Final_Transaction_List[i] = concatenatedList1[i];
                    }
                    for(int i = 0; i < concatenatedList2.length; i++){
                        Final_Transaction_List[i + concatenatedList1.length] = concatenatedList2[i];
                    }
                    Arrays.sort(Final_Transaction_List);
                    // System.out.println(Arrays.toString(Final_Transaction_List));
                    System.out.println();
                    System.out.println("TOTAL TRANSACTIONS : "+Total_Transactions);
                    System.out.println("|------------------------------------------------------|");
                    System.out.println("|    DATE    |   TIME   | Dr / Cr  |       AMOUNT      |");
                    System.out.println("|------------------------------------------------------|");
                    for (int i = 0; i < (debit_index+credit_index); i++) {
                        System.out.printf("%-55s|\n",Final_Transaction_List[i]);
                    }
                    System.out.println("|------------------------------------------------------|");
                    System.out.println("YOUR TOTAL BALANCE : $"+Total_Balance);
                    System.out.println();


                }


            }while (choice != 5);
            System.out.println("\nTHANK YOU FOR USING THIS CODE");
            System.out.println("LOGGED OUT SUCCESSFULLY");
            break;
        }

        else{
            System.out.println();
            System.out.println("INVALID ID PASSWORD PLEASE TRY AGAIN");
            System.out.println();
        }
        }
        while(true);
        
    }
}