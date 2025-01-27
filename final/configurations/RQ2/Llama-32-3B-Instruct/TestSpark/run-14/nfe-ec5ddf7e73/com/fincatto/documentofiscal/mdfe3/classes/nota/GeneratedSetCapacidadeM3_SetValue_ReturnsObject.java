package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetCapacidadeM3_SetValue_ReturnsObject {

    private final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCapacidadeM3_SetValue_ReturnsObject() {
        String capacidadeM3 = "2.0m3";
        object.setCapacidadeM3(capacidadeM3);
        assertTrue(object.getCapacidadeM3().equals(capacidadeM3));
    }

}