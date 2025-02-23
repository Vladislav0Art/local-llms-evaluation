package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedSetPlacaTest {

    @Test
    public void setPlacaTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = Mockito.mock(MDFInfoModalRodoviarioVeiculoReboque.class);
        reboque.setPlaca("AB123456");
        assertEquals("AB123456", reboque.getPlaca());
    }

}