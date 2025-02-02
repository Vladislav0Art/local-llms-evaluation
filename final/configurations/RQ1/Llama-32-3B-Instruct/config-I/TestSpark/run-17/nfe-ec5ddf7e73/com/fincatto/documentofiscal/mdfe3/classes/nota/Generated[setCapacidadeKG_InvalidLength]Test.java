package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class Generated[setCapacidadeKG_InvalidLength]

Test {

    @Test
    public void [setCapacidadeKG_InvalidLength]Test() {
        MDFInfoModalRodoviarioVeiculoReboleu reboque = new MDFInfoModalRodoviarioVeiculoReboleu();
        String capacidadeKG = "ab";
        reboque.setCapacidadeKG(capacidadeKG);
        assertEquals("ab", reboque.capacidadeEmKgDeReboque);
    }

}