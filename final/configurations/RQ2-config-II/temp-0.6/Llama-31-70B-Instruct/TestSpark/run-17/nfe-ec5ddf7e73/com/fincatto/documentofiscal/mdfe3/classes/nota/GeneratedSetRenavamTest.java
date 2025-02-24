package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.*;

import org.junit.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetRenavamTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void setRenavamTest() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("12345678901234");
        assertEquals("12345678901234", reboque.getRenavam());
    }

}