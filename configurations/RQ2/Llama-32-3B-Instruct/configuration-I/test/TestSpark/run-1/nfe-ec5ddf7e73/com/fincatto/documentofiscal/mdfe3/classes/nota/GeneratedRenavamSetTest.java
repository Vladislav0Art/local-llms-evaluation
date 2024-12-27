package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Optional;

import com.fincatto.documentofiscal.mdfe3.classes.MDFInfoModalRodoviarioVeiculoReboque;
import com.fincatto.documentofiscal.mdfe3.classes.MDFInfoModalRodoviarioVeiculo;

public class GeneratedRenavamSetTest {

    @Test
    public void renavamSetTest() {
        String renavam = "TEST";
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setRenavam(renavam);
        assertEquals(renavam, object.getRenavam());
    }

}