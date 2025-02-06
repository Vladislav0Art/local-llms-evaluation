package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class Generated[setPlaca][ValidarParametrosPlaca]

Test {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboqueMock;

    @Test
    public void [setPlaca][ValidarParametrosPlaca]Test() {
        String placa = "ABC123";
        when(mdfInfoModalRodoviarioVeiculoReboqueMock.setPlaca(placa)).thenReturn(null);
        mdfInfoModalRodoviarioVeiculoReboqueMock.setPlaca(placa);
        assertEquals(placa, mdfInfoModalRodoviarioVeiculoReboqueMock.getPlaca());
    }

}