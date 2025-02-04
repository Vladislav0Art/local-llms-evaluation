package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Optional;

public class GeneratedTestSetRenavam {

    @Test
    public void testSetRenavam() {
        String renavam = "123456789";
        MDFInfoModalRodoviarioVeiculoReboleq reboque = new MDFInfoModalRodoviarioVeiculoReboleq();
        reboque.setRenavam(renavam);
        assertEquals("123456789", reboque.getRenavam());
    }

}