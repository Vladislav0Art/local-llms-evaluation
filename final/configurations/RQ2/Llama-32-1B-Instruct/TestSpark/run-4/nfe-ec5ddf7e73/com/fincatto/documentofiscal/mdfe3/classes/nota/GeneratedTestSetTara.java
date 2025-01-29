package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

public class GeneratedTestSetTara {

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    public void testGetCapacidadeKG(@ParameterizedSource(String[]values) String capacidadeKG) {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals(capacidadeKG, instance.getCapacidadeKG());
    }

    @Test
    public void testSetTara() {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "ghi";
        instance.setTara(tara);
        assertEquals(tara, instance.getTara());
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "3"})
    public void testGetCodigoInterno(String codigoInterno) {
        MDFInfoModalRodoviarioVeiculoReboque instance = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals(codigoInterno, instance.getCodigoInterno());
    }

}