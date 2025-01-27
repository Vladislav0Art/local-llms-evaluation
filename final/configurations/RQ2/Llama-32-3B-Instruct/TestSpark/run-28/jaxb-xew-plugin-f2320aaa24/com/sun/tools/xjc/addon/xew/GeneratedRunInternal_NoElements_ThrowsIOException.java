package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.io.IOException;

public class GeneratedRunInternal_NoElements_ThrowsIOException {

    @Test
    public void runInternal_NoElements_ThrowsIOException() throws IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = new Outline();
        assertFalse(outline.hasElements());
        try {
            plugin.runInternal(outline);
            fail("Expected IOException");
        } catch (IOException e) {
        }
    }

}