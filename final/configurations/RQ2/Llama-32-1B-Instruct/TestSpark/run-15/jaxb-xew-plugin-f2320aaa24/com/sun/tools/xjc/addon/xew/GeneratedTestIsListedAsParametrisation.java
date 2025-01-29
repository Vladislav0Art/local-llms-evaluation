package com.sun.tools.xjc.addon.xew;

public class GeneratedTestIsListedAsParametrisation {

    @Test
    public void testIsListedAsParametrisation() {
        JAnnotatable element = new JAnnotatable();
        // Add annotation using addAnnotation method
        addAnnotation(element, "name", "value");

        // Get the parametrisation value
        String parametrisation = getParameterisation(element);

        assert !parametrisation.isEmpty();
    }

}