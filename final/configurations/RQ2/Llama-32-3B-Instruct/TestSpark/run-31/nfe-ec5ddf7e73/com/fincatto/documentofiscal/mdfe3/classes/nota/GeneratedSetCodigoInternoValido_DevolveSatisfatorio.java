package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCodigoInternoValido_DevolveSatisfatorio {

    @Test
    public void setCodigoInternoValido_DevolveSatisfatorio() {
        String codigoInterno = "123456";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean resultado = mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertTrue(resultado);
    }

}