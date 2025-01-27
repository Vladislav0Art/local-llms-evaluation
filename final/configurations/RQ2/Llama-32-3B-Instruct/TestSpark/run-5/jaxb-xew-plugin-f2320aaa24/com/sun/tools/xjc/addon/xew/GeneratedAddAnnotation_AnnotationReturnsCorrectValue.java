package com.sun.tools.xjc.addon.xew;

public class GeneratedAddAnnotation_AnnotationReturnsCorrectValue {

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
    public void addAnnotation_AnnotationReturnsCorrectValue() {
        String annotation = "someAnnotation";
        String memberValue = "someMemberValue";
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        String result = plugin.addAnnotation(annotation, memberValue);
        assertEquals(memberValue, result);
    }

}