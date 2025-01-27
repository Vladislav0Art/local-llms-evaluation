package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedRunInternal_ThrowsClassNotFoundException {

    @Test
    public void runInternal_ThrowsClassNotFoundException() throws ClassNotFoundException, IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            Outline outline = new Outline();
            plugin.runInternal(outline);
            fail("Expected ClassNotFoundException to be thrown");
        } catch (ClassNotFoundException e) {
            assertEquals("Class not found", e.getMessage());
        }
    }

}