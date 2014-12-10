/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class Galeria {
    ArrayList<Imagensita> imagenes;
    
    public Galeria (){
    imagenes= new ArrayList<Imagensita>();
    Imagensita i1=new Imagensita();
    
    i1.setUrl("/Proyecto/1.png");
    i1.setTitulo("Tacones con flores");
    i1.setDescripcion("Estos tacones son ideales para usarse con mezclilla"+"para todo tipo de temporada");
    
    
    Imagensita i2=new Imagensita();
    
    i2.setUrl("/Proyecto/2.png");
    i2.setTitulo("Tacones Rosas");
    i2.setDescripcion("Estos tacones son ideales para novias o  otro tipo de evneto "+"para protagonista");
    
    Imagensita i3=new Imagensita();
    
    i3.setUrl("/Proyecto/3.png");
    i3.setTitulo("Tacones Dorados");
    i3.setDescripcion("Estos tacones son perfectos para salir "+"con plataforma es lo mejor ");
    
    
     Imagensita i4=new Imagensita();
    
    i4.setUrl("/Proyecto/4.png");
    i4.setTitulo("Botines");
    i4.setDescripcion("Ideales para temporada de frio "+"con plataforma es lo mejor ");
    
     Imagensita i5=new Imagensita();
    
    i5.setUrl("/Proyecto/5.png");
    i5.setTitulo("Tacones de ante ");
    i5.setDescripcion("Estos tacones son perfectos para salir a un evento y mas que nada de salon ");
    
    
      //Agregar estas imagenss al ArrayList
        
        imagenes.add(i1);
        imagenes.add(i2);
        imagenes.add(i3);
        imagenes.add(i4);
        imagenes.add(i5);
    
   
    }
    
    public ArrayList<Imagensita> leerTodas (){
    return imagenes;
    
    }
    
    public void setImagenes (ArrayList<Imagensita> imagenes){
    this.imagenes = imagenes;
    
    }
}
