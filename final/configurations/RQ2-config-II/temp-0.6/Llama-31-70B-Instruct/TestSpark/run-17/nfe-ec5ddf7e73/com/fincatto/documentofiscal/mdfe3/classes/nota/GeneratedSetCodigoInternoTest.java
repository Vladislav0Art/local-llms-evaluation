package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mock;

import static org.mockito.Mockito.*;

import org.mockito.MockitoAnnotations;

public class GeneratedSetCodigoInternoTest {

    @Mock
    MDFInfoModalRodoviarioVeiculoReboque mockedVeiculoReboque;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void setCodigoInternoTest() {
        mockedVeiculoReboque.setCodigoInterno("1234567890");
        assertEquals("1234567890", mockedVeiculoReboque.getCodigoInterno());
    }

}