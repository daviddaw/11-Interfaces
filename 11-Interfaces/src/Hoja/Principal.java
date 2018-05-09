package Hoja;

public class Principal {

	public static void main(String[] args) {
		ListArray lista = new ListArray(6);
		
	
		lista.addLast(1);
		System.out.println(" ");
		lista.addLast(2);
		System.out.println(" ");
		lista.addLast(3);
		System.out.println(" ");
		lista.addLast(4);
		System.out.println(" ");
		System.out.println("El tamaño actual es "+lista.getSize());
		lista.visualizar();
		System.out.println(" ");
		lista.addFirst(8);
		System.out.println("El tamaño actual es "+lista.getSize());
		lista.visualizar();
		System.out.println(" ");
		lista.addFirst(7);
		System.out.println("El tamaño actual es "+lista.getSize());
		lista.visualizar();
         System.out.println(" ");
		lista.addFirst(9);
		lista.visualizar();
		System.out.println(" ");
		lista.removeFirst();
		System.out.println("El tamaño actual es "+lista.getSize());
		lista.visualizar();
		lista.removeFirst();
		System.out.println("El tamaño actual es "+lista.getSize());
		lista.visualizar();
		
		lista.removeLast();
		System.out.println("El tamaño actual es "+lista.getSize());
		lista.visualizar();
		
		
       

	}

}
