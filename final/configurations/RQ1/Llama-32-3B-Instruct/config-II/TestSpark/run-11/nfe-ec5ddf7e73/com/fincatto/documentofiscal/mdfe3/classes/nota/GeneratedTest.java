package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void testCodigoInternoSet() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "1234567890";
        object.setCodigoInterno(codigoInterno);
        assertEquals("1234567890", object.getCodigoInterno());
    }

    @Test
    public void testPlacaSet() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "ABC123";
        object.setPlaca(placa);
        assertEquals("ABC123", object.getPlaca());
    }

    @Test
    public void testRenavamSet() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "123456789";
        object.setRenavam(renavam);
        assertEquals("123456789", object.getRenavam());
    }

    @Test
    public void testTaraSet() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "10000";
        object.setTara(tara);
        assertEquals("10000", object.getTara());
    }

    @Test
    public void testCapacidadeKGSet() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "20000";
        object.setCapacidadeKG(capacidadeKG);
        assertEquals("20000", object.getCapacidadeKG());
    }

    @Test
    public void testCapacidadeM3Set() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "100";
        object.setCapacidadeM3(capacidadeM3);
        assertEquals("100", object.getCapacidadeM3());
    }

    @Test
    public void testSetCodigoInternoValidation() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInternoInvalido = "123";
        boolean result = DFStringValidador.validador(codigoInternoInvalido, "Codigo interno Veiculo Reboque", 10, false, false);
        assertFalse(result);
    }

    @Test
    public void testSetPlacaValidation() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String placaInvalida = "123";
        DFStringValidador.placaDeVeiculo(placaInvalida, "Placa do reboque");
        boolean result = false;
        assertEquals(result, DFStringValidador.placaDeVeiculo(placaInvalida, "Placa do reboque"));
    }

    @Test
    public void testSetRenavamValidation() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavamInvalido = "1234567890";
        DFStringValidador.placaDeVeiculo(renavamInvalido, "Placa do reboque");
        boolean result = false;
        assertEquals(result, DFStringValidador.placaDeVeiculo(renavamInvalido, "Placa do reboque"));
    }

    @Test
    public void testSetTaraValidation() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String taraInvalida = "abcd";
        DFStringValidador.capacidadeNDigitos(taraInvalida, "Tara em reboque", 5);
        boolean result = false;
        assertEquals(result, DFStringValidador.capacidadeNDigitos(taraInvalida, "Tara em reboque", 5));
    }

    @Test
    public void testSetCapacidadeKGValidation() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKGBeyondLimit = "200000";
        DFStringValidador.capacidadeNDigitos(capacidadeKGBeyondLimit, "Capacidade em KG reboque", 5);
        boolean result = false;
        assertEquals(result, DFStringValidador.capacidadeNDigitos(capacidadeKGBeyondLimit, "Capacidade em KG reboque", 5));
    }

    @Test
    public void testSetCapacidadeM3Validation() {
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeMBeyondLimit = "10000";
        DFStringValidador.capacidadeNDigitos(capacidadeMBeyondLimit, "Capacidade em M3 reboque", 2);
        boolean result = false;
        assertEquals(result, DFStringValidador.capacidadeNDigitos(capacidadeMBeyondLimit, "Capacidade em M3 reboque", 2));
    }

}