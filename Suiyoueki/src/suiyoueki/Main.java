package suiyoueki;
public class Main {

public static void main(String[] args){
		int cont=1; //プログラムの繰り返しを扱う変数
		int count=0; //プログラムの実行回数
		int answer=0; //答えの出力を扱う変数
		String level; //問題のレベルを扱う変数
		while(cont==1) {
			Test.rand(); //問題を作成する変数をランダムにリフレッシュ
			System.out.println("どのレベルを出力しますか?(1,2,3-1,3-2,4-1,4-2)");
			level=new java.util.Scanner(System.in).nextLine(); //問題レベルの読み込み
			Test.doc(count,level); //問題の生成
			System.out.println("答えを出力しますか?(Yes->1,No->0)");
			answer=new java.util.Scanner(System.in).nextInt(); //答えを出力するか判定
			Test.ans(count, answer); //答えを出力
			System.out.println("続けますか?(Yes->1,No->0)");
			cont=new java.util.Scanner(System.in).nextInt(); //プログラムを続行するか判定
			count++; //countをインクリメント
		}
	}
}
