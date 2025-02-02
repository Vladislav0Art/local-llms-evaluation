package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class Generated[setPlaca_InvalidLength]

Test {

    @Test
    public void [setPlaca_InvalidLength]Test() {
        MDFInfoModalRodoviarioVeiculoReboleu reboque = new MDFInfoModalRodoviarioVeiculoReboleu();
        String placa = "ab";
        reboque.setPlaca(placa);
        assertEquals("ab", reboque.placaDeVeiculo);
    }

}