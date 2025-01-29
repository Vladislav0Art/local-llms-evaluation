package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotationMemberValue {

    @Test
    public void testGetAnnotationMemberValue() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyAnnotationMemberValue(annot, "xsd:complexType");

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

}