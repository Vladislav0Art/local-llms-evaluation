package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedGetCapacidadeM3_ReturnsString {

    private final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void getCapacidadeM3_ReturnsString() {
        String capacidadeM3 = "1.5m3";
        object.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, object.getCapacidadeM3());
    }

}