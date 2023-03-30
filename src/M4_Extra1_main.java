import java.util.Scanner;

public class M4_Extra1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner entrada = new Scanner(System.in);
		
		int num1;
		int num2;
		float num3;
		
		System.out.println("Introdueix un nombre sencer que será el dividend: ");
		num1 = entrada.nextInt();
		System.out.println("Introdueix un nombre sencer que será el divisor, però ha de estar entre 2 i 7: ");
		num2 = entrada.nextInt();
		
		if(num2 >= 2 && num2 <= 7) {
			num3 = num1 % num2;
			if(num3 != 0) {
				System.out.println("El dividend no es múltiple del divisor");
			}else {
				System.out.println("El dividend es múltiple del divisor");
			}
		}else {
			System.out.println("El divisor no es correcte!");
		}
		
	}

}
