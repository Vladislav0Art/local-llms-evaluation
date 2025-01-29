package com.sun.tools.xjc.addon.xew;

public class GeneratedTestHasPropertyNameCustomization {

    @Test
    public void testHasPropertyNameCustomization() {
        JAnnotatable element = new JAnnotatable();
        // Add annotation using addAnnotation method
        addAnnotation(element, "name", "value");

        // Get the property name customization value
        String propertyNameCustomization = getPropertyNameCustomization(element);

        assert !propertyNameCustomization.isEmpty();
    }

}