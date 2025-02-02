package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.mockito.Mockito;

public class Generated[setTara][Limites]

Test {

    @Element(name = "capKG")
    private String capacidadeKGMock = Mockito.mock(String.class);

    public void setCapacidadeKg ( final String capacidadeKG){
        capacidadeKGMock = capacidadeKG;
    }

    @Test
    public void [setTara][Limites]Test() {
        final String tara = "123456789";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertEquals(5, DFStringValidador.capacidadeNDigitos(tara, "Tara em reboque", 5));
    }

}