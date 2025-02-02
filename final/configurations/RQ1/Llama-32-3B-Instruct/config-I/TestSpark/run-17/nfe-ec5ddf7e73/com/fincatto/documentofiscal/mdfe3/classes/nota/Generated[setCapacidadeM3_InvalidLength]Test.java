package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class Generated[setCapacidadeM3_InvalidLength]

Test {

    @Test
    public void [setCapacidadeM3_InvalidLength]Test() {
        MDFInfoModalRodoviarioVeiculoReboleu reboque = new MDFInfoModalRodoviarioVeiculoReboleu();
        String capacidadeM3 = "ab";
        reboque.setCapacidadeM3(capacidadeM3);
        assertEquals("ab", reboque.capacidadeEmM3DeReboque);
    }

}