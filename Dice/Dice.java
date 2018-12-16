import java.util.Random;
class Dice {
	public static void main(String[] args) {
		Random random = new Random();
		int count = 0;
		for (int i = 0; i < 100; i++) {
			int rand = random.nextInt(20)+1;
			if (rand == 19) {
				count++;
			}
			System.out.println(rand);
		}
		int pro = (int)((double)count / 100*100);
		System.out.println("score:" + pro + "%");
	}
}
