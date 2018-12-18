import java.util.Random;
import java.util.Scanner;
class Jan {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		boolean check = true;
		while(check) {
			int pan = rand.nextInt(3);
			System.out.print("数値を入力(0:グー, 1:チョキ, 2:パー):");
			String pon = scan.nextLine();
			switch(pon) {
				case "0":
					switch(pan) {
						case 0:
							System.out.println("computer is グー");
							System.out.println("あいこ。もう一度");
							break;
						case 1:
							System.out.println("computer is チョキ");
							System.out.println("player win!!");
							check = false;
							break;
						case 2:
							System.out.println("computer is パー");
							System.out.println("you lose");
							check = false;
							break;
						default:
							System.out.println("error");
					}
				break;
				case "1":
					switch(pan) {
						case 0:
							System.out.println("computer is グー");
							System.out.println("you lose");
							check = false;
							break;
						case 1:
							System.out.println("computer is チョキ");
							System.out.println("引き分け。もう一度");
							break;
						case 2:
							System.out.println("computer is パー");
							System.out.println("player win");
							check = false;
							break;
						default:
							System.out.println("error");
					}
				break;
				case "2":
					switch(pan) {
						case 0:
							System.out.println("computer is グー");
							System.out.println("player win!!");
							check = false;
							break;
						case 1:
							System.out.println("computer is チョキ");
							System.out.println("you lose");
							check = false;
							break;
						case 2:
							System.out.println("computer is パー");
							System.out.println("引き分け。もう一度");
							break;
						default:
							System.out.println("error");
					}
				break;
				default:
					System.out.println("error");
			}
		}
	}
}
