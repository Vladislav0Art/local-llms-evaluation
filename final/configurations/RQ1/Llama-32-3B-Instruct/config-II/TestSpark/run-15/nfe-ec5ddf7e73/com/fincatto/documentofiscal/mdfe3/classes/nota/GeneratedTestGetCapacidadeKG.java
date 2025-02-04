package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.Optional;

public class GeneratedTestGetCapacidadeKG {

    @Test
    public void testGetCapacidadeKG() {
        String capacidadeKG = "5";
        MDFInfoModalRodoviarioVeiculoReboleq reboque = new MDFInfoModalRodoviarioVeiculoReboleq();
        reboque.setCapacidadeKG(capacidadeKG);
        assertEquals(5, Integer.parseInt(reboque.getCapacidadeKG()), 0);
    }

}