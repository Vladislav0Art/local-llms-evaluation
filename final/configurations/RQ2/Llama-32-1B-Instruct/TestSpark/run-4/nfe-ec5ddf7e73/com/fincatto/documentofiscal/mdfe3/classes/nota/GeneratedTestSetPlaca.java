package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class GeneratedTestSetPlaca {

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    public void testGetCapacidadeKG(@ParameterizedSource(String[]values) String capacidadeKG) {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals(capacidadeKG, instance.getCapacidadeKG());
    }

    @Test
    public void testSetPlaca() {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "abc";
        instance.setPlaca(placa);
        assertEquals(placa, instance.getPlaca());
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    public void testSetRenavam(String renavam) {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        instance.setRenavam(renavam);
    }

}