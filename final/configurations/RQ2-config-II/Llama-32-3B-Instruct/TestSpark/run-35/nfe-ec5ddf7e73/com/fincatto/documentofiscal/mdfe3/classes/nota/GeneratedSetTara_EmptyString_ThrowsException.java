package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetTara_EmptyString_ThrowsException {

    @Test
    public void setTara_EmptyString_ThrowsException() {
        final String tara = "";
        assertThrows(IllegalArgumentException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara));
    }

}