
public class ViajeUber {

    private static ViajeUber viaje;
    Usuario usuario;
    private String conductor, origen, destino,precio;

    private ViajeUber(Usuario usuario, String conductor, String origen, String destino, String precio) {
        this.usuario=usuario;
        this.conductor = conductor;
        this.origen = origen;
        this.destino = destino;
        this.precio = precio;
    }
    
    
    public static ViajeUber getViaje (){
        
        if(viaje==null)
            viaje = new ViajeUber(Usuario.getUsuario(),"Juanito", "Casa", "Trabajo", "10");
        return viaje;
        
    }

    @Override
    public String toString() {
        return "Viaje en curso: " + "Usuario= " + usuario.getNombre() + ", Conductor=" + conductor + ", Origen=" + origen + ", Destino=" + destino + ", Precio=" + '$'+ precio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getConductor() {
        return conductor;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    
    
}
