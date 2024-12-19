package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedHandleRemoveAttribute {

    @Test
    public void handleRemoveAttribute() {
        Outline outline = new Outline();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        when(plugin.handleRemoveAttribute(any(Outline.class))).thenReturn(true);
        assertEquals(true, plugin.handleRemoveAttribute(outline));
    }

}