package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class Generated[setCapacidadeM3][ValidarReturn]

Test {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboqueMock;

    @Test
    public void [setCapacidadeM3][ValidarReturn]Test() {
        String capacidadeM3 = "1000.00";
        when(mdfInfoModalRodoviarioVeiculoReboqueMock.setCapacidadeM3(capacidadeM3)).thenReturn(null);
        mdfInfoModalRodoviarioVeiculoReboqueMock.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mdfInfoModalRodoviarioVeiculoReboqueMock.getCapacidadeM3());
    }

}