package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetCapacidadeM3_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo {

    @Test
    public void setCapacidadeM3_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        String capacidadeM3 = "1000";
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfinfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mfinfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}