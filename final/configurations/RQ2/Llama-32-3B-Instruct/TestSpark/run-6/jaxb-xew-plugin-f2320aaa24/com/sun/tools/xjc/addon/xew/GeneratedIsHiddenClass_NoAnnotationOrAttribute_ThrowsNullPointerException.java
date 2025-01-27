package com.sun.tools.xjc.addon.xew;

public class GeneratedIsHiddenClass_NoAnnotationOrAttribute_ThrowsNullPointerException {

    @Test
    public void isHiddenClass_NoAnnotationOrAttribute_ThrowsNullPointerException() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        assertThrows(NullPointerException.class, () -> instance.isHiddenClass());
    }

}