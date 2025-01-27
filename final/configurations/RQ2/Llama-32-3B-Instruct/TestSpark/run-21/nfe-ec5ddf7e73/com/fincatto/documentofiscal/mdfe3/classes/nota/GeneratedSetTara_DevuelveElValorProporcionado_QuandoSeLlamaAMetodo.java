package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetTara_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo {

    @Test
    public void setTara_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        String tara = "12345678902";
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfinfoModalRodoviarioVeiculoReboque.setTara(tara);
        assertEquals(tara, mfinfoModalRodoviarioVeiculoReboque.getTara());
    }

}