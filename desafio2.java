/* 

# Questão 02

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:

- Possui no mínimo 6 caracteres.
- Contém no mínimo 1 dígito.
- Contém no mínimo 1 letra em minúsculo.
- Contém no mínimo 1 letra em maiúsculo.
- Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

Exemplo:

Entrada:
Ya3

Saída:
3

Explicação:
Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.

*/


//Resposta questão 02

package ProvaCapgemini;
import java.util.Scanner;
public class Senha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		//A repetição só para quando a senha está válida
		while(true) {
			System.out.println("Digite uma senha");
			String senha = sc.next();
			
			//Chamo o método e valido a senha	
			if(senhaForte(senha) == false) {
				System.out.println("Senha inválida");
			}
			else {
				System.out.println("Senha válida");
				break;
			}
		}

	}
	
	/**
	 * Método que recebe uma senha e primeiro verifica se 
	 * ela está com tamanho menor que 6 pois retornará falsa.
	 * As variáveis estão inicializadas como falsas e o for each
	 * vai percorrer cada elemento da string, ou seja cada char e
	 * verificar nas condições se tem todos os valores necessários para 
	 * validar a senha. Se tive o que precisa, ele vai preencher com true  variável
	 * e retornar elas como true para esse método ser
	 * validado lá em cima no main. 
	 * Caso esteja faltando algum item da regra do método de validar senha, 
	 * A variável dele permanece false e o retorno do método também, 
	 * invalidando a senha no main.
	 * @param senha
	 * @return
	 */
	public static boolean senhaForte(String senha) {
	    if (senha.length() < 6) return false;

	    boolean achouNumero = false;
	    boolean achouMaiuscula = false;
	    boolean achouMinuscula = false;
	    boolean achouSimbolo = false;
	    for (char c : senha.toCharArray()) {
	         if (c >= '0' && c <= '9') {
	             achouNumero = true;
	         } else if (c >= 'A' && c <= 'Z') {
	             achouMaiuscula = true;
	         } else if (c >= 'a' && c <= 'z') {
	             achouMinuscula = true;
	         } else {
	             achouSimbolo = true;
	         }
	        
	    }
	    return achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo;
	}


}