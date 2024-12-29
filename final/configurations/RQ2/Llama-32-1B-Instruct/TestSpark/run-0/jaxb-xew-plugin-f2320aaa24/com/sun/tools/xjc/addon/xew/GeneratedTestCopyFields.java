package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;

public class GeneratedTestCopyFields {

    @Test
    public void testCopyFields() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        JClass jClass = instance.addClass("example", "java.lang.String");
        Object[] fields = copyFields(jClass);
        assertNotNull(fields[0]);
        assertEquals("example", fields[0].getClassName());
    }

}