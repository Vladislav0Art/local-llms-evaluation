package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedAddAttributesTest {

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none().addTags("a").addAttributes("a", "href");

        Element element = mock(Element.class);
        Attribute attribute = new Attribute("href", "https://example.com");

        assertTrue(safelist.isSafeAttribute("a", element, attribute));
        assertFalse(safelist.isSafeAttribute("a", element, new Attribute("class", "btn")));
    }

}