package com.sun.tools.xjc.addon.xew;

public class GeneratedTest {

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
    public void runInternal_NoConfigurations_ReturnsNull() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        assertEquals(null, plugin.runInternal(new Outline()));
    }

    @Test
    public void runInternal_NoXsdDeclaration_ThrowsIOException() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.runInternal(new Outline());
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }

    @Test
    public void runInternal_XsdDeclaration_ReturnsNull() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        assertEquals(null, plugin.runInternal(new Outline()));
    }

    @Test
    public void runInternal_XsdDeclaration_ReturnsNonNullOutline() throws IOException {
        String xsdDeclaration = "someXsdDeclaration";
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = plugin.runInternal(xsdDeclaration);
        assertNotNull(outline);
    }

    @Test
    public void addAnnotation_AnnotationReturnsCorrectValue() {
        String annotation = "someAnnotation";
        String memberValue = "someMemberValue";
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        String result = plugin.addAnnotation(annotation, memberValue);
        assertEquals(memberValue, result);
    }

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