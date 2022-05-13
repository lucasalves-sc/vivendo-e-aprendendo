package JC;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class MainGame {
	public static int jogador,cpu;
	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		System.out.println("|*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*|\n"
				         + "||\n"
				         + "||\n"
				         + "||\n"
				         + "||\n"
				         + "||\n"
				         + "||\n"
				         + "|*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*|");
		String play=key.nextLine();
		if(play.equals("play")) {
			mainGame(2);
		}else {
			textJogador(2);
		}
	}
	public static void mainGame(int help) {
		for(int i=1;i<3;i++) {
			if(i>=1) {				
				textJogador(1);
			}else if(i>=2) {	
				textJogador(2);
			}
		}
	}
	public static void textJogador(int a) {
		if(a>=1) {
			System.out.println("(-***-)_______");
		}else if(a>=2) {
			System.out.println("_______(-***-)");
		}
	}
	public static void textCPU(int b){
		if(b>1) {
			System.out.println("(-***-)_______");
		}else if(b>2) {
			System.out.println("_______(-***-)");
		}
	}
}