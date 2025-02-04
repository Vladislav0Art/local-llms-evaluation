package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Map;

public class GeneratedSetCapacidadeKG CapacidadeNDigitos {

    @Test
    public void setCapacidadeKG

    CapacidadeNDigitos() {
        MDFInfoModalRodoviarioVeiculoReboque modalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        final String capacidadeKG = "12";
        modalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(2, capacidadeKG.length());
    }

}