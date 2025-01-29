package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTestCopyFields {

    @Test
    public void testCopyFields() {
        JClass jClass = mock(JClass.class);
        JFieldVar fieldVar = mock(JFieldVar.class);

        addAnnotation(fieldVar, "field");
        addAnnotation(jClass, "field");

        JMethod method = mock(JMethod.class);
        method.invoke(jClass, fieldVar);

        ObjectUtils.assertSame("field", method.invoke(jClass, fieldVar));
    }

}