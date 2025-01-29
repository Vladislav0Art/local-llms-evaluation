package com.sun.tools.xjc.addon.xew;

public class GeneratedTestXmlElementSetAnyElements {

    @Test
    public void testXmlElementSetAnyElements() {
        CommonUtils.addAnnotation(XmlElement.class, "xew");
        CommonUtils.copyAnnotationMemberValue(XmlElement.class, "anyElements", List.class);

        JAnnotatable annot = new JAnnotatable();
        annot.addAnnotation(XmlElementWrapper.class);

        ElementWrapper wrapper = getTestElementWrapper();
        assertEquals(List.class, wrapper.getAnyElements().get(0));
    }

}