package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSetTara_DadoValorValido_EstabeleceTaraCorretamente {

    @Test
    public void setTara_DadoValorValido_EstabeleceTaraCorretamente() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "kg";
        modal.setTara(tara);
        assertEquals(tara, modal.getTara());
    }

}