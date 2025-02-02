package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetRenavamValidoTest {

    @Test
    public void setRenavamValidoTest() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavamValida = "123456789";
        obj.setRenavam(renavamValida);
        assertEquals("Renavam do reboque", obj.getRenavam());
    }

}