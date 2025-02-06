package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedRenavamSet_EmptyString_ThrowsException {

    @Test
    public void renavamSet_EmptyString_ThrowsException() {
        final String renavam = "";
        assertThrows(NullPointerException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam));
    }

}