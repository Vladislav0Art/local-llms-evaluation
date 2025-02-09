package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedGetCapacidadeKG_Satisfatorio {

    @Test
    public void getCapacidadeKG_Satisfatorio() {
        String capacidadeKG = "1000kg";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String resultado = mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG();
        assertEquals(capacidadeKG, resultado);
    }

}