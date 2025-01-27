package com.sun.tools.xjc.addon.xew;

public class GeneratedGetAnnotationMemberValue_MissingAttribute_ThrowsNullPointerException {

    @Test
    public void getAnnotationMemberValue_MissingAttribute_ThrowsNullPointerException() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        assertNotNull(instance.getAnnotationMemberValue("missing"));
    }

}