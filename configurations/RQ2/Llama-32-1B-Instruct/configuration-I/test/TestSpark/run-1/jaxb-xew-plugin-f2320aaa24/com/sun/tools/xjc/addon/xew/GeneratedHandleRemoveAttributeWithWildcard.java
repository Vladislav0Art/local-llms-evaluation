package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedHandleRemoveAttributeWithWildcard {

    @Test
    public void handleRemoveAttributeWithWildcard() {
        Outline outline = new Outline();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        when(plugin.handleRemoveAttributeWithWildcard(any(Outline.class))).thenReturn(true);
        assertEquals(true, plugin.handleRemoveAttributeWithWildcard(outline));
    }

}