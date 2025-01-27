package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Optional;
import java.math.BigDecimal;

import org.simpleframework.xml.Element;
import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void codigoInternoNull_ThrowsNullPointerException() {
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(NullPointerException.class, () -> mdf.setCodigoInterno(null));
    }

    @Test
    public void setCodigoInternoSuccess() {
        final String codigoInterno = "123456";
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCodigoInterno(codigoInterno);
        assertThat(mdf.getCodigoInterno(), is(codigoInterno));
    }

    @Test
    public void placaNull_ThrowsNullPointerException() {
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(NullPointerException.class, () -> mdf.setPlaca(null));
    }

    @Test
    public void setPlacaSuccess() {
        final String placa = "ABC123";
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setPlaca(placa);
        assertThat(mdf.getPlaca(), is(placa));
    }

    @Test
    public void renavamNull_ThrowsNullPointerException() {
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(NullPointerException.class, () -> mdf.setRenavam(null));
    }

    @Test
    public void setRenavamSuccess() {
        final String renavam = "1234567890";
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setRenavam(renavam);
        assertThat(mdf.getRenavam(), is(renavam));
    }

    @Test
    public void taraNull_ThrowsNullPointerException() {
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(NullPointerException.class, () -> mdf.setTara(null));
    }

    @Test
    public void setTaraSuccess() {
        final String tara = "10kg";
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setTara(tara);
        assertThat(mdf.getTara(), is(tara));
    }

    @Test
    public void capacidadeKGNull_ThrowsNullPointerException() {
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(NullPointerException.class, () -> mdf.setCapacidadeKG(null));
    }

    @Test
    public void setCapacidadeKGSuccess() {
        final String capacidadeKG = "100kg";
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeKG(capacidadeKG);
        assertThat(mdf.getCapacidadeKG(), is(capacidadeKG));
    }

    @Test
    public void capacidadeM3Null_ThrowsNullPointerException() {
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        assertThrows(NullPointerException.class, () -> mdf.setCapacidadeM3(null));
    }

    @Test
    public void setCapacidadeM3Success() {
        final String capacidadeM3 = "100m3";
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeM3(capacidadeM3);
        assertThat(mdf.getCapacidadeM3(), is(capacidadeM3));
    }

    @Test
    public void getCapacidadeKGSuccess() {
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeKG("100kg");
        assertThat(mdf.getCapacidadeKG(), is("100kg"));
    }

    @Test
    public void getCapacidadeM3Success() {
        final MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeM3("100m3");
        assertThat(mdf.getCapacidadeM3(), is("100m3"));
    }

}