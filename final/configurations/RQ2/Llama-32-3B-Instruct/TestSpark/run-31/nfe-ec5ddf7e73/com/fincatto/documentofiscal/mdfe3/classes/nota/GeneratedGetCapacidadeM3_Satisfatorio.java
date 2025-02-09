package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedGetCapacidadeM3_Satisfatorio {

    @Test
    public void getCapacidadeM3_Satisfatorio() {
        String capacidadeM3 = "1000m3";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String resultado = mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3();
        assertEquals(capacidadeM3, resultado);
    }

}