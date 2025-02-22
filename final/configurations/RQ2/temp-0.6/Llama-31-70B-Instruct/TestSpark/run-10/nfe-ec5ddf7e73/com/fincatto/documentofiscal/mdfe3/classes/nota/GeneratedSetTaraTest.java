package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetTaraTest {

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setTara("12345");
        assertEquals("12345", reboque.getTara());
    }

}