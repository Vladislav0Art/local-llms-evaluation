package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedShouldSetCapacidadeM3 {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Before
    public void setUp() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void shouldSetCapacidadeM3() {
        //arrange
        String capacidade = "12";

        //act
        reboque.setCapacidadeM3(capacidade);

        //assert
        assertEquals(capacidade, reboque.getCapacidadeM3());
    }

}