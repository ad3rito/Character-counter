import java.util.Scanner;

public class ContCaracteres {
public static void main(String [] args) {
Scanner in = new Scanner(System.in);
String s;
int cont = 0;

System.out.printf("Introduza um nome : ");
s = in.nextLine();

int comp = s.length();
System.out.printf ("Este nome tem " +comp+ " caracteres");
}
}