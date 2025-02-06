package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class Generated[setCodigoInterno][ValidarParametrosInterno]

Test {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboqueMock;

    @Test
    public void [setCodigoInterno][ValidarParametrosInterno]Test() {
        String codigoInterno = "123456789012";
        when(mdfInfoModalRodoviarioVeiculoReboqueMock.setCodigoInterno(codigoInterno)).thenReturn(null);
        mdfInfoModalRodoviarioVeiculoReboqueMock.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, mdfInfoModalRodoviarioVeiculoReboqueMock.getCodigoInterno());
    }

}