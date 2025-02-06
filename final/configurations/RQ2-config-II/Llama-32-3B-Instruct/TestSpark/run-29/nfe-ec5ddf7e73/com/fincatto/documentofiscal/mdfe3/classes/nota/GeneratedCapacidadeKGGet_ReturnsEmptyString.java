package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCapacidadeKGGet_ReturnsEmptyString {

    @Test
    public void capacidadeKGGet_ReturnsEmptyString() {
        final String capacidadeKG = "0";
        final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals(capacidadeKG, object.getCapacidadeKG());
    }

}