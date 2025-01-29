package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTestAddAttribute {

    @Test
    public void testAddAttribute() {
        JClass jClass = mock(JClass.class);
        JAnnotatable annotatable = mock(JAnnotatable.class);

        addAnnotation(jClass, "attribute");
        addAnnotation(annotatable, "attribute");

        JMethod method = mock(JMethod.class);
        method.invoke(jClass, annotatable);

        ObjectUtils.assertSame("attribute", method.invoke(jClass, annotatable));
    }

}