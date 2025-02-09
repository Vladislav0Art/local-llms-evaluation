package com.fincatto.documentofiscal.mdfe3.classes.nota;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTestWhenValidarValido {

    private boolean isValid(String cadena) {
        return true;
    }

    public void validar(String cadena) {
        // Implementación de la lógica de validación
    }
}

public class GeneratedTest {

    @Mock
    private DFStringValidador validador;

    @Test
    public void testWhenValidarValido() {
        // Given
        when(validador.isValid(anyString())).thenReturn(true);

        // When
        boolean validar = validador.validar("test");

        // Then
        assertTrue(validar);
    }

}