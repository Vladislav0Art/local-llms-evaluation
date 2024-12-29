package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;

public class GeneratedTestHiddenClass {

    @Test
    public void testHiddenClass() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        JAnnotatable jAnnotatable = instance.addAnnotation("example");
        JPackage jPackage = (JPackage) getPrivateField(jAnnotatable, "example", "package");
        assertEquals("com.sun.tools.xjc.addon.xew", jPackage.getName());
    }

}