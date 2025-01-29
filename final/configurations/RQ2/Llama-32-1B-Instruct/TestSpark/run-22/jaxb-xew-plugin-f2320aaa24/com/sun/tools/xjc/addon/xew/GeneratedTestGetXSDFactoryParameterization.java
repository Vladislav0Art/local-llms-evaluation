package com.sun.tools.xjc.addon.xew;

public class GeneratedTestGetXSDFactoryParameterization {

    @Test
    public void testGetXSDFactoryParameterization() {
        JAnnotatable annot = jclass.getAnnotation("testAnnotation", 0);
        String parameter = (String) getAnnotationMemberValue(annot, "parameter");
        assertEquals("test-parameter-value", parameter);
    }

}