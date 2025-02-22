package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedSetTaraTest {

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "12345";
        vehicle.setTara(tara);
        assertEquals(tara, vehicle.getTara());
    }

}