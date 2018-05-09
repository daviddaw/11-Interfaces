package Hoja;

public class ListArray implements IArray{



	 private int numElem;
	 private int[] arrayEnteros;
	 
		public ListArray(int longitud) {
			
			arrayEnteros=new int[longitud];
		}
	 
	 

	 
	 
	@Override
	public void addFirst(int elem) {
		//añade el elemento en la primera posición del array desplazando todos demás a la derecha. Hay que comprobar si hay espacio suficiente.
		/*System.out.println(arrayEnteros.length);*/
		
		if (getSize()==arrayEnteros.length) {
			System.out.println("El array esta lleno no se puede introducir el "+elem);
		}
		else  {
			for (int i = arrayEnteros.length-1; i > 0; i--) {

				
				arrayEnteros[i]=arrayEnteros[i-1];
		
				
			}
			arrayEnteros[0]=elem;
			numElem++;
		}

		
		/*System.out.println(arrayEnteros[0]);*/
		
		
		
	}
	@Override
	public void addLast(int elem) {
		///añade el elemento al final del array
		if (arrayEnteros[numElem]==0) {
			arrayEnteros[numElem]=elem;
			numElem++;
		
		}
		
		

		
		
	}
	
	@Override
	public void removeFirst() {
	// borra el primer elemento del array desplazando todos los demás hacia la izquierda. Hay que comprobar que no está vacío.
		if (arrayEnteros[0]==0) {
			System.out.println("No sepuede borrar");
		}else {
			for (int i = 0; i < arrayEnteros.length-1; i++) {
				arrayEnteros[i]=arrayEnteros[i+1];
			}
			arrayEnteros[getSize()-1]=0;
			numElem--;
		}

	}
	
/*	@Override
	public void removeFirst() {
		if (arrayEnteros[0]==0) {
			System.out.println("no se puede borrar por que no hay numero en la posicion");
		}
		else {
			arrayEnteros[0]=0;
		}
		numElem--;
	}*/
/*	@Override
	public void removeLast() {
		
		
	}*/
	
	@Override
	public void removeLast() {
		//ídem el último
		if (arrayEnteros[getSize()-1]==0) {
			System.out.println(" No hay ningun numero que borrar");
		}
		else {
			arrayEnteros[getSize()-1]=0;
			numElem--;
		}
		
		
		
	}
	@Override
	public void insertAt(int index, int elem) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(int elem) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int getSize() {
		//devuelve el tamaño real del array (no length)
		return numElem;
	}
	@Override
	public int getIndexOf(int elem) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getFirst() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getLast() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void removeAt(int index) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void removeAll(int elem) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void visualizar() {
		for (int i = 0; i < arrayEnteros.length; i++) {
			System.out.println(arrayEnteros[i]);
		}
	}
	

	

	
}
