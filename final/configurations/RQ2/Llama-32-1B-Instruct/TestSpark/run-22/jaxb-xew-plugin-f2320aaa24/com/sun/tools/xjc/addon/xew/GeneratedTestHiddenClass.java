package com.sun.tools.xjc.addon.xew;

public class GeneratedTestHiddenClass {

    @Test
    public void testHiddenClass() {
        Class<?> hiddenClass = getPrivateField(jclass, "hidden-attribute").getClass();
        assertEquals("com.sun.tools.xjc.annotation.HIDDEN", hiddenClass.getName());
    }

}