package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedRunInternal_ThrowsIOException {

    @Test
    public void runInternal_ThrowsIOException() throws IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        try {
            Outline outline = new Outline();
            plugin.runInternal(outline);
            fail("Expected IOException to be thrown");
        } catch (IOException e) {
            // expected exception
        }
    }
}

}