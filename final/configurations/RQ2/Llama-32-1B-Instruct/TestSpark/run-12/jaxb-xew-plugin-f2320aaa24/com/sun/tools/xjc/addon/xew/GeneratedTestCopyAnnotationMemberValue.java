package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyAnnotationMemberValue {

    @Test
    public void testCopyAnnotationMemberValue() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyAnnotationMemberValue(annot, "xsd:complexType");

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JAnnotatable container = new JClassContainer();
        container.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(container, "xsd:complexType");
    }

}