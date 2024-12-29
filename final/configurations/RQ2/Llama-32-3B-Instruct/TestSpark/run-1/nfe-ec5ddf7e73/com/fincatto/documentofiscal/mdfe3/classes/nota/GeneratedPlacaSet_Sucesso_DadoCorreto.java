package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedPlacaSet_Sucesso_DadoCorreto {

    @Test
    public void placaSet_Sucesso_DadoCorreto() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String placa = "ABC123";
        modal.setPlaca(placa);
        assertEquals(placa, modal.getPlaca());
    }

}