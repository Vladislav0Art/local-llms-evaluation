package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCopyAnnotationMemberValue_Works {

    @Test
    public void copyAnnotationMemberValue_Works() {
        String annotation = "annotation";
        Object value = "value";
        assertEquals(value, XmlElementWrapperPluginUtils.copyAnnotationMemberValue(annotation, value));
    }

}