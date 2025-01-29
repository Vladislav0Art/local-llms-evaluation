package com.sun.tools.xjc.addon.xew;

public class GeneratedTestXmlElementGetXsdDeclaration {

    @Test
    public void testXmlElementGetXsdDeclaration() {
        CommonUtils.addAnnotation(XmlElement.class, "xew");
        CommonUtils.copyAnnotationMemberValue(XmlElement.class, "xsd", "http://www.w3.org/2001/XMLSchema");

        JAnnotatable annot = new JAnnotatable();
        annot.addAnnotation(XmlElementWrapper.class);

        ElementWrapper wrapper = getTestElementWrapper();
        assertEquals("http://www.w3.org/2001/XMLSchema", wrapper.getXsdDeclaration());
    }

}