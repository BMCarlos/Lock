package main;

public class LockDataStructureClass {
	private final int numEnd = 39;
	private final int numstrt = 0;
	private int x = 0;
	private int y = 0;
	private int z = 0;
	private int current = 0;
	private int count = 0;
	private boolean try1,try2,try3;
	private String status = "Locked";
	
	public LockDataStructureClass() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public LockDataStructureClass(int x, int y, int z) {
	this.x = x;
	this.y = y;
	this.z = z;
	
	}
	//setters
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setZ(int z) {
		this.z = z;
	}
	//methods
	public void toAlter(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void toTurn() {
		System.out.print(current + " ");
        current = numEnd;
        for (int i = 0; i <= 39; i++) {
            System.out.print(current + " ");
            current--;
            if (current == 0) {
                count = 1;
            }
        }current = numEnd;

        for (int i = 0; i <= 39; i++) {
            if (count != 2) {
                System.out.print(current + " ");
                current--;
                if (current == x) {
                    System.out.print(current + " \n");
                    count = 2;
                    this.try1 = true;
                }
            }
        }count = 0;

        while (current <= numEnd) {
            System.out.print(current + " ");
            current++;
        }current = numstrt;

        while (count != 1) {
            System.out.print(current + " ");
            current++;
            if (current == x) {
                System.out.print(current + " ");
                current++;
                count++;
            }
        }
        while (current <= y) {
            System.out.print(current + " ");
            current++;
        }
        if (current == y){
            this.try2 = true;
         }current--;
        System.out.println();
        while ( current != z){
            System.out.print(current + " ");
            current--;
        }
        if(current == z)
            System.out.print(current + "\n");
            this.try3 = true;
	}
	
	public void toClose() {
		this.status = "Locked";
	}
	
	public void toAttempt() {
		 toTurn();
	        if (!toInquire(try1,try2,try3)) {
	            System.out.println("failed");
	            this.status = "Locked";
	        } else {
	            System.out.println("Success");
	            this.status = "Unlocked";
	        }
	        
	}
	
	public boolean toInquire(boolean try1, boolean try2, boolean try3) {
		 if (try1||try2||try3) {
	            this.status = "Locked";
	            return true;
	        }else{
	            this.status = "Unlocked";
	            return false;
	        }
	}
	
	public int getCurrently() {
		return current;
	}
	
	public String toString() {
		return "Lock is: " + status;
	}
	
}