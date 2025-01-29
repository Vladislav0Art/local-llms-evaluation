package com.sun.tools.xjc.addon.xew;

public class GeneratedTestXmlElementGetters {

    @Test
    public void testXmlElementGetters() {
        CommonUtils.addAnnotation(XmlElement.class, "xew");
        CommonUtils.copyAnnotationMemberValue(XmlElement.class, "id", "id");

        JAnnotatable annot = new JAnnotatable();
        annot.addAnnotation(XmlElementWrapper.class);

        ElementWrapper wrapper = getTestElementWrapper();
        assertEquals(1, wrapper.getId().length());
    }

}