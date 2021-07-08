package br.com.generation.heranca;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro();
		Cavalo cav1 = new Cavalo();
		Preguica pre1 = new Preguica();
		
		dog1.setNome("Bucky");
		dog1.setIdade(2);
		
		cav1.setNome("BlueJeans");
		cav1.setIdade(5);
		
		pre1.setNome("Raymond");
		pre1.setIdade(7);
		
		System.out.println("Dados do cachorro:");
		System.out.println("Nome: " + dog1.getNome());
		System.out.println("Idade: " + dog1.getIdade() + " anos");
		dog1.emiteSom();
		dog1.DeveCorrer();
		System.out.println("\n");
		
		System.out.println("Dados do cavalo:");
		System.out.println("Nome: " + cav1.getNome());
		System.out.println("Idade: " + cav1.getIdade() + " anos");
		cav1.emiteSom();
		cav1.DeveCorrer();
		System.out.println("\n");
		
		System.out.println("Dados da preguiça:");
		System.out.println("Nome: " + pre1.getNome());
		System.out.println("Idade: " + pre1.getIdade() + " anos");
		pre1.emiteSom();
		pre1.DeveSubirArvores();
		
			
		
	

	}

}
