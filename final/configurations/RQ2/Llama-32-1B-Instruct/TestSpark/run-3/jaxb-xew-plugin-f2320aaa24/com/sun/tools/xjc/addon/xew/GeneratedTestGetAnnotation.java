package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotation {

    @Test
    public void testGetAnnotation() {
        // Create an XML declaration
        String xmlDeclaration = "<xml-annotation></xml-annotation>";

        // Get the annotation
        JAnnotatable annotatable = addAnnotation(xmlDeclaration);

        // Check if the annotation is present
        ObjectUtils.assertSame(".annotation", annotatable.getAnnotation());
    }

}