
import java.util.Scanner;

public class Uber {
	
	public static Scanner sc= new Scanner(System.in);
    public static String nuevoOrigen;
    public static String nuevoDestino;
    public static String nuevoPrecio;
    
    
    public static void crearParada() {
    	ViajeUber viajeNuevo = ViajeUber.getViaje();
        viajeNuevo.setOrigen(nuevoOrigen);
        viajeNuevo.setDestino(nuevoDestino);
        viajeNuevo.setPrecio(nuevoPrecio);
        System.out.println(viajeNuevo);
    }
    
    
            
    public static void main(String[] args) {
        
        
        //Solo puede haber un viaje en curso
        
        System.out.println("Viaje de Uber en curso");
        ViajeUber viajeEnCurso = ViajeUber.getViaje();
        System.out.println(viajeEnCurso);
        
        System.out.println("Agregar nueva parada");
        System.out.println("Ingrese nuevo origen: ");
        nuevoOrigen=sc.nextLine();
        System.out.println("Ingrese nuevo destino: ");
        nuevoDestino=sc.nextLine();
        System.out.println("Ingrese nuevo precio: ");
        nuevoPrecio=sc.nextLine();
        
      //Agregar nueva parada (mismo viaje, seguido del anterior)
        if(nuevoOrigen.equals(viajeEnCurso.getDestino()))
    		crearParada();
        else 
        	System.out.println("No se pudo crear nueva parada");
        
    }
    
}
