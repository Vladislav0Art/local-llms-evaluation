package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class Generated[setCapacidadeM3_ValidLength]

Test {

    @Test
    public void [setCapacidadeM3_ValidLength]Test() {
        MDFInfoModalRodoviarioVeiculoReboleu reboque = new MDFInfoModalRodoviarioVeiculoReboleu();
        String capacidadeM3 = "123456789";
        reboque.setCapacidadeM3(capacidadeM3);
        assertEquals("123456789", reboque.capacidadeEmM3DeReboque);
    }

}