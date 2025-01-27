package com.sun.tools.xjc.addon.xew;

public class GeneratedAddAnnotation_NullAnnotationThrowsNullPointerException {

    public Outline runInternal(String xsdDeclaration) throws IOException {
        // implementation
        return null;
    }

    public String addAnnotation(String annotation, String memberValue) {
        // implementation
        return null;
    }
}

public class GeneratedTest {

    @Test
    public void addAnnotation_NullAnnotationThrowsNullPointerException() {
        String annotation = null;
        String memberValue = "someMemberValue";
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.addAnnotation(annotation, memberValue);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }
    }

    public static class Outline {
    }

}