package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void setCodigoInterno

    ValidadorDeString() {
        final String codigoInterno = "codigo";
        final String[] validadors = new String[]{"codigo"};
        assertTrue(DFStringValidador.validar(codigoInterno, validadors));
    }

    @Test
    public void setPlaca

    ValidadorDeString() {
        final String placa = "placa";
        final String[] validadors = new String[]{"placa"};
        assertTrue(DFStringValidador.validar(placa, validadors));
    }

    @Test
    public void setRenavam

    ValidadorDeString() {
        final String renavam = "renavam";
        final String[] validadors = new String[]{"renavam"};
        assertTrue(DFStringValidador.validar(renavam, validadors));
    }

    @Test
    public void setTara

    ValidadorDeString() {
        final String tara = "tara";
        final String[] validadors = new String[]{"tara"};
        assertTrue(DFStringValidador.validar(tara, validadors));
    }

    @Test
    public void getCapacidadeKG

    RetornaValorValido() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCapacidadeKG("capacidade");
        assertEquals("capacidade", modal.getCapacidadeKG());
    }

    @Test
    public void getCapacidadeM3

    RetornaValorValido() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCapacidadeM3("capacidade");
        assertEquals("capacidade", modal.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeKG

    ValidoValor() {
        final String capacidade = "capacidade";
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCapacidadeKG(capacidade);
        assertEquals(capacidade, modal.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeM3

    ValidoValor() {
        final String capacidade = "capacidade";
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        modal.setCapacidadeM3(capacidade);
        assertEquals(capacidade, modal.getCapacidadeM3());
    }

}