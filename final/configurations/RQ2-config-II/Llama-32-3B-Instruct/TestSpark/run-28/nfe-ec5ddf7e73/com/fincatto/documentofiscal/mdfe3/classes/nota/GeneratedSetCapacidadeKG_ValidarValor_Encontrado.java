package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

public class GeneratedSetCapacidadeKG_ValidarValor_Encontrado {

    @Test
    public void setCapacidadeKG_ValidarValor_Encontrado() {
        final String capacidadeKG = "123.45";
        final MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeKG(capacidadeKG);
        assertTrue(mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeKG().equals(capacidadeKG));
    }

}