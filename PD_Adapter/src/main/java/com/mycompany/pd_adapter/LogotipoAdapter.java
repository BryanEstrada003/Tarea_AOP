/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pd_adapter;

import java.awt.Image;
import java.util.List;

/**
 *
 * @author HOME
 */
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
