package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetCodigoInternoInvalidoTest {

    @Test
    public void setCodigoInternoInvalidoTest() {
        final String codigoInterno = "CODIGOINTERNO";
        final MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertFalse(DFStringValidador.isValido(codigoInterno));
    }

}