package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedSetRenavam_EmptyString_ThrowsException {

    @Test
    public void setRenavam_EmptyString_ThrowsException() {
        final String renavam = "";
        assertThrows(IllegalArgumentException.class, () -> new MDFInfoModalRodoviarioVeiculoReboque().setRenavam(renavam));
    }

}