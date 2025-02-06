package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

import java.util.Optional;

public class GeneratedSetRenavam_TipoValorStringTest {

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
    public void setRenavam_TipoValorStringTest() {
        assertThrows(ClassCastException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(123));
    }

}