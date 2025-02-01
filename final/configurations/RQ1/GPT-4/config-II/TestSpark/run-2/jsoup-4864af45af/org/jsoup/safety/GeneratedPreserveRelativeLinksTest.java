package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedPreserveRelativeLinksTest {

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.basic().preserveRelativeLinks(true);

        Element element = mock(Element.class);
        when(element.absUrl("href")).thenReturn("");
        Attribute attribute = new Attribute("href", "/relative-url");

        assertTrue(safelist.isSafeAttribute("a", element, attribute));
    }

}