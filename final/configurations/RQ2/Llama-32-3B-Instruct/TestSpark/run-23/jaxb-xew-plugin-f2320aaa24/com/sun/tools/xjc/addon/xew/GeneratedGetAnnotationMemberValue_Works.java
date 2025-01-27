package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetAnnotationMemberValue_Works {

    @Test
    public void getAnnotationMemberValue_Works() throws Exception {
        String annotation = "annotation";
        Object value = "value";
        assertEquals(value, XmlElementWrapperPluginUtils.getAnnotationMemberValue(annotation, value));
    }

}