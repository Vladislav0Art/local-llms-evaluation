package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;
import com.fincatto.documentofiscal.validadores.DFStringValidador;

public class GeneratedSetCapacidadeM3_ValidarValor_Encontrado {

    @Test
    public void setCapacidadeM3_ValidarValor_Encontrado() {
        final String capacidadeM3 = "123.45";
        final MDFInfoModalRodoviarioVeiculoReboque mdfInfoModalRodoviarioVeiculoReboque = new MDFInfoModalRodoviarioVeiculoReboque();
        mdfInfoModalRodoviarioVeiculoReboque.setCapacidadeM3(capacidadeM3);
        assertTrue(mdfInfoModalRodoviarioVeiculoReboque.getCapacidadeM3().equals(capacidadeM3));
    }

}