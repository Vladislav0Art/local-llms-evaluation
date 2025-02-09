package com.fincatto.documentofiscal.mdfe3.classes.nota;

@RunWith(org.junit4.JUnit4ClassRunner.class)
public class GeneratedSetCodigoInterno_ValidarDadoValido_SetDeValorCorrecto {

    private String codigoInterno;
    private String placa;
    private String renavam;
    private String tara;
    private String capacidadeKg;
    private String capacidadeM3;

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void setCapacidadeKg(String capacidadeKg) {
        this.capacidadeKg = capacidadeKg;
    }

    public void setCapacidadeM3(String capacidadeM3) {
        this.capacidadeM3 = capacidadeM3;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public String getCapacidadeKg() {
        return capacidadeKg;
    }

    public String getCapacidadeM3() {
        return capacidadeM3;
    }
}

public class MDFInfoModalRodoviarioVeiculoReboqueTest {

    @RunWith(org.junit4.JUnit4ClassRunner.class)
    public static class MDFInfoModalRodoviarioVeiculoReboqueTest {

        @Mock
        private org.mockito.MockitoAnnotations mockitoAnnotations;

        public void setup() {
            MockitoAnnotations.initMocks(this);
        }

        @Test
        public void setCodigoInterno_ValidarDadoValido_SetDeValorCorrecto() {
            MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
            modal.setCodigoInterno("mock_codigo_interno");
            assertEquals("mock_codigo_interno", modal.getCodigoInterno());
        }

    }