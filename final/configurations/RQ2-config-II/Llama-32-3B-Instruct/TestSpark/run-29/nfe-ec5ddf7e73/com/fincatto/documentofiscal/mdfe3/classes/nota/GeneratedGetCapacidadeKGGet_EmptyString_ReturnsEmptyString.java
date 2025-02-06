package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedGetCapacidadeKGGet_EmptyString_ReturnsEmptyString {

    @Test
    public void getCapacidadeKGGet_EmptyString_ReturnsEmptyString() {
        final String capacidadeKG = "";
        final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals(capacidadeKG, object.getCapacidadeKG());
    }

}