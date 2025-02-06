package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetCapacidadeKG_TipoInvalido_ThrowsException {

    @Test
    public void setCapacidadeKG_TipoInvalido_ThrowsException() {
        final String capacidadeKg = "abc";
        assertThrows(IllegalArgumentException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKg));
    }

}