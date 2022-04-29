package atividade2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
	    /* 1. Escreva um trecho de código o qual recebe o valor de uma
		variável idade e imprime a mensagem “é maior de idade”,
		caso a idade seja maior que 18 anos, e imprima “é menor de
		idade” caso contrário. */ 
		
		int idade;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite a sua idade: ");
		idade = sc.nextInt();
		
		if(idade>18) {
			System.out.println("é maior de idade!");
		}else {
			System.out.println("é menor de idade!");
		}
		
		// 2. Crie um código que lê dois valores inteiros e retorna qual
		// dos dois é o maior
		
		int n1, n2;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("digite o primeiro valor: ");
		n1 = sc1.nextInt();
		System.out.println("digite o segundo valor: ");
		n2 = sc1.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1+" é maior que "+n2);
		}else {
			System.out.println(n1+" é menor que "+n2);
		}
		
		
		// 3. Neste desafio, código que você vai criar deve ler um valor
		// e informar se é par ou ímpar.

		int num;
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("digite o número: ");
		num = sc2.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("é par!");
		}else {
			System.out.println("é impar!");
		}
		
		// 4. Escreva um programa que verifique a validade de uma senha
		// fornecida pelo usuário. A senha válida é o número
		// bola2020. Devem ser impressas as seguintes mensagens:
		// o ACESSO PERMITIDO caso a senha seja válida.
		// o ACESSO NEGADO caso a senha seja inválida.
		
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
				
		// 5. O programa que você vai desenvolver deve ler 3 valores
		// inteiros (considere que não serão lidos valores iguais) e
		// escrevê-los em ordem crescente.
		
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
		
		// 6. Uma competição esportiva divide seus participantes nas
		// seguintes categorias:
		// o Infantil – Até 12 anos
		// o Juvenil – maior que 12 a 17
		// o Sub-20 – maior que 17 a 20
		// o Adulto – a partir de 21 anos.
		// Escreva um código que recebe uma idade e retorna em qual
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
		// triângulo e retorna se é equilátero, isósceles, ou
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
			System.out.println("EQUILÁTERO");
		}
		else if ((l1 != l2) && (l2 != l3) && (l1 != l3)) {
			System.out.println("ESCALENO");
		}
		else if (l1==l2 || l1==l3 || l2==l3) {
			System.out.println("ISÓSCELES");
		}
		
		
		// 8. Escreva um código que recebe o peso e altura de uma pessoa
		// e dê o resultado a partir da classificação da tabela de
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
			System.out.println("você está muito abaixo do peso!");
		}
		else if ((imc >= 17) && (imc < 18.5)) {
			System.out.println("você está abaixo do peso!");
		}
		else if ((imc >= 18.5) && (imc < 25)) {
			System.out.println("você está no peso ideal!");
		}
		else if ((imc >= 25) && (imc < 30)) {
			System.out.println("você está com sobrepeso!");
		}
		else if ((imc >= 30) && (imc < 35)) {
			System.out.println("você está com obesidade!");
		}
		else if ((imc >= 35) && (imc <40)) {
			System.out.println("você está com obesidade severa!");
		}else {
			System.out.println("você está com obesidade mórbida!");
		}
		
	}

}