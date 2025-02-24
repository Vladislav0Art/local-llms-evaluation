package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedSetRenavamTest {

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque testObject = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);
        testObject.setRenavam("1234567890");
        assertEquals("1234567890", testObject.getRenavam());
    }

}