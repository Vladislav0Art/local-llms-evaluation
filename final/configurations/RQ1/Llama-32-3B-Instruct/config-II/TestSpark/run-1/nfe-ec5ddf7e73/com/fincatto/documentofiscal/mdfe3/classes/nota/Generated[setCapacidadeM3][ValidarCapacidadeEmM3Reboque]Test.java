package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class Generated[setCapacidadeM3][ValidarCapacidadeEmM3Reboque]

Test {

    private MDFInfoModalRodoviarioVeiculoReboque notafiscal;
    private final String codigoInternoMock = "1234567890";
    private final String placaMock = "ABC123";
    private final String renavamMock = "123456789";
    private final String taraMock = "10000";

    @Before
    public void inicializar () {
        notafiscal = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void [setCapacidadeM3][ValidarCapacidadeEmM3Reboque]Test() {
        notafiscal.setCapacidadeM3("20");
        assertEquals("20", notafiscal.getCapacidadeM3());
        verify(notafiscal, times(1)).setCapacidadeM3("20");
    }
}

class TestHelper {

    @Mock
    private DFStringValidador validador;

    @Mock
    private MDFInfoModalRodoviarioVeiculo veiculo;

    public void inicializar() {
        // ...
    }

    public void setup(String codigoInterno) {
        when(validador.validar(any(), anyString(), anyInt(), anyBoolean(), anyBoolean())).thenReturn(codigoInterno);
    }

}