package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsListedAsParametrisation_Works {

    @Test
    public void isListedAsParametrisation_Works() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        assertFalse(plugin.isListedAsParametrisation());
    }

}