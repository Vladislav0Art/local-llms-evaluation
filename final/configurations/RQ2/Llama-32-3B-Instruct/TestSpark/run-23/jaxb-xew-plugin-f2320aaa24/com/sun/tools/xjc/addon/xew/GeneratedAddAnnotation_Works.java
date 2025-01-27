package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedAddAnnotation_Works {

    @Test
    public void addAnnotation_Works() throws Exception {
        String annotation = "annotation";
        assertEquals("annotation", XmlElementWrapperPluginUtils.addAnnotation(annotation));
    }

}