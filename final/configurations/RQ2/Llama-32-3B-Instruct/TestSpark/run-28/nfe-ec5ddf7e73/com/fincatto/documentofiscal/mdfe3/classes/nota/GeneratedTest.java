package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

import java.util.Arrays;

public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    @Test
    public void testSetCodigoInterno() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "codigo-interno";
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
    }

    @Test
    public void testSetPlaca() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "placa";
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
    }

    @Test
    public void testSetRenavam() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "renavam";
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
    }

    @Test
    public void testSetTara() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "tara";
        mdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
    }

    @Test
    public void testGetCapacidadeKG() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "capacidade-KG";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void testSetCapacidadeKG() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "capacidade-KG";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
    }

    @Test
    public void testGetCapacidadeM3() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "capacidade-M3";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

    @Test
    public void testSetCapacidadeM3() {
        mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "capacidade-M3";
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
    }

}