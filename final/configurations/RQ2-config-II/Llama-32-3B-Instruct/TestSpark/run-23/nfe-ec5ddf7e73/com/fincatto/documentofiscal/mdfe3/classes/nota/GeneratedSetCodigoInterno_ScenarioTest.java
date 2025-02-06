package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedSetCodigoInterno_ScenarioTest {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCodigoInterno_ScenarioTest() {
        final String codigoInterno = "codigo_interno";
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}