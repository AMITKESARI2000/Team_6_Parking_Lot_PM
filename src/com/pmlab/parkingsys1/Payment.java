import java.util.Scanner;

public class payment implements CallMenu {
    //to know the method of payment
    Scanner scan = new Scanner(System.in);
    public void paymentMethod(){
        System.out.println("you can pay in 3 ways");
        String[] functions = new String[]{"cash", "debit / creditcard", "pay to attender","pay from your premium account", "exit"};
        for (int i = 0; i < functions.length; i++) {
            System.out.println(i + 1 + ": " + functions[i]);
        }
        private int option1 = scan.nextInt();
        functionInvoker(option1);

    }
     @Override
	    public void showMenu(){
            System.out.println("welcome to the payment counter");
            System.out.println("your bill"+getbill());
            String[] where = new String[]{"pay at floor customerinfo", "pay at exitgate","exit"};
            for (int i = 0; i < where.length; i++)
            {
                System.out.println(i + 1 + ": " + where[i]);
            }
            private int option=scan.nextInt();
            if(option==1||option==2){
               paymentMethod();
            }
            if(option==3){
                return;
            }
        }
     @Override
    public void functionInvoker(int option1) {
        switch (option1) {
            //Add different functions below
            case 1: {
                System.out.println("you paid "+getbill());

                break;
            }
            case 2: {
                System.out.println(getbill()+"rupees has been deducted from your credit card");
            }
                break;
            }
            case 3: {
            System.out.println(getbill()+"rupees should be paid to our attender");

                break;
            }
        case 4: {
            if(getAccountBalance()>=getbill()) {
            System.out.println(getbill()+"rupess has been deducted from your premium account");
            setAccountBalance(getAccountBalance()-getbill());
            }
            else
            {
                if(getAccountBalance>0){
                    System.out.println("yo have to pay"+(getbill()-getAccountBalance()));
                    System.out.println("remaining amount will be deducted from your premium account balance");
                    setAccountBalance(0);
                }
                else if(getAccountBalance()==0){
                    System.out.println("your acc balance is 0 please choose another payment option");

                    paymentMethod();
                }
            }
            break;
        }



        case 5: {
                System.exit(0);
                break;
            }

            default:
                System.out.println("Choose correctly");
        }


    }

