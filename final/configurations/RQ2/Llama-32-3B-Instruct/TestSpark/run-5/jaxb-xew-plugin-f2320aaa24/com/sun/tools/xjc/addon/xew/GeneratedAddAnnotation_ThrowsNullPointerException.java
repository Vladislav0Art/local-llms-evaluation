package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedAddAnnotation_ThrowsNullPointerException {

    @Test
    public void addAnnotation_ThrowsNullPointerException() {
        String annotation = getAnnotation();
        try {
            plugin.addAnnotation(null, null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }
}

public class XmlElementWrapperPlugin {

    private Outline runInternal(String xsdDeclaration) throws IOException {
        // implementation
        return null;
    }

    public String addAnnotation(String annotation, String memberValue) {
        // implementation
        return null;
    }

}