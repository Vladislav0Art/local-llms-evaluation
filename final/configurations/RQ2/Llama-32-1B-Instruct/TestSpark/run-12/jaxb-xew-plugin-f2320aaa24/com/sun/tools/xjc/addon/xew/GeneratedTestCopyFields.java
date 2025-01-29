package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyFields {

    @Test
    public void testCopyFields() {
        JClass container = new JClassContainer();
        JFieldVar fieldVar = container.createField("x", new JFieldVar() {
            public String toString() {
                return "x";
            }
        });
        addAnnotation(fieldVar, "xsd:complexType");
        copyFields(container, fieldVar);
    }

}