package com.sun.tools.xjc.addon.xew;

public class GeneratedRunInternal_NoXsdDeclaration_ThrowsIOException {

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
    public void runInternal_NoXsdDeclaration_ThrowsIOException() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            plugin.runInternal(new Outline());
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }

}