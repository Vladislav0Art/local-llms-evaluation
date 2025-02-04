package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeM3_setsCapacidadeM3Correctly {

    @Test
    public void setCapacidadeM3_setsCapacidadeM3Correctly() {
        final String capacidadeM3 = "12";
        new MDFInfoModalRodoviarioVeiculoReboque().setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, new MDFInfoModalRodoviarioVeiculoReboque().getCapacidadeM3());
    }

}