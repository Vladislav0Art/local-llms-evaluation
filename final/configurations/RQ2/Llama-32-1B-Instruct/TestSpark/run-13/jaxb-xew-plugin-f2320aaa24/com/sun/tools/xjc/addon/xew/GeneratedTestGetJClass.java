package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetJClass {

    @Test
    public void testGetJClass() {
        JClass jclass = getJClass();
        assertEquals("XmlElementWrapperPlugin", jclass.getName());
    }

}