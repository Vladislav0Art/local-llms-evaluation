package com.fincatto.documentofiscal.mdfe3.classes.nota;

import java.util.function.Function;

public class GeneratedTest {

    public static String getCapacidadeKG(String tipo) {
        return " capacity KG: " + tipo;
    }

    public static String getCapacidadeM3(String tipo) {
        return " capacity M3: " + tipo;
    }
}

public class Test {

    @Test
    public void testGetCapacidadeKG() {
        MDFInfoModalRodoviarioVeiculoReboque.MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = mdf.getCapacidadeKG("capacidade KG");
        assertEquals("capacity KG: capacidad KG", capacidadeKG);
    }

    @Test
    public void testGetCapacidadeM3() {
        MDFInfoModalRodoviarioVeiculoReboque.MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = mdf.getCapacidadeM3("capacidade M3");
        assertEquals("capacity M3: capacidade M3", capacidadeM3);
    }

    @Test
    public void testGetCapacidadeKG_SpecificTipo() {
        MDFInfoModalRodoviarioVeiculoReboque.MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = mdf.getCapacidadeKG("capacidade KG");
        assertEquals("capacity KG: capacidad KG", capacidadeKG);
    }

    @Test
    public void testGetCapacidadeM3_SpecificTipo() {
        MDFInfoModalRodoviarioVeiculoReboque.MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = mdf.getCapacidadeM3("capacidade M3");
        assertEquals("capacity M3: capacidade M3", capacidadeM3);
    }

    @Test
    public void testGetCapacidadeKG_EmTipo() {
        MDFInfoModalRodoviarioVeiculoReboque.MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = mdf.getCapacidadeKG("capacidade KG");
        assertEquals("capacity KG: Not found", capacidadeKG);
    }

    @Test
    public void testGetCapacidadeM3_EmTipo() {
        MDFInfoModalRodoviarioVeiculoReboque.MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = mdf.getCapacidadeM3("capacidade M3");
        assertEquals("capacity M3: Not found", capacidadeM3);
    }

    @Test
    public void testGetCapacidadeKG_SpecificTipo_EmValor() {
        MDFInfoModalRodoviarioVeiculoReboque.MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = mdf.getCapacidadeKG("capacidade KG");
        assertEquals("capacity KG: especificado por valor", capacidadeKG);
    }

    @Test
    public void testGetCapacidadeM3_SpecificTipo_EmValor() {
        MDFInfoModalRodoviarioVeiculoReboque.MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = mdf.getCapacidadeM3("capacidade M3");
        assertEquals("capacity M3: especificado por valor", capacidadeM3);
    }

}