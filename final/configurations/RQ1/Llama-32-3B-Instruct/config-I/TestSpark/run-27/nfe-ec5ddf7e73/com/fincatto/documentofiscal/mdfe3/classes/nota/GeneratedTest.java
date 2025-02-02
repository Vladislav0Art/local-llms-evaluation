package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import com.fincatto.documentofiscal.mdfe3.classes.nota.MDFInfoModalRodoviarioVeiculoReboque;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_NonValidReturnsNull() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "123456789012";
        obj.setCodigoInterno(codigoInterno);
        assertNull(obj.getCodigoInterno());
    }

    @Test
    public void setCodigoInterno_ValidReturnsCorrectValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String codigoInterno = "123456789012";
        obj.setCodigoInterno(codigoInterno);
        assertEquals("12345678901", obj.getCodigoInterno());
    }

    @Test
    public void setPlaca_InvalidReturnsNull() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "12345";
        obj.setPlaca(placa);
        assertNull(obj.getPlaca());
    }

    @Test
    public void setPlaca_ValidReturnsCorrectValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "ABC123";
        obj.setPlaca(placa);
        assertEquals("ABC123", obj.getPlaca());
    }

    @Test
    public void setRenavam_InvalidIntervaloReturnsNull() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "123456789";
        obj.setRenavam(renavam);
        assertNull(obj.getRenavam());
    }

    @Test
    public void setRenavam_ValidIntervaloReturnsCorrectValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String renavam = "123456789";
        obj.setRenavam(renavam);
        assertEquals("12345", obj.getRenavam());
    }

    @Test
    public void setTara_InvalidNDigitosReturnsNull() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "123";
        obj.setTara(tara);
        assertNull(obj.getTara());
    }

    @Test
    public void setTara_ValidNDigitosReturnsCorrectValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "12345";
        obj.setTara(tara);
        assertEquals("12345", obj.getTara());
    }

    @Test
    public void setCapacidadeKG_InvalidNDigitosReturnsNull() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "123456";
        obj.setCapacidadeKG(capacidadeKG);
        assertNull(obj.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKG_ValidNDigitosReturnsCorrectValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "12345";
        obj.setCapacidadeKG(capacidadeKG);
        assertEquals("12345", obj.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeM3_InvalidNDigitosReturnsNull() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "123456789";
        obj.setCapacidadeM3(capacidadeM3);
        assertNull(obj.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3_ValidNDigitosReturnsCorrectValue() {
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "12";
        obj.setCapacidadeM3(capacidadeM3);
        assertEquals("12", obj.getCapacidadeM3());
    }

}