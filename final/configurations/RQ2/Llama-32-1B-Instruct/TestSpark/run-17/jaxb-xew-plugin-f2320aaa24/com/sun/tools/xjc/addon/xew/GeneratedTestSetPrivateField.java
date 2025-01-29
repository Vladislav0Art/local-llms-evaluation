package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTestSetPrivateField {

    @Test
    public void testSetPrivateField() {
        JAnnotatable annotatable = mock(JAnnotatable.class);
        JMethod method = mock(JMethod.class);

        addAnnotation(annotatable, "setPrivateField");

        setPrivateField(annotatable, "field");
        setPrivateField(annotatable, "field2");

        JClass jClass = mock(JClass.class);
        JMethod methodJClass = mock(JMethod.class);

        method.invoke(jClass, annotatable);

        ObjectUtils.assertSame("field", method.invoke(jClass, annotatable));
    }

}