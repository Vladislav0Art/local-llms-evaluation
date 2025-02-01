package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedRemoveProtocolsTest {

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic().removeProtocols("a", "href", "http", "https");

        Element element = mock(Element.class);
        Attribute attribute = new Attribute("href", "http://example.com");

        assertFalse(safelist.isSafeAttribute("a", element, attribute));
    }

}