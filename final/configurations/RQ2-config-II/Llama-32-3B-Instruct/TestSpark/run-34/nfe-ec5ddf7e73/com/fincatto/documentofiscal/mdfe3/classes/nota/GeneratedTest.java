package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private DFStringValidador validador;

    public void setup() {
        when(validador.isValidar(anyString())).thenReturn(true);
    }

    @Test
    public void testSetCodigoInterno_EqualValue_ReturnsTrue() {
        String codigoInterno = "123456";
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        when(validador.isValidar(codigoInterno)).thenReturn(true);
        boolean result = object.setCodigoInterno(codigoInterno);
        assertThat(result, is(true));
    }

    @Test
    public void testSetPlaca_EqualValue_ReturnsTrue() {
        String placa = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        when(validador.isValidar(placa)).thenReturn(true);
        boolean result = object.setPlaca(placa);
        assertThat(result, is(true));
    }

    @Test
    public void testSetRenavam_EqualValue_ReturnsTrue() {
        String renavam = "123456";
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        when(validador.isValidar(renavam)).thenReturn(true);
        boolean result = object.setRenavam(renavam);
        assertThat(result, is(true));
    }

    @Test
    public void testSetTara_EqualValue_ReturnsTrue() {
        String tara = "ABC123";
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        when(validador.isValidar(tara)).thenReturn(true);
        boolean result = object.setTara(tara);
        assertThat(result, is(true));
    }

    @Test
    public void testGetCapacidadeKG_EqualValue_ReturnsString() {
        String capacidadeKG = "123.45";
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        when(validador.isValidar(capacidadeKG)).thenReturn(true);
        String result = object.getCapacidadeKG();
        assertThat(result, is(capacidadeKG));
    }

    @Test
    public void testSetCapacidadeKG_EqualValue_ReturnsTrue() {
        String capacidadeKG = "123.45";
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        when(validador.isValidar(capacidadeKG)).thenReturn(true);
        boolean result = object.setCapacidadeKG(capacidadeKG);
        assertThat(result, is(true));
    }

    @Test
    public void testGetCapacidadeM3_EqualValue_ReturnsString() {
        String capacidadeM3 = "456.78";
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        when(validador.isValidar(capacidadeM3)).thenReturn(true);
        String result = object.getCapacidadeM3();
        assertThat(result, is(capacidadeM3));
    }

    @Test
    public void testSetCapacidadeM3_EqualValue_ReturnsTrue() {
        String capacidadeM3 = "456.78";
        MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        when(validador.isValidar(capacidadeM3)).thenReturn(true);
        boolean result = object.setCapacidadeM3(capacidadeM3);
        assertThat(result, is(true));
    }

}