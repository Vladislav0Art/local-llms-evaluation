package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Random;

public class GeneratedSetRenavam_RenavamGetTest {

    @Test
    public void setRenavam_RenavamGetTest() {
        final String renavam = "123456789";
        final MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam(renavam);
        assertEquals(renavam, reboque.getRenavam());
    }

}