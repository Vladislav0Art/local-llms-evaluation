package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetField {

    @Test
    public void testGetField() {
        Field field = getField();
        assertEquals("XmlElementWrapperPlugin", field.getName());
    }

    private JClass getJClass() {
        return new JClass("com.example.XmlElementWrapperPlugin");
    }

    private JMethod getField() {
        Method method = getField();
        return method;
    }

}