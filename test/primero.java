/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import pruebasUnitarias.ExceptionPersonalizada;
import pruebasUnitarias.cajas;

/**
 *
 * @author Piero
 */
@RunWith(value=Parameterized.class)
public class primero {
   
    private int edad;
    private boolean esperado;
    
    public primero(int edad, boolean esperado)
    {
    this.edad=edad;
    this.esperado=esperado;
}
    
    @Parameters
    public static ArrayList<Object[]> getData()
    {
        
  ArrayList<Object[]> d = new ArrayList<>();
        d.add(new Object[] {8,false});
        d.add(new Object[] {17,false});
        d.add(new Object[] {18,true});
        d.add(new Object[] {40,true});
        d.add(new Object[] {41,false});
        d.add(new Object[] {65,false});
        return d;
    }
    
    @Test
    public void testVerificar() throws ExceptionPersonalizada
    {
        cajas c= new cajas();
        assertEquals(esperado,c.validar(this.edad)); 
    }
    
    
}
