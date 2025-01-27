package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetPlaca_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo {

    @Test
    public void setPlaca_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        String placa = "1234567890";
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfinfoModalRodoviarioVeiculoReboque.setPlaca(placa);
        assertEquals(placa, mfinfoModalRodoviarioVeiculoReboque.getPlaca());
    }

}