package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols("a", "href", "mailto");

        Element mockEl = mock(Element.class);
        when(mockEl.absUrl(anyString())).thenReturn("mailto:");

        assertTrue(safelist.isSafeAttribute("a", mockEl, new Attribute("href", "")));

        when(mockEl.absUrl(anyString())).thenReturn("http:");
        assertFalse(safelist.isSafeAttribute("a", mockEl, new Attribute("href", "")));
    }

}