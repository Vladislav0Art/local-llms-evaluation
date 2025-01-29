package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSetTara {

    @Test
    public void testSetTara() {
        MDFInfoModalRodoviarioVeiculoReboque modelo = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "TAR-123";
        modelo.setTara(tara);
        assertEquals(tara, modelo.getTara());
    }

}