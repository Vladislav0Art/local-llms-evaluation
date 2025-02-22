package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedShouldSetCodigoInterno {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Before
    public void setUp() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void shouldSetCodigoInterno() {
        //arrange
        String codigoInterno = "codigoInterno";

        //act
        reboque.setCodigoInterno(codigoInterno);

        //assert
        assertEquals(codigoInterno, reboque.getCodigoInterno());
    }

}