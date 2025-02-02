package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;
import org.mockito.Mockito;

public class Generated[setPlaca][Invalid]

Test {

    @Element(name = "capKG")
    private String capacidadeKGMock = Mockito.mock(String.class);

    public void setCapacidadeKg ( final String capacidadeKG){
        capacidadeKGMock = capacidadeKG;
    }

    @Test
    public void [setPlaca][Invalid]Test() {
        final String placa = "";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertTrue(DFStringValidador.placaDeVeiculo(placa, "Placa do reboque"));
    }

}