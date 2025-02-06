package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCodigoInternoSet_EmptyString_ThrowsException {

    @Test
    public void codigoInternoSet_EmptyString_ThrowsException() {
        final String codigoInterno = "";
        assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno));
    }

}