package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetCapacidadeKG_SetValue_ReturnsObject {

    private final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCapacidadeKG_SetValue_ReturnsObject() {
        String capacidadeKG = "1500kg";
        object.setCapacidadeKG(capacidadeKG);
        assertTrue(object.getCapacidadeKG().equals(capacidadeKG));
    }

}