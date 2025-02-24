package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedSetTaraTest {

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque testObject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);
        testObject.setTara("1000");
        assertEquals("1000", testObject.getTara());
    }

}