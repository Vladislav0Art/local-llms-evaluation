package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotationMember {

    @Test
    public void testGetAnnotationMember() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyAnnotationMember(getAnnotation(XSComponent.class), "xsd:complexType");

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

}