package com.sun.tools.xjc.addon.xew;

public class GeneratedTestSetPrivateField {

    @Test
    public void testSetPrivateField() {
        JAnnotatable element = new JAnnotatable();
        // Add annotation using addAnnotation method
        addAnnotation(element, "name", "value");

        // Set a private field using setPrivateField method
        setPrivateField(element, "private_field_name", "value");

        // Get the private field value
        String privateFieldValue = getPrivateField(element);

        assert !privateFieldValue.isEmpty();
    }

}