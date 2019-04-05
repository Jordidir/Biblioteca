
/**
 * Lista de libro de una biblioteca
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaLibros
{
   
    Libro primero;

    /**
     * Constructor for objects of class ListaNodos
     */
    public ListaLibros()
    {
       
        primero = null;
    }

   
    // Completar los metodos
    
    // Incluye un nuevo libro en la lista
    public void pon( Libro valor){
        valor.siguiente = primero;
        primero = valor;
    }
    
    public boolean estaVacia(){
       return ( primero == null );    
        
    }
    
    // Devuelve un libro que es eliminado de la lista o null si no exite
    public Libro quitar ( int id ) {
    	if (estaVacia() ) return null;
    	if (primero.id == id) {
    		Libro aux = primero;
    		primero = primero.siguiente;
    		return aux;
    	}
    	Libro paux1 = primero;
    	Libro paux2 = primero.siguiente;
    	while ( paux2 != null) {
    		if ( paux2.id == id) { // se salta
    			paux1.siguiente = paux2.siguiente;
    			break;
    		}
    		paux1 = paux2;
    		paux2 = paux2.siguiente;
    	}
    	return paux2;
    	
        
    }
   
    // Devuelve el id del libro o -1 si no esta
    public int buscarId ( String titulo ){
        Libro aux1 = primero;
        while (aux1 != null) {
        	if (aux1.titulo.equals(titulo)) {
        		return aux1.id;
        	}
        	aux1 = aux1.siguiente;
        }
    return -1;
   }
    // Muestra los libros almacenados
    public void verCatalogo (){
    	if (! estaVacia()) {
    		Libro aux1 = primero;
    		while (aux1 != null) {
    			System.out.println(aux1.titulo);
    			aux1 = aux1.siguiente;
    		}
    	}
    }
        

}
