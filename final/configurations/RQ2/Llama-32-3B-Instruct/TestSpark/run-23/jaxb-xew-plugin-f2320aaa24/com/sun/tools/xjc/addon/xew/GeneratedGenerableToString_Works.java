package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedGenerableToString_Works {

    @Test
    public void generableToString_Works() {
        String annotation = "annotation";
        assertEquals("annotation", XmlElementWrapperPluginUtils.generableToString(annotation));
    }

}