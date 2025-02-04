package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class Generated[setPlaca][ValidaPlacaDeReboque]

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
    public void [setPlaca][ValidaPlacaDeReboque]Test() {
        notafiscal.setPlaca(placaMock);
        verify(notafiscal, times(1)).setPlaca(placaMock);
    }

}