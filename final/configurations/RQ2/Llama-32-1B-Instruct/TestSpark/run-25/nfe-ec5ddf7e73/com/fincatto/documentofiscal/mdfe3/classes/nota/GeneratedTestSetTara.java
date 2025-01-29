package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.simpleframework.xml.Element;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

public class GeneratedTestSetTara {

    @ParameterizedTest
    @CsvSource({
            "12345,RENAVAM-001", "67890,Placa-002"
    })
    public void testSetCodigoInterno(String codigoInterno, String renavam, String placa) {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setCodigoInterno(codigoInterno);
        object.setRenavam(renavam);
        object.setPlaca(placa);

        assertEquals("RENAVAM-001", object.getCodigoInterno());
        assertEquals("Placa-002", object.getPlaca());
    }

    @Test
    public void testSetTara() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setTara("Tara");

        assertEquals("Tara", object.getTara());

        Mockito.when(DFStringValidador.validate(tara)).thenReturn(true);
        object.setTara("Tara2");
        Mockito.when(DFStringValidador.validate(tara)).thenReturn(false);

        assertEquals(null, object.getTara());
    }

}