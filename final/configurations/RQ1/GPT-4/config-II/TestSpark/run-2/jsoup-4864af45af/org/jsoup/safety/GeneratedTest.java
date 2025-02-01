package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none().addTags("p", "span");

        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("span"));
        assertFalse(safelist.isSafeTag("div"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.relaxed().removeTags("div");

        assertFalse(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("p"));
    }

    @Test
    public void addAttributesTest() {
        Safelist safelist = Safelist.none().addTags("a").addAttributes("a", "href");

        Element element = mock(Element.class);
        Attribute attribute = new Attribute("href", "https://example.com");

        assertTrue(safelist.isSafeAttribute("a", element, attribute));
        assertFalse(safelist.isSafeAttribute("a", element, new Attribute("class", "btn")));
    }

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.basic().removeAttributes("a", "href");

        Element element = mock(Element.class);
        Attribute attribute = new Attribute("href", "https://example.com");

        assertFalse(safelist.isSafeAttribute("a", element, attribute));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none().addTags("a").addEnforcedAttribute("a", "target", "_blank");

        Element element = mock(Element.class);
        Attribute attribute = new Attribute("target", "_blank");

        assertTrue(safelist.isSafeAttribute("a", element, attribute));
        assertFalse(safelist.isSafeAttribute("a", element, new Attribute("target", "_self")));
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic().removeEnforcedAttribute("a", "rel");

        Element element = mock(Element.class);
        Attribute attribute = new Attribute("rel", "nofollow");

        assertFalse(safelist.isSafeAttribute("a", element, attribute));
    }

    @Test
    public void addProtocolsTest() {
        Safelist safelist = Safelist.basic().addProtocols("a", "href", "mailto");

        Element element = mock(Element.class);
        Attribute attribute = new Attribute("href", "mailto:test@example.com");

        assertTrue(safelist.isSafeAttribute("a", element, attribute));
        assertFalse(safelist.isSafeAttribute("a", element, new Attribute("href", "ftp://example.com")));
    }

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic().removeProtocols("a", "href", "http", "https");

        Element element = mock(Element.class);
        Attribute attribute = new Attribute("href", "http://example.com");

        assertFalse(safelist.isSafeAttribute("a", element, attribute));
    }

    @Test
    public void preserveRelativeLinksTest() {
        Safelist safelist = Safelist.basic().preserveRelativeLinks(true);

        Element element = mock(Element.class);
        when(element.absUrl("href")).thenReturn("");
        Attribute attribute = new Attribute("href", "/relative-url");

        assertTrue(safelist.isSafeAttribute("a", element, attribute));
    }

}