package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetXsdDeclaration {

    @Test
    public void testGetXsdDeclaration() {
        JAnnotatable annotation = new JAnnotatable();
        getXsdDeclaration(annotation, "test", "element");
        checkAnnotation(annotation);
    }

}