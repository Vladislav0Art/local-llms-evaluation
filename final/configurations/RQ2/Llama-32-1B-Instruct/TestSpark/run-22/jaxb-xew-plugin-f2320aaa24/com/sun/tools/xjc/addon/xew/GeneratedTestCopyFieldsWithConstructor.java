package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFieldsWithConstructor {

    @Test
    public void testCopyFieldsWithConstructor() {
        JClass jclass1 = jclass1(XmlElementWrapper.class);
        String value = ((XmlElementWrapper) jclass1.newInstance()).test();
        assertEquals("value", value);
    }

}