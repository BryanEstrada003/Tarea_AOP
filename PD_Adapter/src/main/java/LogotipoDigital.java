
import java.awt.Image;
import java.util.List;

public class LogotipoDigital{
    protected Image Figura;
    protected List CodeRGB;
    protected boolean imprimible;

    public LogotipoDigital(Image Figura, List CodeRGB) {
        this.Figura = Figura;
        this.CodeRGB = CodeRGB;
        this.imprimible=false;
        
    }
    
    //public static boolean imprimible() {
    //	return false;
    //}
    
    public void mostrarPantalla(){
        // mostrar en pantalla la img del logotipo
    }
}
