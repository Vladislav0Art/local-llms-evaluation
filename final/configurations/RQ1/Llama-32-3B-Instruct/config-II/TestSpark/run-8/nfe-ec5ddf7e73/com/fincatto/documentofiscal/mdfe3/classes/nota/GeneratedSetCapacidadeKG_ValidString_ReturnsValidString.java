package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedSetCapacidadeKG_ValidString_ReturnsValidString {

    @Test
    public void setCapacidadeKG_ValidString_ReturnsValidString() {
        String capacidadeKG = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, obj.getCapacidadeKG());
    }

}