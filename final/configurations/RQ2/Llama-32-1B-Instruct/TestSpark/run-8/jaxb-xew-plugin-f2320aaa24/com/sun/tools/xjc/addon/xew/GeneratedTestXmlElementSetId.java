package com.sun.tools.xjc.addon.xew;

public class GeneratedTestXmlElementSetId {

    @Test
    public void testXmlElementSetId() {
        CommonUtils.addAnnotation(XmlElement.class, "xew");
        CommonUtils.copyAnnotationMemberValue(XmlElement.class, "id", "x001");

        JAnnotatable annot = new JAnnotatable();
        annot.addAnnotation(XmlElementWrapper.class);

        ElementWrapper wrapper = getTestElementWrapper();
        assertEquals("x001", wrapper.getId());
    }

}