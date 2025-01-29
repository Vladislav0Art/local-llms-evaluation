package com.sun.tools.xjc.addon.xew;

public class GeneratedTestIsHiddenClass {

    @Test
    public void testIsHiddenClass() {
        JClass jclass = getAnnotation(JElement.class).getDeclaringClass();
        assertEquals(true, isHiddenClass(jclass));
    }

}