import factory.ConcreteFactory1;
import factory.ConcreteFactory2;
import input.VM1;
import input.VM2;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Vending machine version");
        int vmVersion = sc.nextInt();

        switch (vmVersion) {
            case 1:
                VM1 vm1 = new VM1(new ConcreteFactory1());

                System.out.println("Vending Machine-1");
                System.out.println("MENU of Operations");
                System.out.println("0. create(int)");
                System.out.println("1. coin(int)");
                System.out.println("2. sugar()");
                System.out.println("3. tea()");
                System.out.println("4. chocolate()");
                System.out.println("5. insert_cups(int)");
                System.out.println("6. set_price(int)");
                System.out.println("7. cancel()");
                System.out.println("8. card(float)");
                System.out.println("q. Quit the demo program");
                System.out.println("Please make a note of these operations");
                System.out.println("Vending Machine-1 Execution");
                char ch = '0';

                while (ch != 'q') {
                    System.out.println("\nSelect Operation: ");
                    System.out.println("0-create,1-coin,2-sugar,3-tea,4-chocolate,5-insert_cups,6-set_price,7-cancel,8-card");
                    ch = sc.next().charAt(0);
                    switch (ch) {
                        case '0': // create
                            System.out.println("\nOperation: create(int p)");
                            System.out.println("Enter value of parameter p:");
                            vm1.create(sc.nextInt());
                            break;
                        case '1': // coin
                            System.out.println("Operation: coin(int v)");
                            System.out.println("Enter value of parameter v:");
                            vm1.coin(sc.nextInt());
                            break;
                        case '2': // sugar
                            System.out.println("Operation: sugar()");
                            vm1.sugar();
                            break;
                        case '3': // tea
                            System.out.println("Operation: tea()");
                            vm1.tea();
                            break;
                        case '4': // chocolate
                            System.out.println("Operation: chocolate()");
                            vm1.chocolate();
                            break;
                        case '5': // insert_cups
                            System.out.println("Operation: insert_cups(int n)");
                            System.out.println("Enter value of parameter n:");
                            vm1.insert_cups(sc.nextInt());
                            break;
                        case '6': // set_price
                            System.out.println("Operation: set_price(int p)");
                            System.out.println("Enter value of parameter p:");
                            vm1.set_price(sc.nextInt());
                            break;
                        case '7': // cancel
                            System.out.println("Operation: cancel()");
                            vm1.cancel();
                            break;
                        case '8': // card
                            System.out.println("Operation: card(float x)");
                            System.out.println("Enter value of parameter x:");
                            vm1.card(sc.nextFloat());
                            break;
                    }
                }
                break;
            case 2:
                VM2 vm2 = new VM2(new ConcreteFactory2());

                System.out.println("Vending Machine-2");
                System.out.println("MENU of Operations");
                System.out.println("0. CREATE(float p)");
                System.out.println("1. COIN(float v)");
                System.out.println("2. SUGAR()");
                System.out.println("3. CREAM()");
                System.out.println("4. COFFEE()");
                System.out.println("5. InsertCups(int n)");
                System.out.println("6. SetPrice(float p)");
                System.out.println("7. CANCEL()");
                System.out.println("Please make a note of these operations");
                System.out.println("Vending Machine-2 Execution");

                ch = '0';

                while (ch != 'q') {
                    System.out.println("\nSelect Operation: ");
                    System.out.println("0-CREATE\t1-COIN\t2-SUGAR\t3-CREAM\t4-COFFEE\t5-InsertCups\t6-SetPrice\t7-CANCEL");
                    ch = sc.next().charAt(0);
                    switch (ch) {
                        case '0':
                            System.out.println("Operation: CREATE(float p)");
                            System.out.println("Enter value of parameter p:");
                            vm2.CREATE(sc.nextFloat());
                            break;
                        case '1':
                            System.out.println("Operation: COIN(float v)");
                            System.out.println("Enter value of parameter v:");
                            vm2.COIN(sc.nextFloat());
                            break;
                        case '2':
                            System.out.println("Operation: SUGAR()");
                            vm2.SUGAR();
                            break;
                        case '3':
                            System.out.println("Operation: CREAM()");
                            vm2.CREAM();
                            break;
                        case '4':
                            System.out.println("Operation: COFFEE()");
                            vm2.COFFEE();
                            break;
                        case '5':
                            System.out.println("Operation: InsertCups(int n)");
                            System.out.println("Enter value of parameter n:");
                            vm2.InsertCups(sc.nextInt());
                            break;
                        case '6':
                            System.out.println("Operation: SetPrice(float p)");
                            System.out.println("Enter value of parameter p:");
                            vm2.SetPrice(sc.nextFloat());
                            break;
                        case '7':
                            System.out.println("Operation: CANCEL()");
                            vm2.CANCEL();
                            break;
                    }
                }
                sc.close();

        }
    }
}
