package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedSetCapacidadeKG_NovoValor_Test {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCapacidadeKG_NovoValor_Test() {
        String capacidadeKg = "capacidade_kg";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKg);
        assertEquals(capacidadeKg, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}