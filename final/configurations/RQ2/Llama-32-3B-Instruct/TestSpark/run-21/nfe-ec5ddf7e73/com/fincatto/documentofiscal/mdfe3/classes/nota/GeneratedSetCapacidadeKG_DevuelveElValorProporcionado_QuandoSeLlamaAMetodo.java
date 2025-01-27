package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSetCapacidadeKG_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo {

    @Test
    public void setCapacidadeKG_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        String capacidadeKG = "1000";
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mfinfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, mfinfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}