package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFields {

    @Test
    public void testCopyFields() {
        JClass jclass = copyFields(new JAnnotatable(), new ArrayList<>());
        assertEquals(1, jclass.getFields().size());
    }

}