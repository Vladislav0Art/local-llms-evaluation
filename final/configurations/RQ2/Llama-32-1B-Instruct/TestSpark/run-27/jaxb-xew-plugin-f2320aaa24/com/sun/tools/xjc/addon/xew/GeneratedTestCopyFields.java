package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestCopyFields {

    @Test
    public void testCopyFields() {
        JClassContainer jc = new JClassContainer();
        jc.addField("testField", new JFieldVar(), true);
        assertEquals(true, copyFields(jc.getFields("testField")));
    }

}