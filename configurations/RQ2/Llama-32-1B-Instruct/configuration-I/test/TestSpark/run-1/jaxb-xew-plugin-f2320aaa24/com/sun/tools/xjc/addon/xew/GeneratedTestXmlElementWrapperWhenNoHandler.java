package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedTestXmlElementWrapperWhenNoHandler {

    @Test
    public void testXmlElementWrapperWhenNoHandler() {
        Outline outline = new Outline();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        when(plugin.addXmlElementWrapper(outline)).thenReturn(false);
        try {
            verify(plugin, never()).addXmlElementWrapper(outline);
        } catch (Exception e) {
            assert false : "Expected an exception to be thrown";
        }
    }

}