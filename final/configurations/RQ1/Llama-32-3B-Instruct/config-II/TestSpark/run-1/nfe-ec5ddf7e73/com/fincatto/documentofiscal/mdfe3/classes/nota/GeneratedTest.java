package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedTest {

    private MDFInfoModalRodoviarioVeiculoReboque notafiscal;
    private final String codigoInternoMock = "1234567890";
    private final String placaMock = "ABC123";
    private final String renavamMock = "123456789";
    private final String taraMock = "10000";

    @Before
    public void inicializar() {
        notafiscal = new MDFInfoModalRodoviarioVeiculoReboque();
    }

    @Test
    public void [setCodigoInterno][ValidarCodigoInterno]

    Test() {
        notafiscal.setCodigoInterno(codigoInternoMock);
        verify(notafiscal, times(1)).setCodigoInterno(codigoInternoMock);
    }

    @Test
    public void [setPlaca][ValidaPlacaDeReboque]

    Test() {
        notafiscal.setPlaca(placaMock);
        verify(notafiscal, times(1)).setPlaca(placaMock);
    }

    @Test
    public void [setRenavam][ValidaRenavamDoReboque]

    Test() {
        notafiscal.setRenavam(renavamMock);
        verify(notafiscal, times(1)).setRenavam(renavamMock);
    }

    @Test
    public void [setTara][ValidarTaraEmReboque]

    Test() {
        notafiscal.setTara(taraMock);
        verify(notafiscal, times(1)).setTara(taraMock);
    }

    @Test
    public void [getCapacidadeKG][DevolverValor]

    Test() {
        notafiscal.setCapacidadeKG("10");
        assertEquals("10", notafiscal.getCapacidadeKG());
        verify(notafiscal, times(1)).setCapacidadeKG("10");
    }

    @Test
    public void [setCapacidadeKG][ValidarCapacidadeEmKgReboque]

    Test() {
        notafiscal.setCapacidadeKG("10");
        assertEquals("10", notafiscal.getCapacidadeKG());
        verify(notafiscal, times(1)).setCapacidadeKG("10");
    }

    @Test
    public void [getCapacidadeM3][DevolverValor]

    Test() {
        notafiscal.setCapacidadeM3("20");
        assertEquals("20", notafiscal.getCapacidadeM3());
        verify(notafiscal, times(1)).setCapacidadeM3("20");
    }

    @Test
    public void [setCapacidadeM3][ValidarCapacidadeEmM3Reboque]

    Test() {
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