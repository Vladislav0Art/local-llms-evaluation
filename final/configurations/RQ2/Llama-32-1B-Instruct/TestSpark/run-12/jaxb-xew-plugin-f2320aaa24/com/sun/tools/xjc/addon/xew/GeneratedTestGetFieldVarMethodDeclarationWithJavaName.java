package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetFieldVarMethodDeclarationWithJavaName {

    @Test
    public void testGetFieldVarMethodDeclarationWithJavaName() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        annotate(annot, "xsd:complexType", "x");
        copyFields(getAnnotation(XSComponent.class), new FieldVar("x"));

        addAnnotation(getAnnotation(XSComponent.class), "xsd:complexType");

        JClass classContainer = new JClassContainer();
        classContainer.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(classContainer, "xsd:complexType");
    }

    private void annotate(JAnnotatable annot, String name, Object value) {
        getAnnotation(annot).setAnnotationValue(name, value);
    }

    @SuppressWarnings("unchecked")
    private void setJavaName(JClass classContainer, String name) {
        for (JClass clazz : classContainer.getClasses()) {
            if (clazz.getName().equals(name)) {
                clazz.setAnnotatable(getAnnotation(XSComponent.class), "xsd:complexType");
                return;
            }
        }
    }

    private void copyFields(JAnnotatable annot, FieldVar fieldVar) {
        getAnnotation(annot).copyFieldTo(fieldVar);
    }

    private static JClass getClass() {
        // implementation to retrieve the class
    }

}