package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetPublicMethod {

    @Test
    public void testGetPublicMethod() {
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

        Method method = ObjectUtils.getMethods(fieldVar.getClass());
        assertNotNull(method);
    }

}

class JFieldVar {

    public void myMethod() {
        System.out.println("myMethod");
    }

}