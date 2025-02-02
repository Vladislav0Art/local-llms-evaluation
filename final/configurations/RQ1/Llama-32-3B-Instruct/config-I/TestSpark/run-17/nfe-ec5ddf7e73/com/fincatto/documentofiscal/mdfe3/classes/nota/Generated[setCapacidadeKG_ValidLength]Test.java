package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class Generated[setCapacidadeKG_ValidLength]

Test {

    @Test
    public void [setCapacidadeKG_ValidLength]Test() {
        MDFInfoModalRodoviarioVeiculoReboleu reboque = new MDFInfoModalRodoviarioVeiculoReboleu();
        String capacidadeKG = "12345678901";
        reboque.setCapacidadeKG(capacidadeKG);
        assertEquals("12345678901", reboque.capacidadeEmKgDeReboque);
    }

}