package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedSetCapacidadeKG_InvalidString_ReturnsNothing {

    @Test
    public void setCapacidadeKG_InvalidString_ReturnsNothing() {
        String capacidadeKG = "abc";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
        assertEquals("", obj.getCapacidadeKG());
    }

}