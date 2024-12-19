package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedHandleAddElement {

    @Test
    public void handleAddElement() {
        Outline outline = new Outline();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        when(plugin.handleAddElement(any(Outline.class))).thenReturn(true);
        assertEquals(true, plugin.handleAddElement(outline));
    }

}