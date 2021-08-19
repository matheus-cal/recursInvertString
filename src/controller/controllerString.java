package controller;

public class controllerString {

	public controllerString() {
		super();
	}
	
	public String stringInverter(String string, int len) {
		/*
		 A Condição de Parada acontece quando o tamanho 
		 da string chega à 0;
		 */
		
		if (len == 0) {
			return "";
			
		/*
		 Decrementamos o valor do tamanho da string, de forma que empilhamos esse valor
		 até que chegue a zero, e enquanto isso, usamos o String.substring para reter a ultima e
		 penúltima letra em cada iteração, concatenando um carácter por vez a partir do
		 fim da string.
		 */
		} else {
			return string.substring(len - 1, len) + stringInverter(string, len - 1);
		}
	}

}
