/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author SONY
 */
public class PersistenciaUsuario {
    
    
    public void guardarUsuario(Usuario u)throws Exception{
        
        File f=new File("D:\\archivaldo.xxx");
        FileOutputStream fos=new FileOutputStream(f); 
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(u); 
        System.out.println("Objeto usuario guardado");
        
    }
    
    public Usuario leerUsuario()throws Exception{
         File f=new File("D:\\archivaldo.xxx");
         FileInputStream fis=new FileInputStream(f);
         ObjectInputStream ois=new ObjectInputStream(fis);
         Usuario u=(Usuario)ois.readObject();
        System.out.println("Usuario recobrado");
    return u;
    }
    
    
}

