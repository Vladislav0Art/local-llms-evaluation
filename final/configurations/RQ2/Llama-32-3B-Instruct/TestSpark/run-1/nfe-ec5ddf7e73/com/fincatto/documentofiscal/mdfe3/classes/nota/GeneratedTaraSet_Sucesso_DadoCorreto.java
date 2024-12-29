package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTaraSet_Sucesso_DadoCorreto {

    @Test
    public void taraSet_Sucesso_DadoCorreto() {
        MDFInfoModalRodoviarioVeiculoReboque modal = new MDFInfoModalRodoviarioVeiculoReboque();
        String tara = "100kg";
        modal.setTara(tara);
        assertEquals(tara, modal.getTara());
    }

}