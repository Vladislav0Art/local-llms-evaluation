package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque testObject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);
        testObject.setCodigoInterno("1234");
        assertEquals("1234", testObject.getCodigoInterno());
    }

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque testObject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);
        testObject.setPlaca("ABC1234");
        assertEquals("ABC1234", testObject.getPlaca());
    }

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque testObject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);
        testObject.setRenavam("1234567890");
        assertEquals("1234567890", testObject.getRenavam());
    }

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque testObject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);
        testObject.setTara("1000");
        assertEquals("1000", testObject.getTara());
    }

}