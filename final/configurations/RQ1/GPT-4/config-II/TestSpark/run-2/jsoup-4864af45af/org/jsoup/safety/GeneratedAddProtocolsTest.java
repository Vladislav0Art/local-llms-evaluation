package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAddProtocolsTest {

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.basic().addProtocols("a", "href", "mailto");

        Element element = mock(Element.class);
        Attribute attribute = new Attribute("href", "mailto:test@example.com");

        assertTrue(safelist.isSafeAttribute("a", element, attribute));
        assertFalse(safelist.isSafeAttribute("a", element, new Attribute("href", "ftp://example.com")));
    }

}