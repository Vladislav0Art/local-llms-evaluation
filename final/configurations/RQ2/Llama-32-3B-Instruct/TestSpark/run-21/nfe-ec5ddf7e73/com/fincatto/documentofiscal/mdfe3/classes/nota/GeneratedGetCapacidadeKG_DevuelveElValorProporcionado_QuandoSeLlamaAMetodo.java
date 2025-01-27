package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetCapacidadeKG_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo {

    @Test
    public void getCapacidadeKG_DevuelveElValorProporcionado_QuandoSeLlamaAMetodo() {
        MDFInfoModalRodoviarioVeiculoReboque mfinfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        String capacidadeKG = "1000";
        mfinfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertEquals(capacidadeKG, mfinfoModalRodoviarioVeiculoReboque.getCapacidadeKG());
    }

}