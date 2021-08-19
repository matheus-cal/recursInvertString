package controller;

public class controllerString {

	public controllerString() {
		super();
	}
	
	public String stringInverter(String string, int len) {
		/*
		 A Condi��o de Parada acontece quando o tamanho 
		 da string chega � 0;
		 */
		
		if (len == 0) {
			return "";
			
		/*
		 Decrementamos o valor do tamanho da string, de forma que empilhamos esse valor
		 at� que chegue a zero, e enquanto isso, usamos o String.substring para reter a ultima e
		 pen�ltima letra em cada itera��o, concatenando um car�cter por vez a partir do
		 fim da string.
		 */
		} else {
			return string.substring(len - 1, len) + stringInverter(string, len - 1);
		}
	}

}
