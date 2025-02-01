package com.fincatto.documentofiscal.mdfe3.classes.nota;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedSetTaraTest {

    @Test
    public void setTaraTest() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        modalRodoviarioReboque.setTara("4321");
        assertEquals("4321", modalRodoviarioReboque.getTara());
    }

}