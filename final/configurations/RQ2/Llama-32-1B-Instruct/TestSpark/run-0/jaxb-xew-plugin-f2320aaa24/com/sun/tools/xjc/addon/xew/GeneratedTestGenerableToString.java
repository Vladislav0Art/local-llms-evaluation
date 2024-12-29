package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;

public class GeneratedTestGenerableToString {

    @Test
    public void testGenerableToString() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        JAnnotatable jAnnotatable = instance.addAnnotation("example");
        String value = generateString(jAnnotatable);
        assertEquals("example", value);
    }

}