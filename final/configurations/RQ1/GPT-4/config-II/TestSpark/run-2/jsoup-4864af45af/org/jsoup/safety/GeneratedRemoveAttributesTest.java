package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedRemoveAttributesTest {

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.basic().removeAttributes("a", "href");

        Element element = mock(Element.class);
        Attribute attribute = new Attribute("href", "https://example.com");

        assertFalse(safelist.isSafeAttribute("a", element, attribute));
    }

}