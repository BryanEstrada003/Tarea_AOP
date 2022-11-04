
import java.util.Scanner;

public class Uber {
	
	public static Scanner sc= new Scanner(System.in);
    public static String nuevoOrigen;
    
    public static void crearParada() {
    	ViajeUber viajeNuevo = ViajeUber.getViaje();
        viajeNuevo.setOrigen("Trabajo");
        viajeNuevo.setDestino("Casa de mamá");
        viajeNuevo.setPrecio(5);
        System.out.println(viajeNuevo);
    }
    
    
            
    public static void main(String[] args) {
        
        
        //Solo puede haber un viaje en curso
        
        System.out.println("Viaje de Uber en curso");
        ViajeUber viajeEnCurso = ViajeUber.getViaje();
        System.out.println(viajeEnCurso);
        
        System.out.println("Agregar nueva parada");
        System.out.println("Ingrese nuevo destino: ");
        nuevoOrigen=sc.nextLine();
        
      //Agregar nueva parada (mismo viaje, seguido del anterior)
        if(nuevoOrigen.equals(viajeEnCurso.getDestino()))
    		crearParada();
        
    }
    
}
