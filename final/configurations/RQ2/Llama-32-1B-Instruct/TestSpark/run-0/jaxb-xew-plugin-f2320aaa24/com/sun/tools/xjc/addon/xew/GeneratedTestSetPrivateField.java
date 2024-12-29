package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;

public class GeneratedTestSetPrivateField {

    @Test
    public void testSetPrivateField() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        JAnnotatable jAnnotatable = instance.addAnnotation("example");
        setPrivateField(instance, "example", 10);
    }

    private String generateString(JAnnotatable jAnnotatable) {
        return (String) copyAnnotationMemberValue(jAnnotatable, "example", "value");
    }

}