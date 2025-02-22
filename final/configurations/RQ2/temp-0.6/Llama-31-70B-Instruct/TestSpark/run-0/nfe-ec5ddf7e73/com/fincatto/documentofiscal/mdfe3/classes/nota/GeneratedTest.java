package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "1234567890";
        obj.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, obj.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "ABC1234";
        obj.setPlaca(placa);
        assertEquals(placa, obj.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "123456789";
        obj.setRenavam(renavam);
        assertEquals(renavam, obj.getRenavam());
    }

}