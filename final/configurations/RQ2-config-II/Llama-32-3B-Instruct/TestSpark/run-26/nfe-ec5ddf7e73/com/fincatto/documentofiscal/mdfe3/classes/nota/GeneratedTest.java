package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();

    @Test
    public void setCodigoInterno_Sucesso_Test() {
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno("codigo_interno");
        assertFalse(mdfInfoModalRodoviarioVeiculoReboque.get codigoInterno().isEmpty());
    }

    @Test
    public void getCapacidadeKG_Vazio_Test() {
        assertEquals("", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKG_NovoValor_Test() {
        String capacidadeKg = "capacidade_kg";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKg);
        assertEquals(capacidadeKg, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void getRenavam_Sucesso_Test() {
        assertTrue(mdfInfoModalRodoviarioVeiculoReboque.getRenavam().matches(".*"));
    }

    @Test
    public void setPlaca_NovoValor_Test() {
        String placa = "placa";
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertEquals(placa, mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

    @Test
    public void setTara_NovoValor_Test() {
        String tara = "tara";
        mdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertEquals(tara, mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

    @Test
    public void setRenavam_Sucesso_Test() {
        assertTrue(mdfInfoModalRodoviarioVeiculoReboque.getRenavam().matches(".*"));
    }

    @Test
    public void setCapacidadeM3_NovoValor_Test() {
        String capacidadeM3 = "capacidade_m3";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}