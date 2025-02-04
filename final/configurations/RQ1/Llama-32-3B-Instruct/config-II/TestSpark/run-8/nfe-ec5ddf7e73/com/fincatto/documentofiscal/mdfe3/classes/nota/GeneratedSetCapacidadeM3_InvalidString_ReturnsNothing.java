package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedSetCapacidadeM3_InvalidString_ReturnsNothing {

    @Test
    public void setCapacidadeM3_InvalidString_ReturnsNothing() {
        String capacidadeM3 = "abc";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertEquals("", obj.getCapacidadeM3());
    }

}