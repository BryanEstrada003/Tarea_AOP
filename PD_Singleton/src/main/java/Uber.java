
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
        
    	//Solo puede haber un viaje en curso
        
        System.out.println("Viaje de Uber en curso");
        ViajeUber viajeEnCurso = ViajeUber.getViaje();
        System.out.println(viajeEnCurso);
        
        
        System.out.println("Agregar nueva parada");
        //Agregar nueva parada (mismo viaje, seguido del anterior)
        
    	crearParada(verficado);
    }
}
