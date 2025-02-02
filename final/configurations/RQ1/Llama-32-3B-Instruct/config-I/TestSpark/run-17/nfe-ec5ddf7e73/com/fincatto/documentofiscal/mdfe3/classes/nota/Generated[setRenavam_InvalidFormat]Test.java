package com.fincatto.documentofiscal.mdfe3.classes.nota;

import org.junit.Test;

import static org.junit.Assert.*;

import org.simpleframework.xml.Element;

public class Generated[setRenavam_InvalidFormat]

Test {

    @Test
    public void [setRenavam_InvalidFormat]Test() {
        MDFInfoModalRodoviarioVeiculoReboleu reboque = new MDFInfoModalRodoviarioVeiculoReboleu();
        String renavam = "123456789a";
        reboque.setRenavam(renavam);
        assertEquals("123456789", reboque.renavamDoReboque);
    }

}