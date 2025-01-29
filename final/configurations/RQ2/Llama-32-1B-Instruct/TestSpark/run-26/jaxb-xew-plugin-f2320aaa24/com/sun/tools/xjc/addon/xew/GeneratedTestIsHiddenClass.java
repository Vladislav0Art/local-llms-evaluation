package com.sun.tools.xjc.addon.xew;

public class GeneratedTestIsHiddenClass {

    @Test
    public void testIsHiddenClass() {
        JAnnotatable annotation = new JAnnotatable();
        isHiddenClass(annotation, "test", "element");
        checkAnnotation(annotation);
    }

}