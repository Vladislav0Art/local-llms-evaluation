package com.sun.tools.xjc.addon.xew;

public class GeneratedTestXmlElementGetFields {

    @Test
    public void testXmlElementGetFields() {
        CommonUtils.addAnnotation(XmlElement.class, "xew");
        CommonUtils.copyAnnotationMemberValue(XmlElement.class, "fields", "foo: bar");

        JAnnotatable annot = new JAnnotatable();
        annot.addAnnotation(XmlElementWrapper.class);

        ElementWrapper wrapper = getTestElementWrapper();
        assertEquals("bar", wrapper.getFields().get(0));
    }

}