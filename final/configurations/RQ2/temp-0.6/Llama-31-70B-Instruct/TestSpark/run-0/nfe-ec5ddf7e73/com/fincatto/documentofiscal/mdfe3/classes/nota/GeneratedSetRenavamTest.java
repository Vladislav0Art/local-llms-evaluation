package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedSetRenavamTest {

    @Test
    public void setRenavamTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "123456789";
        obj.setRenavam(renavam);
        assertEquals(renavam, obj.getRenavam());
    }

}