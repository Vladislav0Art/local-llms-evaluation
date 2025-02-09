package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

public class GeneratedGetCapacidadeKG {

    @Test
    public void getCapacidadeKG() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "capacidadeKG";
        mdf.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, mdf.getCapacidadeKG());
    }

}