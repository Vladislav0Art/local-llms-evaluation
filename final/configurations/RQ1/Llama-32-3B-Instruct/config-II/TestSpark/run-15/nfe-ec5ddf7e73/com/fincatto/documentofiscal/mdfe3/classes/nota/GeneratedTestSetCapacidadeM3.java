package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Optional;

public class GeneratedTestSetCapacidadeM3 {

    @Test
    public void testSetCapacidadeM3() {
        String capacidadeM3 = "2";
        MDFInfoModalRodoviarioVeiculoReboleq reboque = new MDFInfoModalRodoviarioVeiculoReboleq();
        reboque.setCapacidadeM3(capacidadeM3);
        assertEquals(2, Integer.parseInt(reboque.getCapacidadeM3()), 0);
    }

}