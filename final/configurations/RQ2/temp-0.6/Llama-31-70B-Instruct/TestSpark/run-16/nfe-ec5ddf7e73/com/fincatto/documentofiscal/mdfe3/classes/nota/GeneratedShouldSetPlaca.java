package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedShouldSetPlaca {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Before
    public void setUp() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void shouldSetPlaca() {
        //arrange
        String placa = "placa";

        //act
        reboque.setPlaca(placa);

        //assert
        assertEquals(placa, reboque.getPlaca());
    }

}