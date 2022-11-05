
import java.util.List;

public class ImprimirLogotipo {
	@SuppressWarnings("rawtypes")
    private List Tamanio;
    // other attributes
    
    public static void imprimir(LogotipoAdapter logad){
        //imprime la imagen
    	System.out.println("Se imprimió");

    }
    
    public static void main(String[] args) {
    	LogotipoAdapter logad= null; //se recibe la imagen adaptada
    	imprimir(logad);
    	
    }
    
}
