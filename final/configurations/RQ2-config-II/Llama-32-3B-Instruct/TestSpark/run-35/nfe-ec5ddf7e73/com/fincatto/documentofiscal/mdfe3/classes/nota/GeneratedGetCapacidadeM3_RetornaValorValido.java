package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedGetCapacidadeM3_RetornaValorValido {

    @Test
    public void getCapacidadeM3_RetornaValorValido() {
        final String capacidadeM3 = "100";
        final MDFInfoModalRodoviarioVeiculoReboque mf = new MDFInfoModalRodoviarioVeiculoReboque();
        mf.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mf.getCapacidadeM3());
    }

}