package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import com.fincatto.documentofiscal.validadores.DFStringValidador;
import org.simpleframework.xml.Element;

public class GeneratedTest {

    @Test
    public void [setCodigoInterno_EmptyString_MustReturnNull]()

    {
        final String codigoInterno = "";
        final MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        final Object result = obj.setCodigoInterno(codigoInterno);
        assertEquals(null, result);
    }

    @Test
    public void [setCodigoInterno_InvalidString_MustReturnNull]()

    {
        final String codigoInterno = "Invalid";
        final MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        final Object result = obj.setCodigoInterno(codigoInterno);
        assertNotNull(result);
    }

    @Test
    public void [setPlaca_EmptyString_MustReturnNull]()

    {
        final String placa = "";
        final MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        final Object result = obj.setPlaca(placa);
        assertEquals(null, result);
    }

    @Test
    public void [setRenavam_EmptyString_MustReturnNull]()

    {
        final String renavam = "";
        final MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        final Object result = obj.setRenavam(renavam);
        assertEquals(null, result);
    }

    @Test
    public void [setTara_EmptyString_MustReturnNull]()

    {
        final String tara = "";
        final MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        final Object result = obj.setTara(tara);
        assertEquals(null, result);
    }

    @Test
    public void [getCapacidadeKG_NullString_ReturnsNull]()

    {
        final String capacidadeKG = null;
        final MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        final Object result = obj.getCapacidadeKG();
        assertEquals(null, result);
    }

    @Test
    public void [getCapacidadeM3_NullString_ReturnsNull]()

    {
        final String capacidadeM3 = null;
        final MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        final Object result = obj.getCapacidadeM3();
        assertEquals(null, result);
    }

    @Test
    public void [setCapacidadeKG_NullString_MustNotThrowException]()

    {
        final String capacidadeKG = null;
        final MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeKG(capacidadeKG);
    }

    @Test
    public void [setCapacidadeM3_NullString_MustNotThrowException]()

    {
        final String capacidadeM3 = null;
        final MDFInfoModalRodoviarioVeiculoReboque obj = new MDFInfoModalRodoviarioVeiculoReboque();
        obj.setCapacidadeM3(capacidadeM3);
    }

}