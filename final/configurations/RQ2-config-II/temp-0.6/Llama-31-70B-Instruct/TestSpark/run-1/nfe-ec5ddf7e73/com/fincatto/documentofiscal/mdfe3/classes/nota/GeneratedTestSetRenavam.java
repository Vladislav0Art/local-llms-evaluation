package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestSetRenavam {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void testSetRenavam() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setRenavam("12345678901");
        assertEquals("12345678901", reboque.getRenavam());
    }

}