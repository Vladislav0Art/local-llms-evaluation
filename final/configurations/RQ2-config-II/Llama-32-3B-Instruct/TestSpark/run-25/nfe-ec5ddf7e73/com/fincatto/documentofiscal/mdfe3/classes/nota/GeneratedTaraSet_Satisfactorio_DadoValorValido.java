package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTaraSet_Satisfactorio_DadoValorValido {

    @Test
    public void taraSet_Satisfactorio_DadoValorValido() {
        String tara = "tara";
        MDFInfoModalRodoviarioVeiculoReboque objeto = new MDFInfoModalRodoviarioVeiculoReboque();
        objeto.setTara(tara);
        assertEquals(tara, objeto.getTara());
    }

}