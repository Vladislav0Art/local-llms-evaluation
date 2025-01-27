package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGetAnnotation_Works {

    @Test
    public void getAnnotation_Works() throws Exception {
        String annotation = "annotation";
        assertEquals(annotation, XmlElementWrapperPluginUtils.getAnnotation(annotation));
    }

}