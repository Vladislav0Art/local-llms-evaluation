package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class Generated[setRenavam][ValidarParametrosRenavam]

Test {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboqueMock;

    @Test
    public void [setRenavam][ValidarParametrosRenavam]Test() {
        String renavam = "123456789012";
        when(mdfInfoModalRodoviarioVeiculoReboqueMock.setRenavam(renavam)).thenReturn(null);
        mdfInfoModalRodoviarioVeiculoReboqueMock.setRenavam(renavam);
        assertEquals(renavam, mdfInfoModalRodoviarioVeiculoReboqueMock.getRenavam());
    }

}