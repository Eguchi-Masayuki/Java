package suiyoueki;
public class Main {

public static void main(String[] args){
		int cont=1;
		int count=0;
		int answer=0;
		String level;
		while(cont==1) {
			Test.rand();
			System.out.println("どのレベルを出力しますか?(1,2,3-1,3-2,4-1,4-2)");
			level=new java.util.Scanner(System.in).nextLine();
			Test.doc(count,level);
			System.out.println("答えを出力しますか?(Yes->1,No->0)");
			answer=new java.util.Scanner(System.in).nextInt();
			Test.ans(count, answer);
			System.out.println("続けますか?(Yes->1,No->0)");
			cont=new java.util.Scanner(System.in).nextInt();
			count++;
		}
	}
}
