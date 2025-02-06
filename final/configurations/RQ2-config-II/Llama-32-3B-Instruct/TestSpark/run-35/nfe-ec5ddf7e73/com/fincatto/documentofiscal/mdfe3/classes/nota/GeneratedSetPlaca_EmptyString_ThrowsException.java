package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetPlaca_EmptyString_ThrowsException {

    @Test
    public void setPlaca_EmptyString_ThrowsException() {
        final String placa = "";
        assertThrows(IllegalArgumentException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setPlaca(placa));
    }

}