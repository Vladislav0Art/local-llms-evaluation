package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque testClass = new MDFInfoModalRodoviarioVeiculoReboque();
        testClass.setCodigoInterno("123456");
        assertEquals("123456", testClass.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque testClass = new MDFInfoModalRodoviarioVeiculoReboque();
        testClass.setPlaca("ABC1234");
        assertEquals("ABC1234", testClass.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque testClass = new MDFInfoModalRodoviarioVeiculoReboque();
        testClass.setRenavam("123456");
        assertEquals("123456", testClass.getRenavam());
    }

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque testClass = new MDFInfoModalRodoviarioVeiculoReboque();
        testClass.setTara("123456");
        assertEquals("123456", testClass.getTara());
    }

}