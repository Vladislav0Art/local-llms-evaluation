package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetCodigoInterno_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo {

    @Test
    public void setCodigoInterno_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        String codigoInterno = "123456789";
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfinfoModalRodoviarioVeiculoReboque.setCodigoInterno(codigoInterno);
        assertEquals(codigoInterno, mfinfoModalRodoviarioVeiculoReboque.getCodigoInterno());
    }

}