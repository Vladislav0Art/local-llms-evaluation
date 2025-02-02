package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class Generated[setPlaca_InvalidFormat]

Test {

    @Test
    public void [setPlaca_InvalidFormat]Test() {
        MDFInfoModalRodoviarioVeiculoReboleu reboque = new MDFInfoModalRodoviarioVeiculoReboleu();
        String placa = "1234567890";
        reboque.setPlaca(placa);
        assertEquals("1234567890", reboque.placaDeVeiculo);
    }

}