/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import dominio.Asistencia;
import dominio.Empleado;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class EmpleadoUtil {
    
    
    public static boolean getValidarEmpleado(Empleado e , String clave){
        boolean encontrado= false;
        if (e!=null) {
             if ( e.getClave().equals(clave)) {
             encontrado = true;
           
        }
        }
        return encontrado;
    }
 
}


 