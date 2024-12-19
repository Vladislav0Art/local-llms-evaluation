package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedParseXmlElement {

    @Test
    public void parseXmlElement() {
        Outline outline = new Outline();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        when(plugin.parseXmlElement(any(Outline.class))).thenReturn(true);
        assertTrue(plugin.parseXmlElement(outline));
    }

}