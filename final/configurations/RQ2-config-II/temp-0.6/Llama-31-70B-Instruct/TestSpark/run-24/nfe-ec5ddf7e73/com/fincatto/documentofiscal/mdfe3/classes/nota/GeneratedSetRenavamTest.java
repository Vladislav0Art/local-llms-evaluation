package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedSetRenavamTest {

    @Mock
    MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Test
    public void setRenavamTest() {
        reboque.setRenavam("12345678901");
        assertEquals("12345678901", reboque.getRenavam());
    }

}