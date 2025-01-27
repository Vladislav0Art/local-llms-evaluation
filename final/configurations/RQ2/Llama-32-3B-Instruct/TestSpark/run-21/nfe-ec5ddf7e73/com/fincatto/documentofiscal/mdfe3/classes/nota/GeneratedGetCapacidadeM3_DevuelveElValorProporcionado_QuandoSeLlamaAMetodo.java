package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetCapacidadeM3_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo {

    @Test
    public void getCapacidadeM3_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeM3 = "1000";
        mfinfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertEquals(capacidadeM3, mfinfoModalRodoviarioVeiculoReboque.getCapacidadeM3());
    }

}