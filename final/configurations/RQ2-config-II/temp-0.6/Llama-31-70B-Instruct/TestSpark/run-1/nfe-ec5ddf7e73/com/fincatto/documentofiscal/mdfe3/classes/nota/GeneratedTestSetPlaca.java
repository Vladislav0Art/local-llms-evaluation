package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTestSetPlaca {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void testSetPlaca() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setPlaca("AB12CD34");
        assertEquals("AB12CD34", reboque.getPlaca());
    }

}