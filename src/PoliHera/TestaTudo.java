package PoliHera;

public class TestaTudo {

	public static void main(String[] args) {
		Cavalo cav = new Cavalo();
		Preguica preg = new Preguica();
		Cachorro cac = new Cachorro();
		
		cav.setNome("Pé de Pano");
		cav.setIdade(10);
		preg.setNome("Flecha");
		preg.setIdade(6);
		cac.setNome("Pikachu");
		cac.setIdade(3);
		
		System.out.println("O nome do cavalo é " + cav.getNome() + " e ele tem " + cav.getIdade() + " anos.");
		cav.somAnimal();
		cav.locomocao();
		System.out.println("\n||====================================================||");
		
		System.out.println("\nO nome da preguiça é " + preg.getNome() + " e ela tem " + preg.getIdade() + " anos.");
		preg.somAnimal();
		preg.locomocao();
		System.out.println("\n||====================================================||");
		
		System.out.println("\nO nome do cachorro é " + cac.getNome() + " e ele tem " + cac.getIdade() + " anos.\n");
		cac.somAnimal();
		cac.locomocao();

	}

}
