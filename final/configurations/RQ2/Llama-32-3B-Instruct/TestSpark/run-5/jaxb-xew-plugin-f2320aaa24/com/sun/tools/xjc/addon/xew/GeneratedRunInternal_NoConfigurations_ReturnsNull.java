package com.sun.tools.xjc.addon.xew;

public class GeneratedRunInternal_NoConfigurations_ReturnsNull {

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

}