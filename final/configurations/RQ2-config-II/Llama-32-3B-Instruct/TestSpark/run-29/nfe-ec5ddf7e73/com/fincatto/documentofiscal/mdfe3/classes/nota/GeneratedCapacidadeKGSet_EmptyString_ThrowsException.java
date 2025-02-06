package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCapacidadeKGSet_EmptyString_ThrowsException {

    @Test
    public void capacidadeKGSet_EmptyString_ThrowsException() {
        final String capacidadeKG = "";
        assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeKG(capacidadeKG));
    }
}

}