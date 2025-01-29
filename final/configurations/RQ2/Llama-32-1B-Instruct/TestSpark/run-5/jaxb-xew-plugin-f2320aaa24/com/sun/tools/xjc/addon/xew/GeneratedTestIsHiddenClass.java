package com.sun.tools.xjc.addon.xew;

public class GeneratedTestIsHiddenClass {

    private static final String XML_ELEMENT_NAME = "element";

    @Test
    public void testIsHiddenClass() {
        JAnnotatable annotation = getMock(JAnnotatable.class);
        setPrivateField(annotation, "hiddenClass");
        assertTrue(isHiddenClass(annotation));
        clearHiddenClass(annotation);
    }

}