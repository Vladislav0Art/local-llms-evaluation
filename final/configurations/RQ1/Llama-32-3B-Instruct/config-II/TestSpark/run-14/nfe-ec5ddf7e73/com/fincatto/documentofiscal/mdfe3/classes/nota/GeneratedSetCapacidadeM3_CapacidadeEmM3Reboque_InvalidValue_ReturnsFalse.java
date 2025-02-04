package com.fincatto.documentofiscal.mdfe3.classes.nota;

public class GeneratedSetCapacidadeM3_CapacidadeEmM3Reboque_InvalidValue_ReturnsFalse {

    @Test
    public void setCapacidadeM3_CapacidadeEmM3Reboque_InvalidValue_ReturnsFalse() {
        String capacidadeM3 = "12345678901234567890";
        boolean resultado = new MDFInfoModalRodoviarioVeiculoRebole().setCapacidadeM3(capacidadeM3);
        assertFalse(resultado);
    }

}