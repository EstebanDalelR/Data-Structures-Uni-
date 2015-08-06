package Taller;

public class interfazTriqui
{
  public CalculatorUI(){
        calculator = new Calculator();
        sc = new Scanner(System.in);
     }

     private void show(){
        boolean finish = false;
        System.out.println("-----------------------------------------------");
        System.out.println("-                                             -");
        System.out.println("-            Simple Calculator                -");
        System.out.println("-                                             -");
        System.out.print  ("-----------------------------------------------");
        while(finish==false){
          try{
              showMenu();
              System.out.print("Select an option from the menu: ");
              // Read user selected option
              int opt = sc.nextInt();
              // Validate selected option
              if(opt>=1 && opt<=5){
                if(opt == EXIT_OPTION){
                  finish = true;
                } else {
                  handleOption(opt);
                }
              } else {
                System.out.println("Invalid Option. Check the menu and try again.");
              }
          } catch(InputMismatchException ex){
            sc.nextLine();
            System.out.println("The value you entered is invalid.");
            } catch(Exception ex){
            System.out.println("An error occurred while executing the operation. "+ex.getMessage());
          }
        }
     }
     private void showMenu(){
  System.out.println();
  System.out.println("Main Menu: ");
  System.out.println("1. Add");
  System.out.println("2. Subtract");
  System.out.println("3. Multiply");
  System.out.println("4. Divide");
  System.out.println("5. Exit");
  System.out.println("-------------------------------------------------------");
}
     private void handleOption(int opt){
  System.out.print("Enter the first number:");
  int a = sc.nextInt();
  System.out.print("Enter the second number:");
  int b = sc.nextInt();
  switch(opt)
  {
    case 1:
      calculator.add(a,b);
      break;
    case 2:
      calculator.subtract(a,b);
      break;
    case 3:
      calculator.multiply(a,b);
      break;
    case 4:
      calculator.divide(a,b);
      break;
    default :
      throw new RuntimeException("Invalid Option. Check the menu and try again.");
  }
}
System.out.println("-------------------------------------------------------");
System.out.println(" ---> The result of the last operation is: "+calculator.getLasResult());
System.out.println("-------------------------------------------------------");
}