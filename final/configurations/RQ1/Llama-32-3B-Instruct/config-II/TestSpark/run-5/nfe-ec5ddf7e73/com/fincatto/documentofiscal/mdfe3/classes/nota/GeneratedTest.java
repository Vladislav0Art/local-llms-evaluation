package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.lang.reflect.Field;

public class GeneratedTest {

    @Test
    public void testGetCapacidadeKG() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals(null, obj.getCapacidadeKG());
    }

    @Test
    public void testSetCapacidadeKG_withValidString() throws Exception {
        Field field = MDFInfoModalRodoviarioVeiculoReboque.class.getDeclaredField("capacidadeKG");
        field.setAccessible(true);
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG("10kg");
        assertEquals("10kg", (String) field.get(obj));
    }

    @Test
    public void testSetCapacidadeKG_withInvalidString() throws Exception {
        Field field = MDFInfoModalRodoviarioVeiculoReboque.class.getDeclaredField("capacidadeKG");
        field.setAccessible(true);
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG("a");
        assertNull(field.get(obj));
    }

    @Test
    public void testSetPlaca_withValidString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador.placaDeVeiculo("1234", "Placa do reboque");
        obj.setPlaca("1234");
        assertEquals("1234", obj.placa);
    }

    @Test
    public void testSetPlaca_withInvalidString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador.placaDeVeiculo("a", "Placa do reboque");
        obj.setPlaca("a");
        assertNull(obj.placa);
    }

    @Test
    public void testSetRenavam_withValidString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador.renavamDeVeiculo("1234", "Renavam do reboque");
        obj.setRenavam("1234");
        assertEquals("1234", obj.renavam);
    }

    @Test
    public void testSetRenavam_withInvalidString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador.renavamDeVeiculo("a", "Renavam do reboque");
        obj.setRenavam("a");
        assertNull(obj.renavam);
    }

    @Test
    public void testSetTara_withValidString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador.capacidadeNDigitos("10", "Tara em reboque", 5);
        obj.setTara("10");
        assertEquals("10", obj.tara);
    }

    @Test
    public void testSetTara_withInvalidString() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        DFStringValidador.capacidadeNDigitos("a", "Tara em reboque", 5);
        obj.setTara("a");
        assertNull(obj.tara);
    }

}