package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetPlaca_DadoValorValido_EstabelecePlacaCorretamente {

    @Test
    public void setPlaca_DadoValorValido_EstabelecePlacaCorretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "ABC123";
        modal.setPlaca(placa);
        assertEquals(placa, modal.getPlaca());
    }

}