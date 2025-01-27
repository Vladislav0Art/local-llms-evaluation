package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetCapacidadeKG_SuaiValors_Test {

    @Test
    public void setCapacidadeKG_SuaiValors_Test() {
        String capacidadeKG = "CAPACIDADE_KG_VALIDO";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    public static class MDFStringValidador {
        public boolean validar(String texto) {
            // Implementacao do validador de string
            return true;
        }
    }

}