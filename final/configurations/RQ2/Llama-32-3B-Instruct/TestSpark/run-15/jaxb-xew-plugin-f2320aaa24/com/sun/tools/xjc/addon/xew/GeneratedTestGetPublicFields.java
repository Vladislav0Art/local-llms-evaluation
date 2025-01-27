package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetPublicFields {

    @Test
    public void testGetPublicFields() {
        JFieldVar fieldVar = new JFieldVar();

        Constructor<?> constructor = null;
        try {
            constructor = fieldVar.getClass().getConstructor();
        } catch (NoSuchMethodException e) {
            // Expected
        }
        assertNotNull(constructor);

        Method[] methods = fieldVar.getClass().getMethods();
        assertTrue(methods.length > 0);

        Field[] fields = ObjectUtils.getFields(fieldVar.getClass());
        assertTrue(fields.length > 0);
    }

}