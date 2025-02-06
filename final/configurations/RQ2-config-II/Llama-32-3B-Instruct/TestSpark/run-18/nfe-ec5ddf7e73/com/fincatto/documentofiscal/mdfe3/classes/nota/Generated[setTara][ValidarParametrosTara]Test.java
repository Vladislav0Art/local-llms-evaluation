package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class Generated[setTara][ValidarParametrosTara]

Test {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboqueMock;

    @Test
    public void [setTara][ValidarParametrosTara]Test() {
        String tara = "1000.00";
        when(mdfInfoModalRodoviarioVeiculoReboqueMock.setTara(tara)).thenReturn(null);
        mdfInfoModalRodoviarioVeiculoReboqueMock.setTara(tara);
        assertEquals(tara, mdfInfoModalRodoviarioVeiculoReboqueMock.getTara());
    }

}