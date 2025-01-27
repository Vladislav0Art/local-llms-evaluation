package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedAddAnnotation_CopiesMemberValues {

    @Test
    public void addAnnotation_CopiesMemberValues() {
        String annotation = getAnnotation();
        String memberValue = "memberValue";
        String expected = "memberValue";
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        assertEquals(expected, plugin.addAnnotation(annotation, memberValue));
    }

}