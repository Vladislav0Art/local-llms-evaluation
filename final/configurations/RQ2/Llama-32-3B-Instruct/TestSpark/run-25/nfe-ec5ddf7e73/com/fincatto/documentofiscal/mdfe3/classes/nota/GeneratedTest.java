package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_SuaiValors_Test() {
        String codigoInterno = "CODIGO_INTERNO";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

    @Test
    public void setPlaca_Vazio_Test() {
        String placa = "";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertNull(mdfInfoModalRodoviarioVeiculoReboque.getPlaca());
    }

    @Test
    public void setRenavam_Invalido_Test() {
        String renavam = "RENAVAM_INVALIDO";
        MDFStringValidador dfStringValidador = new MDFStringValidador();
        assertFalse(dfStringValidador.validar(renavam));
    }

    @Test
    public void setRenavam_SuaiValors_Test() {
        String renavam = "RENAVAM_VALIDO";
        MDFStringValidador dfStringValidador = new MDFStringValidador();
        assertTrue(dfStringValidador.validar(renavam));
    }

    @Test
    public void setTara_Vazio_Test() {
        String tara = "";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertNull(mdfInfoModalRodoviarioVeiculoReboque.getTara());
    }

    @Test
    public void setCapacidadeM3_SuaiValors_Test() {
        String capacidadeM3 = "CAPACIDADE_M3_VALIDO";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

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