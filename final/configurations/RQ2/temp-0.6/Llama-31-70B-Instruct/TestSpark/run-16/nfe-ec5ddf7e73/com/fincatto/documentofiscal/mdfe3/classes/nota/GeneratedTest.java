package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedTest {

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

    @Test
    public void shouldSetCapacidadeM3() {
        //arrange
        String capacidade = "12";

        //act
        reboque.setCapacidadeM3(capacidade);

        //assert
        assertEquals(capacidade, reboque.getCapacidadeM3());
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