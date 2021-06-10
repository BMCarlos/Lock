package main;

import java.util.Scanner;

public class LockClientDemoClass {
	 public static void main(String[] args) {

	        LockDataStructureClass newLock = new LockDataStructureClass();

	        menu(newLock);
	 }       
	public static void menu(LockDataStructureClass newLock) {

        Scanner scan = new Scanner(System.in);

        int choice, data;

        System.out.println("1: Set lock combination");
        System.out.println("2: Close lock");
        System.out.println("3: Check status");
        System.out.println("4: Attempt to open lock");
        System.out.println("5: Check current dial position");
        System.out.println("6: Exit the program");

        choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Set x: ");
                data = scan.nextInt();
                newLock.setX(data);
                System.out.println("Set y: ");
                data = scan.nextInt();
                newLock.setY(data);
                System.out.println("Set z: ");
                data = scan.nextInt();
                newLock.setZ(data);
                break;
            case 2:
                newLock.toClose();
                break;
            case 3:
                System.out.println(newLock);
                break;
            case 4:
                newLock.toAttempt();
                break;
            case 5:
                System.out.println(newLock.getCurrently());
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid");
        }
        menu(newLock);
    }
}
