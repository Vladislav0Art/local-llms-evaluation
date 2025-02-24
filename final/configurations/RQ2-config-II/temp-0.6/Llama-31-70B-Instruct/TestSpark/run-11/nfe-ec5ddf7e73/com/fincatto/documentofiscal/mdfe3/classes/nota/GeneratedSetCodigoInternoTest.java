package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedSetCodigoInternoTest {

    // Testing setCodigoInterno method

    @Test
    public void setCodigoInternoTest() {
        MDFInfoModalRodoviarioVeiculoReboque reboque = new MDFInfoModalRodoviarioVeiculoReboque();
        reboque.setCodigoInterno("ABCD1234");
        assertEquals("ABCD1234", reboque.getCodigoInterno());
    }

}