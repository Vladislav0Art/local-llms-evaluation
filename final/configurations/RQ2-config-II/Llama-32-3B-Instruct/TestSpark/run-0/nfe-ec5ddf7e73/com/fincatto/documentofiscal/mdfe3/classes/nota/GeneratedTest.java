package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void setCodigoInterno_ValidarcodigoInterno_DevolverNull() {
        // given
        String codigoInterno = "1234567890";
        when("setCodigoInterno").thenReturn(codigoInterno);

        // when and then
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCodigoInterno(codigoInterno);
        assertEquals(null, mdf.getCodigoInterno());
    }

    @Test
    public void setPlaca_Validarplaca_DevolverNull() {
        // given
        String placa = "ABC123";
        when("setPlaca").thenReturn(placa);

        // when and then
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setPlaca(placa);
        assertEquals(null, mdf.getPlaca());
    }

    @Test
    public void setRenavam_Validarrenavam_DevolverNull() {
        // given
        String renavam = "1234567890";
        when("setRenavam").thenReturn(renavam);

        // when and then
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setRenavam(renavam);
        assertEquals(null, mdf.getRenavam());
    }

    @Test
    public void setTara_ValidarTara_DevolverNull() {
        // given
        String tara = "1234567890";
        when("setTara").thenReturn(tara);

        // when and then
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setTara(tara);
        assertEquals(null, mdf.getTara());
    }

    @Test
    public void getCapacidadeKG_DevolverValorNull() {
        // when and then
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals(null, mdf.getCapacidadeKG());
    }

    @Test
    public void setCapacidadeKG_Validarcapacidadekg_DevolverNull() {
        // given
        String capacidadeKG = "1000";
        when("setCapacidadeKG").thenReturn(capacidadeKG);

        // when and then
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeKG(capacidadeKG);
        assertEquals(null, mdf.getCapacidadeKG());
    }

    @Test
    public void getCapacidadeM3_DevolverValorNull() {
        // when and then
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertEquals(null, mdf.getCapacidadeM3());
    }

    @Test
    public void setCapacidadeM3_ValidarcapacidadeM3_DevolverNull() {
        // given
        String capacidadeM3 = "1000";
        when("setCapacidadeM3").thenReturn(capacidadeM3);

        // when and then
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeM3(capacidadeM3);
        assertEquals(null, mdf.getCapacidadeM3());
    }

}