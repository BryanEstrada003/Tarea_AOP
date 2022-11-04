
public class Uber {

    public static void main(String[] args) {
        
        //Solo puede haber un viaje en curso
        
        System.out.println("Viaje de Uber en curso");
        ViajeUber viajeEnCurso = ViajeUber.getViaje();
        System.out.println(viajeEnCurso);
        
        System.out.println("Agregar nuevo viaje (seguido del anterior)");
        ViajeUber viajeNuevo = ViajeUber.getViaje();
        viajeNuevo.setOrigen("Trabajo");
        viajeNuevo.setDestino("Casa de mamá");
        viajeNuevo.setPrecio(5);
        System.out.println(viajeNuevo);
        
    }
    
}
