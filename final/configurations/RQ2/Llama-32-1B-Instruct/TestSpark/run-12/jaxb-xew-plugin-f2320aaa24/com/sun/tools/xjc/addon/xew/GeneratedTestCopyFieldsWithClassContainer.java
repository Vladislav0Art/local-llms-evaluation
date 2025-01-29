package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFieldsWithClassContainer {

    @Test
    public void testCopyFieldsWithClassContainer() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        JClass container = new JClassContainer();
        container.addAnnotatable(getAnnotation(XSComponent.class), annot);
        addAnnotation(container, "xsd:complexType");

        JFieldVar fieldVar = container.createField("x", new JFieldVar() {
            public String toString() {
                return "x";
            }
        });
        copyFields(container, fieldVar);
    }

}