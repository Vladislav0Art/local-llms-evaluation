package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

public class GeneratedSetCodigoInterno_ValidarValor_Encontrado {

    @Test
    public void setCodigoInterno_ValidarValor_Encontrado() {
        final String codigoInterno = "123456";
        final MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertTrue(mdfInfoModalRodoviarioVeiculoReboque.getCodigoInterno().equals(codigoInterno));
    }

}