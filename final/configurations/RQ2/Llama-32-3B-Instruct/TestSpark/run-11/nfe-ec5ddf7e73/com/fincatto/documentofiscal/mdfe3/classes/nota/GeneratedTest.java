package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.simpleframework.xml.Element;

public class GeneratedTest {

    @Element(name = "codigoInterno")
    public String codigoInterno;

    @Element(name = "placa")
    public String placa;

    @Element(name = "renavam")
    public String renavam;

    @Element(name = "tara")
    public String tara;

    @Element(name = "capacidadeKG")
    public String capacidadeKG;

    @Element(name = "capacidadeM3")
    public String capacidadeM3;

    @Test
    public void setCodigoInterno_DevemAlterarAtributoCodigoInterno() {
        new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno("codigoIntern");
        assertEquals("codigoIntern", codigoInterno);
    }

    @Test
    public void setPlaca_DevemAlterarAtributoPlaca() {
        new MDFInfoModalRodoviarioVeiculoReboque().setPlaca("placaReboqte");
        assertEquals("placaReboqte", placa);
    }

    @Test
    public void setRenavam_DevemAlterarAtributoRenavam() {
        new MDFInfoModalRodoviarioVeiculoReboque().setRenavam("renavamveic");
        assertEquals("renavamveic", renavam);
    }

    @Test
    public void setTara_DevemAlterarAtributoTara() {
        new MDFInfoModalRodoviarioVeiculoReboque().setTara("tararebqo");
        assertEquals("tararebqo", tara);
    }

    @Test
    public void getCapacidadeKG_ReturnaValorCorrente() {
        capacidadeKG = "10.0";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG);
        assertEquals("10.0", capacidadeKG);
    }

    @Test
    public void setCapacidadeKG_SetaValorDeCapacidadeKG() {
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG("outro valor");
        assertEquals("outro valor", capacidadeKG);
    }

    @Test
    public void getCapacidadeM3_ReturnaValorCorrente() {
        capacidadeM3 = "10.0";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals("10.0", capacidadeM3);
    }

    @Test
    public void setCapacidadeM3_SetaValorDeCapacidadeM3() {
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3("outro valor");
        assertEquals("outro valor", capacidadeM3);
    }

}