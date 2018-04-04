package suiyoueki_Level2;

import java.io.FileWriter;

public class Suiyoueki {
	
public static void main(String[] args){
		String[][] sui=new String[10][6];
		sui[0][0]="塩酸";
		sui[0][1]="塩化水素";
		sui[0][2]="気体";
		sui[0][3]="酸性";
		sui[0][4]="ある";
		sui[0][5]="よく通す";
		sui[1][0]="酢酸水溶液";
		sui[1][1]="酢酸";
		sui[1][2]="液体";
		sui[1][3]="酸性";
		sui[1][4]="ある";
		sui[1][5]="通す";
		sui[2][0]="炭酸水";
		sui[2][1]="二酸化炭素";
		sui[2][2]="気体";
		sui[2][3]="酸性";
		sui[2][4]="ない";
		sui[2][5]="通す";
		sui[3][0]="ほう酸水";
		sui[3][1]="ほう酸";
		sui[3][2]="固体";
		sui[3][3]="酸性";
		sui[3][4]="ない";
		sui[3][5]="通す";
		sui[4][0]="食塩水";
		sui[4][1]="食塩";
		sui[4][2]="固体";
		sui[4][3]="中性";
		sui[4][4]="ない";
		sui[4][5]="よく通す";
		sui[5][0]="アルコール水";
		sui[5][1]="アルコール";
		sui[5][2]="液体";
		sui[5][3]="中性";
		sui[5][4]="ある";
		sui[5][5]="通さない";
		sui[6][0]="さとう水";
		sui[6][1]="さとう";
		sui[6][2]="固体";
		sui[6][3]="中性";
		sui[6][4]="ない";
		sui[6][5]="通さない";
		sui[7][0]="水酸化ナトリウム水溶液";
		sui[7][1]="水酸化ナトリウム";
		sui[7][2]="固体";
		sui[7][3]="アルカリ性";
		sui[7][4]="ない";
		sui[7][5]="よく通す";
		sui[8][0]="石灰水";
		sui[8][1]="消石灰";
		sui[8][2]="固体";
		sui[8][3]="アルカリ性";
		sui[8][4]="ない";
		sui[8][5]="通す";
		sui[9][0]="アンモニア水";
		sui[9][1]="アンモニア";
		sui[9][2]="気体";
		sui[9][3]="アルカリ性";
		sui[9][4]="ある";
		sui[9][5]="通す";
		int n1=new java.util.Random().nextInt(10);
		int n2=n1;
		while(n2==n1){
			n2=new java.util.Random().nextInt(10);
		}
		int n3=n2;
		while(n3==n1||n3==n2){
			n3=new java.util.Random().nextInt(10);
		}
		int n4=n3;
		while(n4==n1||n4==n2||n4==n3){
			n4=new java.util.Random().nextInt(10);
		}
		int n5=n4;
		while(n5==n1||n5==n2||n5==n3||n5==n4){
			n5=new java.util.Random().nextInt(10);
		}
		int n6=n5;
		while(n6==n1||n6==n2||n6==n3||n6==n4||n6==n5){
			n6=new java.util.Random().nextInt(10);
		}
		int n7=n6;
		while(n7==n1||n7==n2||n7==n3||n7==n4||n7==n5||n7==n6){
			n7=new java.util.Random().nextInt(10);
		}
		int n8=n7;
		while(n8==n1||n8==n2||n8==n3||n8==n4||n8==n5||n8==n6||n8==n7){
			n8=new java.util.Random().nextInt(10);
		}
		int n9=n8;
		while(n9==n1||n9==n2||n9==n3||n9==n4||n9==n5||n9==n6||n9==n7||n9==n8){
			n9=new java.util.Random().nextInt(10);
		}
		int n10=n9;
		while(n10==n1||n10==n2||n10==n3||n10==n4||n10==n5||n10==n6||n10==n7||n10==n8||n10==n9){
			n10=new java.util.Random().nextInt(10);
		}
		System.out.println("スタート");
		try{
			FileWriter fout=new FileWriter("Mondai_Level1.doc");
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
			System.out.println(e);
			}
		try{
			FileWriter fout=new FileWriter("Mondai_Level2.doc");
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
			System.out.println(e);
			}
		try{
			FileWriter fout=new FileWriter("Mondai_Level3-1.doc");
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
			System.out.println(e);
			}
		try{
			FileWriter fout=new FileWriter("Mondai_Level3-2.doc");
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
			System.out.println(e);
			}
		try{
			FileWriter fout=new FileWriter("Mondai_Level4-1.doc");
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
			System.out.println(e);
			}
		try{
			FileWriter fout=new FileWriter("Mondai_Level4-2.doc");
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
			System.out.println(e);
			}
		try{
			FileWriter fout=new FileWriter("Kotae.doc");
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
			System.out.println(e);
			}
		System.out.println("終了");
	}
}
