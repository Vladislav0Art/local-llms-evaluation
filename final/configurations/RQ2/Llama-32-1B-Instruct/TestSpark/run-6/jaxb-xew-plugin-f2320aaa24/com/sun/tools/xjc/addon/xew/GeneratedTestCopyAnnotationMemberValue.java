package com.sun.tools.xjc.addon.xew;

public class GeneratedTestCopyAnnotationMemberValue {

    @Test
    public void testCopyAnnotationMemberValue() {
        JAnnotatable annotatable = CommonUtils.copyAnnotationMemberValue(XmlElementWrapper.class, "attr");
        assertNotNull(annotatable);
    }

}