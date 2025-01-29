package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTestCopyFieldsWithMultipleTypes {

    @Test
    public void testCopyFieldsWithMultipleTypes() {
        JFieldVar fieldVar1 = mock(JFieldVar.class);
        JFieldVar fieldVar2 = mock(JFieldVar.class);

        addAnnotation(fieldVar1, "field");
        addAnnotation(fieldVar2, "field");

        JMethod method = mock(JMethod.class);
        method.invoke(jClass, fieldVar1, fieldVar2);

        ObjectUtils.assertSame("field", method.invoke(jClass, fieldVar1, fieldVar2));
    }

}