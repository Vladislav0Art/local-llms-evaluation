package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Optional;

public class GeneratedTestSetTara {

    @Test
    public void testSetTara() {
        String tara = "10";
        MDFInfoModalRodoviarioVeiculoReboleq reboque = new MDFInfoModalRodoviarioVeiculoReboleq();
        reboque.setTara(tara);
        assertEquals("10", reboque.getTara());
    }

}