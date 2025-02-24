package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.*;

import org.junit.Test;
import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedSetTaraTest {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void setTaraTest() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setTara("1000");
        assertEquals("1000", reboque.getTara());
    }

}