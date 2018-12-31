package suiyoueki;

import java.io.FileWriter;

public class Test {
	static String[][] sui= {{"塩酸","塩化水素","気体","酸性","ある","よく通す"},{"酢酸水溶液","酢酸","液体","酸性","ある","通す"},
			{"炭酸水","二酸化炭素","気体","酸性","ない","通す"},{"ほう酸水","ほう酸","固体","酸性","ない","通す"},
			{"食塩水","食塩","固体","中性","ない","よく通す"},{"アルコール水","アルコール","液体","中性","ある","通さない"},
			{"さとう水","さとう","固体","中性","ない","通さない"},{"水酸化ナトリウム水溶液","水酸化ナトリウム","固体","アルカリ性","ない","よく通す"},
			{"石灰水","消石灰","固体","アルカリ性","ない","通す"},{"アンモニア水","アンモニア","気体","アルカリ性","ある","通す"}};//水溶液の情報を格納
	static int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10; //問題をランダムにするための変数

	//乱数を生成するrandメソッド
	static void rand() {
		n1=new java.util.Random().nextInt(10);
		n2=n1;
		while(n2==n1){
			n2=new java.util.Random().nextInt(10);
		}
		n3=n2;
		while(n3==n1||n3==n2){
			n3=new java.util.Random().nextInt(10);
		}
		n4=n3;
		while(n4==n1||n4==n2||n4==n3){
			n4=new java.util.Random().nextInt(10);
		}
		n5=n4;
		while(n5==n1||n5==n2||n5==n3||n5==n4){
			n5=new java.util.Random().nextInt(10);
		}
		n6=n5;
		while(n6==n1||n6==n2||n6==n3||n6==n4||n6==n5){
			n6=new java.util.Random().nextInt(10);
		}
		n7=n6;
		while(n7==n1||n7==n2||n7==n3||n7==n4||n7==n5||n7==n6){
			n7=new java.util.Random().nextInt(10);
		}
		n8=n7;
		while(n8==n1||n8==n2||n8==n3||n8==n4||n8==n5||n8==n6||n8==n7){
			n8=new java.util.Random().nextInt(10);
		}
		n9=n8;
		while(n9==n1||n9==n2||n9==n3||n9==n4||n9==n5||n9==n6||n9==n7||n9==n8){
			n9=new java.util.Random().nextInt(10);
		}
		n10=n9;
		while(n10==n1||n10==n2||n10==n3||n10==n4||n10==n5||n10==n6||n10==n7||n10==n8||n10==n9){
			n10=new java.util.Random().nextInt(10);
		}
	}
	//問題を生成するdocメソッド
	static void doc(int cont,String lev) {
		switch(lev) {
		//mainメソッドでの変数levelによって条件分岐
		case "1":
			try{
				FileWriter fout=new FileWriter("Mondai_Level1_"+cont+".doc");
				fout.write("\t"+"溶けている物質"+"\t"+"状態"+"\t"+"性質"+"\t"+"におい"+"\t"+"電気"+"\n");
				fout.write(sui[n1][0]+"\t"+"\t"+sui[n1][2]+"\t"+sui[n1][3]+"\t"+"\t"+sui[n1][5]+"\n");
				fout.write("\t"+sui[n2][1]+"\t"+sui[n2][2]+"\t"+sui[n2][3]+"\t"+"\t"+sui[n2][5]+"\n");
				fout.write(sui[n3][0]+"\t"+sui[n3][1]+"\t"+"\t"+sui[n3][3]+"\t"+sui[n3][4]+"\t"+"\n");
				fout.write("\t"+sui[n4][1]+"\t"+"\t"+sui[n4][3]+"\t"+sui[n4][4]+"\t"+sui[n4][5]+"\n");
				fout.write(sui[n5][0]+"\t"+"\t"+sui[n5][2]+"\t"+sui[n5][3]+"\t"+sui[n5][4]+"\t"+"\n");
				fout.write("\t"+sui[n6][1]+"\t"+"\t"+sui[n6][3]+"\t"+"\t"+sui[n6][5]+"\n");
				fout.write(sui[n7][0]+"\t"+"\t"+"\t"+"\t"+sui[n7][4]+"\t"+sui[n7][5]+"\n");
				fout.write("\t"+sui[n8][1]+"\t"+sui[n8][2]+"\t"+"\t"+sui[n8][4]+"\t"+"\n");
				fout.write(sui[n9][0]+"\t"+"\t"+sui[n9][2]+"\t"+"\t"+"\t"+sui[n9][5]+"\n");
				fout.write(sui[n10][0]+"\t"+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.close();
				}catch (Exception e){
				System.out.println(e); //例外処理
				}
			break;
		case "2":
			try{
				FileWriter fout=new FileWriter("Mondai_Level2_"+cont+".doc");
				fout.write("\t"+"溶けている物質"+"\t"+"状態"+"\t"+"性質"+"\t"+"におい"+"\t"+"電気"+"\n");
				fout.write(sui[n1][0]+"\t"+"\t"+sui[n1][2]+"\t"+"\t"+"\t"+"\n");
				fout.write("\t"+sui[n2][1]+"\t"+sui[n2][2]+"\t"+"\t"+"\t"+sui[n2][5]+"\n");
				fout.write(sui[n3][0]+"\t"+"\t"+"\t"+"\t"+sui[n3][4]+"\t"+"\n");
				fout.write("\t"+sui[n4][1]+"\t"+"\t"+"\t"+"\t"+sui[n4][5]+"\n");
				fout.write(sui[n5][0]+"\t"+"\t"+sui[n5][2]+"\t"+"\t"+sui[n5][4]+"\t"+"\n");
				fout.write("\t"+sui[n6][1]+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write(sui[n7][0]+"\t"+"\t"+"\t"+"\t"+sui[n7][4]+"\t"+sui[n7][5]+"\n");
				fout.write("\t"+sui[n8][1]+"\t"+"\t"+"\t"+sui[n8][4]+"\t"+"\n");
				fout.write(sui[n9][0]+"\t"+"\t"+sui[n9][2]+"\t"+"\t"+"\t"+sui[n9][5]+"\n");
				fout.write(sui[n10][0]+"\t"+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.close();
				}catch (Exception e){
				System.out.println(e); //例外処理
				}
			break;
		case "3-1":
			try{
				FileWriter fout=new FileWriter("Mondai_Level3-1_"+cont+".doc");
				fout.write("\t"+"溶けている物質"+"\t"+"状態"+"\t"+"性質"+"\t"+"におい"+"\t"+"電気"+"\n");
				fout.write("　　　　　"+"\t"+sui[n1][1]+"\t"+sui[n1][2]+"\t"+"\t"+"\t"+"\n");
				fout.write("　　　　　"+"\t"+sui[n2][1]+"\t"+"\t"+"\t"+"\t"+sui[n2][5]+"\n");
				fout.write("　　　　　"+"\t"+sui[n3][1]+"\t"+"\t"+"\t"+sui[n3][4]+"\t"+"\n");
				fout.write("　　　　　"+"\t"+sui[n4][1]+"\t"+"\t"+"\t"+"\t"+sui[n4][5]+"\n");
				fout.write("　　　　　"+"\t"+sui[n5][1]+"\t"+sui[n5][2]+"\t"+"\t"+sui[n5][4]+"\t"+"\n");
				fout.write("　　　　　"+"\t"+sui[n6][1]+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write("　　　　　"+"\t"+sui[n7][1]+"\t"+"\t"+"\t"+sui[n7][4]+"\t"+sui[n7][5]+"\n");
				fout.write("　　　　　"+"\t"+sui[n8][1]+"\t"+"\t"+"\t"+sui[n8][4]+"\t"+"\n");
				fout.write("　　　　　"+"\t"+sui[n9][1]+"\t"+sui[n9][2]+"\t"+"\t"+"\t"+sui[n9][5]+"\n");
				fout.write("　　　　　"+"\t"+sui[n10][1]+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.close();
				}catch (Exception e){
				System.out.println(e); //例外処理
				}
			break;
		case "3-2":
			try{
				FileWriter fout=new FileWriter("Mondai_Level3-2_"+cont+".doc");
				fout.write("\t"+"溶けている物質"+"\t"+"状態"+"\t"+"性質"+"\t"+"におい"+"\t"+"電気"+"\n");
				fout.write(sui[n1][0]+"\t"+"\t"+sui[n1][2]+"\t"+"\t"+"\t"+"\n");
				fout.write(sui[n2][0]+"\t"+"\t"+sui[n2][2]+"\t"+"\t"+"\t"+sui[n2][5]+"\n");
				fout.write(sui[n3][0]+"\t"+"\t"+"\t"+"\t"+sui[n3][4]+"\t"+"\n");
				fout.write(sui[n4][0]+"\t"+"\t"+"\t"+"\t"+"\t"+sui[n4][5]+"\n");
				fout.write(sui[n5][0]+"\t"+"\t"+sui[n5][2]+"\t"+"\t"+sui[n5][4]+"\t"+"\n");
				fout.write(sui[n6][0]+"\t"+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write(sui[n7][0]+"\t"+"\t"+"\t"+"\t"+sui[n7][4]+"\t"+sui[n7][5]+"\n");
				fout.write(sui[n8][0]+"\t"+"\t"+"\t"+"\t"+sui[n8][4]+"\t"+"\n");
				fout.write(sui[n9][0]+"\t"+"\t"+sui[n9][2]+"\t"+"\t"+"\t"+sui[n9][5]+"\n");
				fout.write(sui[n10][0]+"\t"+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.close();
				}catch (Exception e){
				System.out.println(e); //例外処理
				}
			break;
		case "4-1":
			try{
				FileWriter fout=new FileWriter("Mondai_Level4-1_"+cont+".doc");
				fout.write("\t"+"溶けている物質"+"\t"+"状態"+"\t"+"性質"+"\t"+"におい"+"\t"+"電気"+"\n");
				fout.write(sui[n1][0]+"\t"+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write(sui[n2][0]+"\t"+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write(sui[n3][0]+"\t"+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write(sui[n4][0]+"\t"+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write(sui[n5][0]+"\t"+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write(sui[n6][0]+"\t"+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write(sui[n7][0]+"\t"+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write(sui[n8][0]+"\t"+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write(sui[n9][0]+"\t"+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write(sui[n10][0]+"\t"+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.close();
				}catch (Exception e){
				System.out.println(e); //例外処理
				}
			break;
		case "4-2":
			try{
				FileWriter fout=new FileWriter("Mondai_Level4-2_"+cont+".doc");
				fout.write("\t"+"溶けている物質"+"\t"+"状態"+"\t"+"性質"+"\t"+"におい"+"\t"+"電気"+"\n");
				fout.write("　　　　　"+"\t"+sui[n1][1]+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write("　　　　　"+"\t"+sui[n2][1]+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write("　　　　　"+"\t"+sui[n3][1]+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write("　　　　　"+"\t"+sui[n4][1]+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write("　　　　　"+"\t"+sui[n5][1]+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write("　　　　　"+"\t"+sui[n6][1]+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write("　　　　　"+"\t"+sui[n7][1]+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write("　　　　　"+"\t"+sui[n8][1]+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write("　　　　　"+"\t"+sui[n9][1]+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.write("　　　　　"+"\t"+sui[n10][1]+"\t"+"\t"+"\t"+"\t"+"\n");
				fout.close();
				}catch (Exception e){
				System.out.println(e); //例外処理
				}
			break;
		}
	}
	//答えを生成するansメソッド
	static void ans(int cont,int num) {
		switch(num) {
		//mainメソッドでの変数answerによって条件分岐
		case 0:
			//何もしない
			break;
		case 1:
			//答えを生成
			try{
				FileWriter fout=new FileWriter("Kotae_"+cont+".doc");
				fout.write("\t"+"溶けている物質"+"\t"+"状態"+"\t"+"性質"+"\t"+"におい"+"\t"+"電気"+"\n");
				for(int n=0;n<=4;n++){
					fout.write(sui[n1][n]+"\t");
				}
				fout.write(sui[n1][5]+"\n");
				for(int n=0;n<=4;n++){
					fout.write(sui[n2][n]+"\t");
				}
				fout.write(sui[n2][5]+"\n");
				for(int n=0;n<=4;n++){
					fout.write(sui[n3][n]+"\t");
				}
				fout.write(sui[n3][5]+"\n");
				for(int n=0;n<=4;n++){
					fout.write(sui[n4][n]+"\t");
				}
				fout.write(sui[n4][5]+"\n");
				for(int n=0;n<=4;n++){
					fout.write(sui[n5][n]+"\t");
				}
				fout.write(sui[n5][5]+"\n");
				for(int n=0;n<=4;n++){
					fout.write(sui[n6][n]+"\t");
				}
				fout.write(sui[n6][5]+"\n");
				for(int n=0;n<=4;n++){
					fout.write(sui[n7][n]+"\t");
				}
				fout.write(sui[n7][5]+"\n");
				for(int n=0;n<=4;n++){
					fout.write(sui[n8][n]+"\t");
				}
				fout.write(sui[n8][5]+"\n");
				for(int n=0;n<=4;n++){
					fout.write(sui[n9][n]+"\t");
				}
				fout.write(sui[n9][5]+"\n");
				for(int n=0;n<=4;n++){
					fout.write(sui[n10][n]+"\t");
				}
				fout.write(sui[n10][5]+"\n");
				fout.close();
				}catch (Exception e){
				System.out.println(e); //例外処理
				}
			break;
		}
	}
}
