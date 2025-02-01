package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes("p", "style", "class");

        Element mockEl = mock(Element.class);
        when(mockEl.absUrl(anyString())).thenReturn("http://localhost");

        assertTrue(safelist.isSafeAttribute("p", mockEl, new Attribute("style", "")));
        assertTrue(safelist.isSafeAttribute("p", mockEl, new Attribute("class", "")));
        assertFalse(safelist.isSafeAttribute("p", mockEl, new Attribute("align", "")));
    }

}