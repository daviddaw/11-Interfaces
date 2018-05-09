package Hoja;

public interface IArray {
	public void addFirst(int elem);	
	public void addLast(int elem);
	public void removeFirst();
	public void removeLast();
	
	
	public void insertAt(int index, int elem);
	//inserta el elem en la posici�n index desplazando los dem�s.
	
    public boolean isEmpty();
    
    public boolean contains(int elem);
    //devuelve si el elem est� o no en el array
    
    public int getSize();
    
    
    public int getIndexOf(int elem); 
    //devuelve la posici�n d�nde se encuentra el elem o -1
    
    public int getFirst(); 
    //devuelve el primer elemento
    
    public int getLast();
    
    public void removeAt(int index);
    
    public void removeAll(int elem);
    //elimina todas las ocurrencias de elem
    
    public String toString(); 

	
	
	
	
}
