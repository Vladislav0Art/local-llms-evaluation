package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestSetPrivateField {

    @Test
    public void testSetPrivateField() {
        JClassContainer jc = new JClassContainer();
        jc.addField("testField", new JFieldVar(), true);
        assertEquals(true, setPrivateField(jc.getFields("testField"), "newValue"));
    }

}