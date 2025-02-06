package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCapacidadeM3_TipoInvalido_ThrowsException {

    @Test
    public void setCapacidadeM3_TipoInvalido_ThrowsException() {
        final String capacidadeM3 = "abc";
        assertThrows(IllegalArgumentException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3));
    }

}