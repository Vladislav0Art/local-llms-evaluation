package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedSetRenavamTest {

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque testClass = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "1234567890";

        testClass.setRenavam(renavam);

        assertEquals("1234567890", testClass.getRenavam());
    }

}