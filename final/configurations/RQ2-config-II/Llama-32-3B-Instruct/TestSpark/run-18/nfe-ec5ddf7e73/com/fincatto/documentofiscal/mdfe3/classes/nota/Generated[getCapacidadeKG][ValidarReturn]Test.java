package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class Generated[getCapacidadeKG][ValidarReturn]

Test {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboqueMock;

    @Test
    public void [getCapacidadeKG][ValidarReturn]Test() {
        String capacidadeKG = "1000.00";
        when(mdfInfoModalRodoviarioVeiculoReboqueMock.getCapacidadeKG()).thenReturn(capacidadeKG);
        assertEquals(capacidadeKG, mdfInfoModalRodoviarioVeiculoReboqueMock.getCapacidadeKG());
    }

}