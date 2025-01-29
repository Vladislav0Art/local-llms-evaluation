package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFieldsWithFieldVar {

    @Test
    public void testCopyFieldsWithFieldVar() {
        JAnnotatable annot = getAnnotation(XSComponent.class);
        assertNotNull(annot);

        JClass classContainer = new JClassContainer();
        FieldVar fieldVar = classContainer.createField("x", new JFieldVar() {
            public String toString() {
                return "x";
            }
        });
        addAnnotation(fieldVar, "xsd:complexType");

        copyFields(classContainer, fieldVar);
    }

}