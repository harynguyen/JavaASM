package exercise.exercise5;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("=======ATM Welcome=======");
        System.out.println("Withdraw");
        System.out.println("Deposit");
        System.out.println("Check Balance");
        System.out.println("EXIT PROGRAM");
        System.out.println("========================");
        System.out.print("Enter your choice: ");

        int cast = 90000000, withdraw, deposit;
        int atm = sc.nextInt();

        switch (atm){
            case 1: System.out.print("Enter money to be withdrawn:");
                withdraw = sc.nextInt();
                if(cast >= withdraw)
                {
                    cast = cast - withdraw;
                    System.out.println("Please take your money");
                    int[] money = new int[]{500000, 200000, 100000, 50000};
                    int[] tmp = new int[money.length];
                    for (int i = 0; i < money.length; i++) {
                        while(withdraw >= money[i]){
                            tmp[i]=withdraw/money[i];
                            withdraw-=tmp[i]*money[i];
                        }
                    }
                    for (int i = 0; i < tmp.length; i++) {
                        if (tmp[i] > 0) {
                            System.out.println(tmp[i] + " denominations" +" " + money[i]);
                        }
                    }
                }
                else
                {
                    System.out.println("Your amount is not enough, please enter money again");
                }
                System.out.println("");
                break;
            case 2: System.out.print("Enter money to be deposit:");
                deposit = sc.nextInt();
                cast = deposit + cast;
                System.out.print("Your cast:" + cast);
                break;
            case 3: System.out.print("Check Balance");
                System.out.print("Your current balance is : " + cast);
                break;
            case 4: System.out.print("EXIT PROGRAM");
                break;
            default: System.out.print("Invalid Data, please enter valid from 1 to 4");
                break;
        }
    }
}