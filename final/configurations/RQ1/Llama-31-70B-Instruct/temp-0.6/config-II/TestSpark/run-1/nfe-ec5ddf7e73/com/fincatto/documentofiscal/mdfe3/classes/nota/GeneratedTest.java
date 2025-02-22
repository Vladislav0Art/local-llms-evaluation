package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque testClass = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "123456789";

        testClass.setCodigoInterno(codigoInterno);

        assertEquals("123456789", testClass.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque testClass = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "AAA1234";

        testClass.setPlaca(placa);

        assertEquals("AAA1234", testClass.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque testClass = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "1234567890";

        testClass.setRenavam(renavam);

        assertEquals("1234567890", testClass.getRenavam());
    }

}