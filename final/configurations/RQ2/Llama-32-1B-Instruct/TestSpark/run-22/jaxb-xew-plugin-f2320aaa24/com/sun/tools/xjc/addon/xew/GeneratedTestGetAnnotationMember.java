package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetAnnotationMember {

    @Test
    public void testGetAnnotationMember() {
        JAnnotatable annot = jclass.getAnnotation("testAnnotation");
        List<JCMethod> methods = (List<JCMethod>) getAnnotationMember(annot, "methods");
        assertNotNull(methods);
        assertEquals(1, methods.size());
    }

}