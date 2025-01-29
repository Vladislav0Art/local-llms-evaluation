package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetPrivateField {

    @Test
    public void testSetPrivateField() throws Exception {
        XmlElementWrapper xmlElementWrapper = new XmlElementWrapper();
        xmlElementWrapper.test();

        // Create a private field in the class and set it to true
        JClass jclass1 = jclass1(XmlElementWrapper.class);
        Field field = jclass1.getStaticDeclaredField("privateField", Boolean.class);
        field.setAccessible(true);
        field.set(xmlElementWrapper, true);

        // Check if the private field is accessible from outside the class
        Object fieldValue = ((XmlElementWrapper) jclass1.newInstance()).test();
        assertTrue(fieldValue instanceof Boolean);
    }

}