package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Calendar;

public class Generated[setCodigoInterno][ValidarCodigoInterno]

Test {

    @Test
    public void [setCodigoInterno][ValidarCodigoInterno]Test() {
        final String codigoInterno = "1234567890";
        final MDFInfoModalRodoviarioVeiculoReboque object = new MDFInfoModalRodoviarioVeiculoReboque();
        object.setCodigoInterno(codigoInterno);
        assertTrue(object.getCodigoInterno().matches("[A-Z]{10}"));
    }

}