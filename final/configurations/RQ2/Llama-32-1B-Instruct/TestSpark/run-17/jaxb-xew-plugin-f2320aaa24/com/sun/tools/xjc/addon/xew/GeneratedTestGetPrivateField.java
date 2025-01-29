package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTestGetPrivateField {

    @Test
    public void testGetPrivateField() {
        JAnnotatable annotatable = mock(JAnnotatable.class);
        JMethod method = mock(JMethod.class);

        addAnnotation(annotatable, "getPrivateField");

        ObjectUtils.assertSame("field", getPrivateField(jClass, annotatable));
    }

}