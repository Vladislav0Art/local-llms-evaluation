package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTaraSet_EmptyString_ThrowsException {

    @Test
    public void taraSet_EmptyString_ThrowsException() {
        final String tara = "";
        assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setTara(tara));
    }

}