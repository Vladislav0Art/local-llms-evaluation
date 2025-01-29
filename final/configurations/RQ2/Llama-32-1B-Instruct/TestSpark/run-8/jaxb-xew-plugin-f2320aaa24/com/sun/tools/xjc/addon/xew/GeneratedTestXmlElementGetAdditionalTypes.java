package com.sun.tools.xjc.addon.xew;

public class GeneratedTestXmlElementGetAdditionalTypes {

    @Test
    public void testXmlElementGetAdditionalTypes() {
        CommonUtils.addAnnotation(XmlElement.class, "xew");
        CommonUtils.copyAnnotationMemberValue(XmlElement.class, "additionalTypes", Set.class);

        JAnnotatable annot = new JAnnotatable();
        annot.addAnnotation(XmlElementWrapper.class);

        ElementWrapper wrapper = getTestElementWrapper();
        assertEquals(Set.class, wrapper.getAdditionalTypes().get(0));
    }

}