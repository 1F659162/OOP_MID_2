import java.util.Scanner;

public class MID2 {

	int num[] ;
	int index ;
	
	public void init() {
		num[0] = 0 ;
		num[1] = 1 ;
		for(int i = 2 ;i < num.length ; i++) {
			num[i] = num[i-1]+num[i-2];
		}
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter index : ");
		index = scan.nextInt();
		if (index >= 2) {
			num = new int[index];
		}else num = new int[2];
		
	}
	
	public void output() {
		System.out.println("Number index [" + (index) + "] : " + num[index-1]);
	}
	
	public static void main(String[] args) {
		MID2 ko = new MID2();
		ko.input();
		ko.init();
		ko.output();	
	}
}