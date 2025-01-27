package com.sun.tools.xjc.addon.xew;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedHasPropertyNameCustomization_Works {

    @Test
    public void hasPropertyNameCustomization_Works() {
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        assertTrue(plugin.hasPropertyNameCustomization("propertyName"));
    }

}