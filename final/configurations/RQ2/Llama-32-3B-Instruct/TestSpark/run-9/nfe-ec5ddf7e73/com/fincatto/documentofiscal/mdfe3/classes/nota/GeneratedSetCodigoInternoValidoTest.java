package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Optional;

public class GeneratedSetCodigoInternoValidoTest {

    @Test
    public void setCodigoInternoValidoTest() {
        final String codigoInterno = "CODIGOINTERNO";
        final MDFInfoModalRodoviarioVeiculoReboque mfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertTrue(DFStringValidador.isValido(codigoInterno));
    }

}