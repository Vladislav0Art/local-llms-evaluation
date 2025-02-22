package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedShouldSetCapacidadeKG {

    private MDFInfoModalRodoviarioVeiculoReboque reboque;

    @Before
    public void setUp() {
        reboque = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void shouldSetCapacidadeKG() {
        //arrange
        String capacidade = "12345";

        //act
        reboque.setCapacidadeKG(capacidade);

        //assert
        assertEquals(capacidade, reboque.getCapacidadeKG());
    }

}