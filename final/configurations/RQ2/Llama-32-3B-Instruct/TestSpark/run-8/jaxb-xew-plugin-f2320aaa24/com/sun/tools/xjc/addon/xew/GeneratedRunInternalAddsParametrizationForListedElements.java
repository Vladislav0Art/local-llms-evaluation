package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedRunInternalAddsParametrizationForListedElements {

    @Test
    public void runInternalAddsParametrizationForListedElements() throws IOException {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Outline outline = createOutline();
        plugin.runInternal(outline);
        assertTrue(isListedAsParametrisation(outline));
    }

}