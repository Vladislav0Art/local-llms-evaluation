package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCodigoInterno_EmptyString_ThrowsException {

    @Test
    public void setCodigoInterno_EmptyString_ThrowsException() {
        final String codigoInterno = "";
        assertThrows(IllegalArgumentException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCodigoInterno(codigoInterno));
    }

}