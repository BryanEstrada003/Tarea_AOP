
import java.awt.Image;
import java.util.List;

public class LogotipoAdapter extends LogotipoDigital implements CMYK{
    
    public LogotipoAdapter(Image Figura, List CodeRGB){
        super(Figura,CodeRGB);
    }
    
    @Override
    public int getCian(){
        int value=0;
        //del CodeRGB extrae para obtener el valor C
        return value;
    }
    
    @Override
    public int getMagenta(){
        int value=0;
        //del CodeRGB extrae para obtener el valor M
        return value;
    }
    
    @Override
    public int getYellow(){
        int value=0;
        //del CodeRGB extrae para obtener el valor Y
        return value;
    }
    
    @Override
    public int getBlack(){
        int value=0;
        //del CodeRGB extrae para obtener el valor B
        return value;
    }
    
}
