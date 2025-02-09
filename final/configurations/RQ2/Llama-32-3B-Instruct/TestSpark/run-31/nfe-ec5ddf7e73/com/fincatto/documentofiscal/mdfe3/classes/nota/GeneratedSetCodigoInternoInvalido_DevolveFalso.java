package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCodigoInternoInvalido_DevolveFalso {

    @Test
    public void setCodigoInternoInvalido_DevolveFalso() {
        String codigoInterno = "";
        MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        boolean resultado = mdfInfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertFalse(resultado);
    }

}