package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class GeneratedTestSetCapacidadeM3 {

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    public void testGetCapacidadeKG(@ParameterizedSource(String[]values) String capacidadeKG) {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals(capacidadeKG, instance.getCapacidadeKG());
    }

    @Test
    public void testSetCapacidadeM3() {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "100m3";
        instance.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, instance.getCapacidadeM3());
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    public void testSetPlaca(String placa) {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        instance.setPlaca(placa);
    }

}