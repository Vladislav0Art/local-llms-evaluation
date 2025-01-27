package com.sun.tools.xjc.addon.xew;

public class GeneratedRunInternal_XsdDeclaration_ReturnsNonNullOutline {

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
    public void runInternal_XsdDeclaration_ReturnsNonNullOutline() throws IOException {
        String xsdDeclaration = "someXsdDeclaration";
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = plugin.runInternal(xsdDeclaration);
        assertNotNull(outline);
    }

}