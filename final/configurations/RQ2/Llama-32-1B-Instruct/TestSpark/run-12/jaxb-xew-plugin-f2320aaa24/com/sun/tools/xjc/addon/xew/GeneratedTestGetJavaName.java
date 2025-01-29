package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetJavaName {

    @Test
    public void testGetJavaName() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyFields(getAnnotation(XSComponent.class), new JavaName("x"));

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

}