package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetPrivateField {

    @Test
    public void testSetPrivateField() {
        JClass jclass = getAnnotation(JElement.class).getDeclaringClass();
        setPrivateField(jclass, "myField", new Object());
    }

}