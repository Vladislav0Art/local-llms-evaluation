package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "1234567890";
        vehicle.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, vehicle.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "AAA1234";
        vehicle.setPlaca(placa);
        assertEquals(placa, vehicle.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "12345678901";
        vehicle.setRenavam(renavam);
        assertEquals(renavam, vehicle.getRenavam());
    }

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque vehicle = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "12345";
        vehicle.setTara(tara);
        assertEquals(tara, vehicle.getTara());
    }

}