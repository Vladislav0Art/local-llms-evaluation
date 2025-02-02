package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.mockito.Mockito;

public class Generated[setCapacidadeM3][Limites]

Test {

    @Element(name = "capKG")
    private String capacidadeKGMock = Mockito.mock(String.class);

    public void setCapacidadeKg ( final String capacidadeKG){
        capacidadeKGMock = capacidadeKG;
    }

    @Test
    public void [setCapacidadeM3][Limites]Test() {
        final String capacidadeM3 = "123";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertEquals(2, DFStringValidador.capacidadeNDigitos(capacidadeM3, "Capacidade em M3 reboque", 2));
    }

}