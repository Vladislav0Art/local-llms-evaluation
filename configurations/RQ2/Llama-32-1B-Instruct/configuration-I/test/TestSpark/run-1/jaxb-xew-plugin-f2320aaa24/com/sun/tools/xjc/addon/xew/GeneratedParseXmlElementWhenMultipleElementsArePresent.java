package com.sun.tools.xjc.addon.xew;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedParseXmlElementWhenMultipleElementsArePresent {

    @Test
    public void parseXmlElementWhenMultipleElementsArePresent() {
        Outline outline = new Outline();
        when(outline.getName()).thenReturn("xml");
        XmlElementWrapperPlugin plugin = new XmlElementWrapperPlugin();
        Mockito.when(plugin.parseXmlElement(outline)).thenReturn(true);
        verify(plugin, times(1)).parseXmlElement(outline);
    }

}