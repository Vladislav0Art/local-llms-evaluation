package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetRenavam_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo {

    @Test
    public void setRenavam_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        String renavam = "12345678901";
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfinfoModalRodoviarioVeiculoReboque.setRenavam(renavam);
        assertEquals(renavam, mfinfoModalRodoviarioVeiculoReboque.getRenavam());
    }

}