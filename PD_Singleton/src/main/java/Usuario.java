
public class Usuario { 
    
    //Una vez iniciada sesión, el usuario va a ser el mismo en todos los viajes

    private String nombre, user, password;
    
    private static Usuario usuario;

    private Usuario(String nombre, String user, String password) {
        this.nombre = nombre;
        this.user = user;
        this.password = password;
    }
     
    
    public static Usuario getUsuario (){
        
        if(usuario==null)
            usuario = new Usuario("Jose", "jose2022","joselitoPro32");
        return usuario;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getUser() {
        return user;
    }
    
    public String getPassword() {
        return password;
    }
    
}
