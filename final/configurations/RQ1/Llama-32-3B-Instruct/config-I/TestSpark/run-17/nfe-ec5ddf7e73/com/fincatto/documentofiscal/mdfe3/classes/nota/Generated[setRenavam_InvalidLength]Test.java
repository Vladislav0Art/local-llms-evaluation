package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class Generated[setRenavam_InvalidLength]

Test {

    @Test
    public void [setRenavam_InvalidLength]Test() {
        MDFInfoModalRodoviarioVeiculoReboleu reboque = new MDFInfoModalRodoviarioVeiculoReboleu();
        String renavam = "123456789";
        reboque.setRenavam(renavam);
        assertEquals("123456789", reboque.renavamDoReboque);
    }

}