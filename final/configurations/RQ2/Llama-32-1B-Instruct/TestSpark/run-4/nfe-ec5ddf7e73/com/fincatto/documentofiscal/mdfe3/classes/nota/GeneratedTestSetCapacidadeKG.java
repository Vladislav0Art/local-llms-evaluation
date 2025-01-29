package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class GeneratedTestSetCapacidadeKG {

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    public void testGetCapacidadeKG(@ParameterizedSource(String[]values) String capacidadeKG) {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals(capacidadeKG, instance.getCapacidadeKG());
    }

    @Test
    public void testSetCapacidadeKG() {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "100kg";
        instance.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, instance.getCapacidadeKG());
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    public void testGetCapacidadeM3(@ParameterizedSource(String[]values) String capacidadeM3) {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals(capacidadeM3, instance.getCapacidadeM3());
    }

}