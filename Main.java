/*
  Exercício de vetores 01
*/

public class Main
{
	public static void main(String[] args) {
		
		//os "[]" podem ser colocados tanto do lado direito como do lado esquerdo do objeto.
		int vetor[] = new int [10]; //O vetor tem o índice 10.
		
		//Aplicando valores aos índices.
		vetor[0] = 1;
		vetor[1] = 2;
		vetor[2] = 3;
		vetor[3] = 4;
		vetor[4] = 5;
		vetor[5] = 6;
		vetor[6] = 7;
		vetor[7] = 8;
		vetor[8] = 9;
		vetor[9] = 10;
		
		//Estrutura de repetição para a exibição do valor do vetor de acordo com a posição de uma variável de repetição utilizando "[]".
	   for(int repetition=0; repetition<10; repetition++){
	       
	       //Exibir o valor de Vetor de acordo com a posição de repetition
	       System.out.println("O vetor "+vetor[repetition]+" está na posição "+repetition);
	       
	   }
	
	}
}
