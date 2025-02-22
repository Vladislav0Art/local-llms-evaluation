package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "AAA1234";
        vehicle.setPlaca(placa);
        assertEquals(placa, vehicle.getPlaca());
    }

}