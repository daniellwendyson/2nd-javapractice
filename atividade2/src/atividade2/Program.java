package atividade2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
	    /* 1. Escreva um trecho de c�digo o qual recebe o valor de uma
		vari�vel idade e imprime a mensagem �� maior de idade�,
		caso a idade seja maior que 18 anos, e imprima �� menor de
		idade� caso contr�rio. */ 
		
		int idade;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite a sua idade: ");
		idade = sc.nextInt();
		
		if(idade>18) {
			System.out.println("� maior de idade!");
		}else {
			System.out.println("� menor de idade!");
		}
		
		// 2. Crie um c�digo que l� dois valores inteiros e retorna qual
		// dos dois � o maior
		
		int n1, n2;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("digite o primeiro valor: ");
		n1 = sc1.nextInt();
		System.out.println("digite o segundo valor: ");
		n2 = sc1.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1+" � maior que "+n2);
		}else {
			System.out.println(n1+" � menor que "+n2);
		}
		
		
		// 3. Neste desafio, c�digo que voc� vai criar deve ler um valor
		// e informar se � par ou �mpar.

		int num;
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("digite o n�mero: ");
		num = sc2.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("� par!");
		}else {
			System.out.println("� impar!");
		}
		
		// 4. Escreva um programa que verifique a validade de uma senha
		// fornecida pelo usu�rio. A senha v�lida � o n�mero
		// bola2020. Devem ser impressas as seguintes mensagens:
		// o ACESSO PERMITIDO caso a senha seja v�lida.
		// o ACESSO NEGADO caso a senha seja inv�lida.
		
		String senha;
		String senha1 = "senhadificil";
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("digite a sua senha: ");
		senha = sc3.next();
		
		if(senha.equals(senha1)) {
			System.out.println("ACESSO PERMITIDO!");
		}else {
			System.out.println("ACESSO NEGADO!");
		}
				
		// 5. O programa que voc� vai desenvolver deve ler 3 valores
		// inteiros (considere que n�o ser�o lidos valores iguais) e
		// escrev�-los em ordem crescente.
		
		int a, b, c;
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("digite o primeiro valor: ");
		a = sc4.nextInt();
		System.out.println("digite o segundo valor: ");
		b = sc4.nextInt();
		System.out.println("digite o terceiro valor: ");
		c = sc4.nextInt();
		
		if (a < b) {
			if(b < c) {
				System.out.println(a+"\n"+b+"\n"+c);
			}
			else if (a < c) {
				System.out.println(a+"\n"+c+"\n"+b);
			}else {
				System.out.println(c+"\n"+a+"\n"+b);
			}
		}
		else if(b < c) {
			if(a < c) {
				System.out.println(b+"\n"+a+"\n"+c);
			}else {
				System.out.println(b+"\n"+c+"\n"+a);
			}
		}else {
			System.out.println(c+"\n"+b+"\n"+a);
		}
		
		// 6. Uma competi��o esportiva divide seus participantes nas
		// seguintes categorias:
		// o Infantil � At� 12 anos
		// o Juvenil � maior que 12 a 17
		// o Sub-20 � maior que 17 a 20
		// o Adulto � a partir de 21 anos.
		// Escreva um c�digo que recebe uma idade e retorna em qual
		// categoria o atleta se encaixa.
		
		int idade1;
		
		Scanner sc5 = new Scanner(System.in);
		System.out.println("digite a sua idade: ");
		idade = sc5.nextInt();
		
		if (idade < 12) {
			System.out.println("INFANTIL");
		}
		else if ((idade >= 12) && (idade <= 17)) {
			System.out.println("JUVENIL");
		}
		else if ((idade > 17) && (idade <= 20)) {
			System.out.println("SUB-20");
		}else {
			System.out.println("ADULTO");
		}
		
		
		// 7. Escreva um programa que recebe as medidas dos lados de um
		// tri�ngulo e retorna se � equil�tero, is�sceles, ou
		// escaleno.
		
		int l1, l2, l3;
		
		Scanner sc6 = new Scanner(System.in);
		System.out.println("digite o primeiro lado: ");
		l1 = sc6.nextInt();
		System.out.println("digite o segundo lado: ");
		l2 = sc6.nextInt();
		System.out.println("digite o terceiro lado: ");
		l3 = sc6.nextInt();
		
		if ((l1 == l2) && (l2 == l3)) {
			System.out.println("EQUIL�TERO");
		}
		else if ((l1 != l2) && (l2 != l3) && (l1 != l3)) {
			System.out.println("ESCALENO");
		}
		else if (l1==l2 || l1==l3 || l2==l3) {
			System.out.println("IS�SCELES");
		}
		
		
		// 8. Escreva um c�digo que recebe o peso e altura de uma pessoa
		// e d� o resultado a partir da classifica��o da tabela de
		// IMC abaixo.
		
		float altura, peso, imc;
		
		Scanner sc7 = new Scanner(System.in);
		System.out.println("digite sua altura (m): ");
		altura = sc7.nextFloat();
		System.out.println("digite seu peso (kg): ");
		peso = sc7.nextFloat();
		imc = peso / (altura * altura);
		System.out.println(imc);
		
		if (imc < 17) {
			System.out.println("voc� est� muito abaixo do peso!");
		}
		else if ((imc >= 17) && (imc < 18.5)) {
			System.out.println("voc� est� abaixo do peso!");
		}
		else if ((imc >= 18.5) && (imc < 25)) {
			System.out.println("voc� est� no peso ideal!");
		}
		else if ((imc >= 25) && (imc < 30)) {
			System.out.println("voc� est� com sobrepeso!");
		}
		else if ((imc >= 30) && (imc < 35)) {
			System.out.println("voc� est� com obesidade!");
		}
		else if ((imc >= 35) && (imc <40)) {
			System.out.println("voc� est� com obesidade severa!");
		}else {
			System.out.println("voc� est� com obesidade m�rbida!");
		}
		
	}

}