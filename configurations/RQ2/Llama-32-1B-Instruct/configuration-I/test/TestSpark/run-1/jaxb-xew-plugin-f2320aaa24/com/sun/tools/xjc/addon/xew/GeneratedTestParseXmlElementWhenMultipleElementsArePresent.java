package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedTestParseXmlElementWhenMultipleElementsArePresent {

    @Test
    public void testParseXmlElementWhenMultipleElementsArePresent() {
        Outline outline = new Outline();
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        when(plugin.parseXmlElement(outline)).thenReturn(true);
        try {
            verify(plugin).parseXmlElement(outline);
        } catch (Exception e) {
            assert false : "Expected an exception to be thrown";
        }
    }

}