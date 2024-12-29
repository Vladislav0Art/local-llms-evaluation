package com.sun.tools.xjc.addon.xew;

import com.sun.tools.xjc.addon.xew.XmlElementWrapperPlugin;
import org.junit.Test;

public class GeneratedTestGetAnnotationMemberValue {

    @Test
    public void testGetAnnotationMemberValue() {
        XmlElementWrapperPlugin instance = new XmlElementWrapperPlugin();
        JAnnotatable jAnnotatable = instance.addAnnotation("example");
        JAnnotationArrayMember annotation = (JAnnotationArrayMember) getAnnotation(jAnnotatable, "example", "value");
        Object obj = getAnnotationMemberValue(annotation, "value");
        assertEquals("value", obj);
    }

}