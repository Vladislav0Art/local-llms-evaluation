package com.sun.tools.xjc.addon.xew;

public class GeneratedGetAnnotationMemberValue_NonStringAttribute_ThrowsClassCastException {

    @Test
    public void getAnnotationMemberValue_NonStringAttribute_ThrowsClassCastException() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        Class<?> type = Integer.class;
        assertThrows(ClassCastException.class, () -> instance.getAnnotationMemberValue(type));
    }

}