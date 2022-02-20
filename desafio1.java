/* 

# Questão 01

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

Exemplo:

Entrada:
n = 6

Saída:
          *
        **
      ***
    ****
  *****
******

*/


//Resposta questão 01

Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        
        /*
         * O primeiro for vai rodar, ele verifica se o x é menor que o número informado. Se sim, ele vai entrar no segundo for que verifica se y é menor que x e printa.

         * o * na quantidade de vezes que o y  for menor que x.
         * y < x printe o * até que y for igual a x. Volta pro x que verifica
         * se é menor que n, se sim entra no y que printa o *
         * na quantidade de vezes que o y está menor que x.
         */
        int n= sc.nextInt();
        for(int x=0; x<=n;x++){
            for(int y=0;y<=x;y++){
                System.out.print("*");
            }
            System.out.println();
        }