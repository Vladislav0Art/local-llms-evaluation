package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.math.BigDecimal;

public class GeneratedSetCodigoInterno Validador {

    @Test
    public void setCodigoInterno

    Validador() {
        String codigoInterno = "codigoInterno";
        MDFInfoModalRodoviarioVeiculoReboque mdf = new MDFInfoModalRodoviarioVeiculoReboque();
        mdf.setCodigoInterno(codigoInterno);
        assertTrue(DFStringValidador.isValidar(codigoInterno));
    }

}