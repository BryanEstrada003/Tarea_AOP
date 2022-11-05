
import java.util.Scanner;

public class Uber {
	
    public static boolean verficado;
    
    public static void crearParada(boolean verificado) {
    	if(verficado) {
	    	ViajeUber viajeNuevo = ViajeUber.getViaje();
	        viajeNuevo.setOrigen("Trabajo");
	        viajeNuevo.setDestino("Escuela");
	        viajeNuevo.setPrecio("5");
	        System.out.println(viajeNuevo);
    	}
    }
    
    
            
    public static void main(String[] args) {
        
    	Scanner sc= new Scanner(System.in);
        
    	//Solo puede haber un viaje en curso
        
        System.out.println("Viaje de Uber en curso");
        ViajeUber viajeEnCurso = ViajeUber.getViaje();
        System.out.println(viajeEnCurso);
        
        
        System.out.println("Agregar nueva parada");
        //Agregar nueva parada (mismo viaje, seguido del anterior)
        
    	crearParada(verficado);
        
<<<<<<< HEAD
        
    }
=======
      //Agregar nueva parada (mismo viaje, seguido del anterior)
        if(nuevoOrigen.equals(viajeEnCurso.getDestino()))
    		crearParada();
        else 
        	System.out.println("No se pudo crear nueva parada");
        sc.close();
        }
>>>>>>> e92de63ff617b2541083c82b3541d8d57690e26b
    
}
