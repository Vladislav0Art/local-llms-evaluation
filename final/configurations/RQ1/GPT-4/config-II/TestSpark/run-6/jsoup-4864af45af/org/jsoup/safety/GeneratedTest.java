package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void addTagsTest() {
        Safelist safelist = Safelist.none();
        safelist.addTags("p", "div");

        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeTag("span"));
    }

    @Test
    public void removeTagsTest() {
        Safelist safelist = Safelist.simpleText();
        safelist.removeTags("b", "i");

        assertFalse(safelist.isSafeTag("b"));
        assertFalse(safelist.isSafeTag("i"));
        assertTrue(safelist.isSafeTag("u"));
    }

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

    @Test
    public void removeAttributesTest() {
        Safelist safelist = Safelist.basic();

        Element mockEl = mock(Element.class);
        when(mockEl.absUrl(anyString())).thenReturn("http://localhost");

        assertTrue(safelist.isSafeAttribute("a", mockEl, new Attribute("href", "")));

        safelist.removeAttributes("a", "href");

        assertFalse(safelist.isSafeAttribute("a", mockEl, new Attribute("href", "")));
    }

    @Test
    public void addEnforcedAttributeTest() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute("p", "style", "color: red;");

        Attributes attrs = safelist.getEnforcedAttributes("p");

        assertTrue(attrs.hasKey("style"));
        assertEquals(attrs.get("style"), "color: red;");
    }

    @Test
    public void removeEnforcedAttributeTest() {
        Safelist safelist = Safelist.basic();
        safelist.addEnforcedAttribute("a", "rel", "nofollow");

        Attributes attrs = safelist.getEnforcedAttributes("a");

        assertTrue(attrs.hasKey("rel"));
        assertEquals(attrs.get("rel"), "nofollow");

        safelist.removeEnforcedAttribute("a", "rel");

        attrs = safelist.getEnforcedAttributes("a");

        assertFalse(attrs.hasKey("rel"));
    }

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

    @Test
    public void removeProtocolsTest() {
        Safelist safelist = Safelist.basic();
        safelist.removeProtocols("a", "href", "http", "https");

        Element mockEl = mock(Element.class);
        when(mockEl.absUrl(anyString())).thenReturn("http:");

        assertFalse(safelist.isSafeAttribute("a", mockEl, new Attribute("href", "")));

        when(mockEl.absUrl(anyString())).thenReturn("mailto:");
        assertTrue(safelist.isSafeAttribute("a", mockEl, new Attribute("href", "")));
    }

}