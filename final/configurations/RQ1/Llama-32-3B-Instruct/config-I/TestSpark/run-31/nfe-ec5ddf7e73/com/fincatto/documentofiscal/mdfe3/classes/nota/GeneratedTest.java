package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_ValidadorReturnsNullWhenInputIsInvalid() {
        String codigoInterno = "InvalidInput";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertNull(obj.getCodigoInterno());
    }

    @Test
    public void setCodigoInterno_ValidadorReturnsInputWhenInputIsValid() {
        String codigoInterno = "123456789";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCodigoInterno(codigoInterno);
        assertEquals("123456789", obj.getCodigoInterno());
    }

    @Test
    public void setPlaca_ValidadorReturnsNullWhenInputIsInvalid() {
        String placa = "InvalidInput";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertNull(obj.getPlaca());
    }

    @Test
    public void setPlaca_ValidadorReturnsInputWhenInputIsValid() {
        String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setPlaca(placa);
        assertEquals("ABC123", obj.getPlaca());
    }

    @Test
    public void setRenavam_ValidadorReturnsNullWhenInputIsInvalid() {
        String renavam = "InvalidInput";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertNull(obj.getRenavam());
    }

    @Test
    public void setRenavam_ValidadorReturnsInputWhenInputIsValid() {
        String renavam = "123456789";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setRenavam(renavam);
        assertEquals("123456789", obj.getRenavam());
    }

    @Test
    public void setTara_ValidadorReturnsNullWhenInputIsInvalid() {
        String tara = "InvalidInput";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertNull(obj.getTara());
    }

    @Test
    public void setTara_ValidadorReturnsInputWhenInputIsValid() {
        String tara = "12345";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setTara(tara);
        assertEquals("12345", obj.getTara());
    }

    @Test
    public void setCapacidadeKG_ValidadorReturnsNullWhenInputIsInvalid() {
        String capacidadeKG = "InvalidInput";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
        assertNull(obj.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKG_ValidadorReturnsInputWhenInputIsValid() {
        String capacidadeKG = "1234";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
        assertEquals("1234", obj.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeM3_ValidadorReturnsNullWhenInputIsInvalid() {
        String capacidadeM3 = "InvalidInput";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertNull(obj.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3_ValidadorReturnsInputWhenInputIsValid() {
        String capacidadeM3 = "12";
        MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
        assertEquals("12", obj.getCapacidadeM3());
    }

}