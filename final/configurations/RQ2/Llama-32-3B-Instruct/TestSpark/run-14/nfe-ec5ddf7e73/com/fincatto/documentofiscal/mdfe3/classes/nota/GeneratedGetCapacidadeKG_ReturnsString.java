package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedGetCapacidadeKG_ReturnsString {

    private final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void getCapacidadeKG_ReturnsString() {
        String capacidadeKG = "2000kg";
        object.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, object.getCapacidadeKG());
    }

}