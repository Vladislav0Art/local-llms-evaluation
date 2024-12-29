package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;

public class GeneratedTestHasPropertyNameCustomization {

    @Test
    public void testHasPropertyNameCustomization() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        JClass jClass = instance.addClass("example", "java.lang.String");
        boolean hasCustomized = hasPropertyNameCustomization(jClass);
        assertEquals(true, hasCustomized);
    }

}