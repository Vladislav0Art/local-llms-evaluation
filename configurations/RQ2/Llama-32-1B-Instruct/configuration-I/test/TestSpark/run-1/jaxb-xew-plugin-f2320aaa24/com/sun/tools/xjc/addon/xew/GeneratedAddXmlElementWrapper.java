package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedAddXmlElementWrapper {

    @Test
    public void addXmlElementWrapper() {
        Outline outline = new Outline();
        when(outline.getName()).thenReturn("xml");
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        assertTrue(plugin.addXmlElementWrapper(outline));
    }

}