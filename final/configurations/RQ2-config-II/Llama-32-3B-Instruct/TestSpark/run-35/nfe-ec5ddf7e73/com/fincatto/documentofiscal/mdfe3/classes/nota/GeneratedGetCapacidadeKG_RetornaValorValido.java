package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedGetCapacidadeKG_RetornaValorValido {

    @Test
    public void getCapacidadeKG_RetornaValorValido() {
        final String capacidadeKg = "100";
        final MDFInfoModalRodoviarioVeiculoReboque mf = new MDFInfoModalRodoviarioVeiculoReboque();
        mf.setCapacidadeKG(capacidadeKg);
        assertEquals(capacidadeKg, mf.getCapacidadeKG());
    }

}