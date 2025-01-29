package com.sun.tools.xjc.addon.xew;

public class GeneratedTestHasPrivateField {

    @Test
    public void testHasPrivateField() {
        JClass jclass = getAnnotation(JElement.class).getDeclaringClass();
        assertTrue(jclass.hasPrivateField("myField"));
    }

}