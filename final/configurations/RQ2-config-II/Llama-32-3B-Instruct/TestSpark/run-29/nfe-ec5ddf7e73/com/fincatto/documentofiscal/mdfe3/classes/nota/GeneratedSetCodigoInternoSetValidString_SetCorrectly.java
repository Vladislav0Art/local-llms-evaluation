package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedSetCodigoInternoSetValidString_SetCorrectly {

    @Test
    public void setCodigoInternoSetValidString_SetCorrectly() {
        final String codigoInterno = "123456";
        final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setCodigoInterno(codigoInterno);
        assertTrue(DFStringValidador.isValido(codigoInterno));
    }

}