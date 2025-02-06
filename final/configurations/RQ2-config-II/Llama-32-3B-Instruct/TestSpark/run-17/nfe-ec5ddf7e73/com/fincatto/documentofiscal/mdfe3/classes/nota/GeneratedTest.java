package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

import java.util.Optional;

public class GeneratedTest {

    @Element(name = "CodigoInterno")
    public String codigoInterno;

    @Element(name = "Placa")
    public String placa;

    @Element(name = "Renavam")
    public String renavam;

    @Element(name = "Tara")
    public String tara;

    @Element(name = "CapacidadeKG")
    public String capacidadeKG;

    @Element(name = "CapacidadeM3")
    public String capacidadeM3;

    @Test
    public void setCodigoInterno_VerificarValorNaoNuloTest() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCodigoInterno("123");
        assertTrue(mdf.getCodigoInterno().equals("123"));
    }

    @Test
    public void setCodigoInterno_TentandoValorNuloTest() {
        assertThrows(IllegalArgumentException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(null));
    }

    @Test
    public void getPlaca_VerificarValorNaoNuloTest() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setPlaca("abc");
        assertNotNull(mdf.getPlaca());
    }

    @Test
    public void setRenavam_TipoValorStringTest() {
        assertThrows(ClassCastException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(123));
    }

    @Test
    public void getTara_VerificarValorNaoNuloTest() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setTara("def");
        assertNotNull(mdf.getTara());
    }

    @Test
    public void setCapacidadeKG_TipoValorStringTest() {
        assertThrows(ClassCastException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(123));
    }

    @Test
    public void getCapacidadeM3_VerificarValorNaoNuloTest() {
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCapacidadeM3("ghi");
        assertNotNull(mdf.getCapacidadeM3());
    }

}