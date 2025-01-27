package com.sun.tools.xjc.addon.xew;

public class GeneratedCopyAnnotationMemberValueTest {

    @Test
    public void copyAnnotationMemberValueTest() {
        // Test case: Copy annotation member value
        Annotation annotation = new Annotation();
        Object value = "value";
        Object result = CommonUtils.copyAnnotationMemberValue(annotation, "member", value);
        assertEquals(value, result);
    }

}