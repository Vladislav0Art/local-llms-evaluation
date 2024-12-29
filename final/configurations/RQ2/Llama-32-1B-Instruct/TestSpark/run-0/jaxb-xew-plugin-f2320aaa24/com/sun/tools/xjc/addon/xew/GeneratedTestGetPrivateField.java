package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;

public class GeneratedTestGetPrivateField {

    @Test
    public void testGetPrivateField() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        JClass jClass = instance.addClass("example", "java.lang.String");
        Object value = getPrivateField(jClass, "example");
        assertEquals("example", value);
    }

}