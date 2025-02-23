package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.mockito.Mock;

import static org.mockito.Mockito.*;

import org.mockito.MockitoAnnotations;

public class GeneratedSetTaraTest {

    @Mock
    MDFInfoModalRodoviarioVeiculoReboque mockedVeiculoReboque;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void setTaraTest() {
        mockedVeiculoReboque.setTara("12345");
        assertEquals("12345", mockedVeiculoReboque.getTara());
    }

}