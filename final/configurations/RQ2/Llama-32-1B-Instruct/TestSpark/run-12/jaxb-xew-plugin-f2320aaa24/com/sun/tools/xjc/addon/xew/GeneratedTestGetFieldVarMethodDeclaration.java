package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetFieldVarMethodDeclaration {

    @Test
    public void testGetFieldVarMethodDeclaration() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyFields(getAnnotation(XSComponent.class), new FieldVar("x"));

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

}