package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.basic();

        Element mockEl = mock(Element.class);
        when(mockEl.absUrl(anyString())).thenReturn("http://localhost");

        assertTrue(safelist.isSafeAttribute("a", mockEl, new Attribute("href", "")));

        safelist.removeAttributes("a", "href");

        assertFalse(safelist.isSafeAttribute("a", mockEl, new Attribute("href", "")));
    }

}