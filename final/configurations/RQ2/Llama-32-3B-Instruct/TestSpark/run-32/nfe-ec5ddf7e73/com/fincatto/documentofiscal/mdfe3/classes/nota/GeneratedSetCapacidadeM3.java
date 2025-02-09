package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

public class GeneratedSetCapacidadeM3 {

    @Test
    public void setCapacidadeM3() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "capacidadeM3";
        mdf.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mdf.getCapacidadeM3());
    }

}