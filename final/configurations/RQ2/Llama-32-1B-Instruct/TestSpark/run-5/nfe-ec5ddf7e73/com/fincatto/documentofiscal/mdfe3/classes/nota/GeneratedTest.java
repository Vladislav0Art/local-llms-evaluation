package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Element xml;

    @InjectMocks
    private MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque;

    public Element getXml() {
        return xml;
    }

    public String getCodigoInterno() {
        return mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno();
    }

    public void setCodigoInterno(final String codigoInterno) {
        when(xml.getAttribute("codigoInterno")).thenReturn(anyString());
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
    }

    @Test
    public void testSetCodigoInterno() {
        setCodigoInterno("TEST");
        assertEquals("TEST", getCodigoInterno());
    }

    public Element getPlaca() {
        return xml;
    }

    public void setPlaca(final String placa) {
        when(xml.getAttribute("placa")).thenReturn(anyString());
        mdfInfoModalRodoviarioVeiculoReboque.setPlaca(placa);
    }

    @Test
    public void testSetPlaca() {
        setPlaca("TEST");
        assertEquals("TEST", getPlaca());
    }

    public Element getRenavam() {
        return xml;
    }

    public void setRenavam(final String renavam) {
        when(xml.getAttribute("renavam")).thenReturn(anyString());
        mdfInfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
    }

    @Test
    public void testSetRenavam() {
        setRenavam("TEST");
        assertEquals("TEST", getRenavam());
    }

    public Element getTara() {
        return xml;
    }

    public void setTara(final String tara) {
        when(xml.getAttribute("tara")).thenReturn(anyString());
        mdfInfoModalRodoviarioVeiculoReboque.setTara(tara);
    }

    @Test
    public void testSetTara() {
        setTara("TEST");
        assertEquals("TEST", getTara());
    }

    @Test
    public void testGetCapacidadeKG() {
        Element xmlElement = new Element();
        when(xmlElement.getAttribute("capacidadekg")).thenReturn(anyString());
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(xmlElement.getAttribute("capacidadekg"));
        assertEquals("TEST", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void testSetCapacidadeKG() {
        Element xmlElement = new Element();
        when(xmlElement.getAttribute("capacidadekg")).thenReturn(anyString());
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(xmlElement.getAttribute("capacidadekg"));
        assertEquals("TEST", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

    @Test
    public void testGetCapacidadeM3() {
        Element xmlElement = new Element();
        when(xmlElement.getAttribute("capacitivm3")).thenReturn(anyString());
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(xmlElement.getAttribute("capacitivm3"));
        assertEquals("TEST", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

    @Test
    public void testSetCapacidadeM3() {
        Element xmlElement = new Element();
        when(xmlElement.getAttribute("capacitivm3")).thenReturn(anyString());
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(xmlElement.getAttribute("capacitivm3"));
        assertEquals("TEST", mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}