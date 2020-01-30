/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebasUnitarias;

/**
 *
 * @author Piero
 */
public class cajas {
    
    public cajas()
    {
        
    }   
    
    
        
    public boolean validar(int n1) throws ExceptionPersonalizada
    {
        int edad=n1;
        boolean valido = false;
        
        if(edad>=18 && edad<=40){
            
            return valido= true;
        }
        else
            if(edad>=18 || edad<=40)
            { return valido=false;
            }
            else
            {
               throw new ExceptionPersonalizada("error, edad menor de 0");
            }
            
   
        
    }
    
}
