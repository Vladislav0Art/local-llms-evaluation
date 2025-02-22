package com.fincatto.documentofiscal.mdfe3.classes.nota;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

import org.mockito.Mock;

public class GeneratedSetRenavamTest {

    @Mock
    private MDFInfoModalRodoviarioVeiculoReboque veiculoReboque;

    @Test
    public void setRenavamTest() {
        Mockito.doNothing().when(veiculoReboque).setRenavam("12345678901");
    }

}