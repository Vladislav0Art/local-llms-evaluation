package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetMethodDeclarationWithFieldVarAndJavaName {

    @Test
    public void testGetMethodDeclarationWithFieldVarAndJavaName() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyFields(getAnnotation(XSComponent.class), new MethodDecl("x"));
        setJavaName(getAnnotation(XSComponent.class), "xsd:complexType");

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

}