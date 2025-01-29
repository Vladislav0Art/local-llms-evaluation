package com.sun.tools.xjc.addon.xew;

public class GeneratedTestXmlElementSetFieldNames {

    @Test
    public void testXmlElementSetFieldNames() {
        CommonUtils.addAnnotation(XmlElement.class, "xew");
        CommonUtils.copyAnnotationMemberValue(XmlElement.class, "fieldNames", "foo: bar");

        JAnnotatable annot = new JAnnotatable();
        annot.addAnnotation(XmlElementWrapper.class);

        ElementWrapper wrapper = getTestElementWrapper();
        assertEquals("bar", wrapper.getFieldNames().get(0));
    }

}