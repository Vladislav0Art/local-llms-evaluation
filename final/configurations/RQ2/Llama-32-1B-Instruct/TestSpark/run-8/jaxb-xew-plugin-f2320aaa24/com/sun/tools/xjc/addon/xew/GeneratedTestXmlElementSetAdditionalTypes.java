package com.sun.tools.xjc.addon.xew;

public class GeneratedTestXmlElementSetAdditionalTypes {

    @Test
    public void testXmlElementSetAdditionalTypes() {
        CommonUtils.addAnnotation(XmlElement.class, "xew");
        CommonUtils.copyAnnotationMemberValue(XmlElement.class, "additionalTypes", Set.class);

        JAnnotatable annot = new JAnnotatable();
        annot.addAnnotation(XmlElementWrapper.class);

        ElementWrapper wrapper = getTestElementWrapper();
        assertEquals(Set.class, wrapper.getAdditionalTypes().get(0));
    }

}