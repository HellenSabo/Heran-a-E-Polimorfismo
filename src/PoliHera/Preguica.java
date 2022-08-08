package PoliHera;

	public class Preguica extends Animal implements AnimalAtv{
		
		public void somAnimal() {
			
			boolean ameaça = true;
			
			if (ameaça == true) {
			System.out.println("\nA preguiça vira a cabeça na direção do som.");
			} else if (ameaça != true) {
				System.out.println("A preguiça segue tranquila.");
			}
			
		}
		
		public void locomocao() {
			System.out.println("A preguiça está subindo na árvore para se pendurar.");
		}
}
