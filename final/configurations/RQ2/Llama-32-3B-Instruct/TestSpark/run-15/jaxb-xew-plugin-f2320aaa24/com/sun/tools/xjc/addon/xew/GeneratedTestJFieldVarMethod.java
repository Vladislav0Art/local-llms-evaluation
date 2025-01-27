package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestJFieldVarMethod {

    @Test
    public void testJFieldVarMethod() {
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
    }

}