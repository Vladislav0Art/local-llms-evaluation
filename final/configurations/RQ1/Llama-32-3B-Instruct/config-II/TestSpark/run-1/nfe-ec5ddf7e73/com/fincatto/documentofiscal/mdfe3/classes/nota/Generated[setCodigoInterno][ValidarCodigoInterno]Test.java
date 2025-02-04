package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class Generated[setCodigoInterno][ValidarCodigoInterno]

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
    public void [setCodigoInterno][ValidarCodigoInterno]Test() {
        notafiscal.setCodigoInterno(codigoInternoMock);
        verify(notafiscal, times(1)).setCodigoInterno(codigoInternoMock);
    }

}