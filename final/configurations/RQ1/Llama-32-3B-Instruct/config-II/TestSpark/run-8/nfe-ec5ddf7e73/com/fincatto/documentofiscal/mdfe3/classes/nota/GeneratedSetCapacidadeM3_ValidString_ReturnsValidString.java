package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.UUID;

public class GeneratedSetCapacidadeM3_ValidString_ReturnsValidString {

    @Test
    public void setCapacidadeM3_ValidString_ReturnsValidString() {
        String capacidadeM3 = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, obj.getCapacidadeM3());
    }

}