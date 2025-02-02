package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class Generated[setTara_InvalidLength]

Test {

    @Test
    public void [setTara_InvalidLength]Test() {
        MDFInfoModalRodoviarioVeiculoReboleu reboque = new MDFInfoModalRodoviarioVeiculoReboleu();
        String tara = "ab";
        reboque.setTara(tara);
        assertEquals("ab", reboque.taraEmReboque);
    }

}