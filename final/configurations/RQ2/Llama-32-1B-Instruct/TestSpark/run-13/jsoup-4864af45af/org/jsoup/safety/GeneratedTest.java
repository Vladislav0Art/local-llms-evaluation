package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;

import java.util.Set;

public class GeneratedTest {

    @Test
    public void testNone() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void testSimpleText() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeAttribute("a", "href", "/"));
    }

    @Test
    public void testBasic() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("body"));
        assertTrue(safelist.isSafeAttribute("title", "id", ""));
        assertFalse(safelist.isSafeAttribute("a", "", "href"));
    }

    @Test
    public void testBasicWithImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("src", "data-src", ""));
        assertFalse(safelist.isSafeAttribute("a", "", "href"));
    }

    @Test
    public void testRelaxed() {
        Safelist safelist = Safelist.relativelySafe();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeAttribute("a", "href", "/"));
        assertFalse(safelist.isSafeAttribute("script", ""));
    }

    @Test
    public void testRelaxedWithImages() {
        Safelist safelist = Safelist.relativelySafeWithImages();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("src", "data-src", ""));
        assertFalse(safelist.isSafeAttribute("script", ""));
    }

    @Test
    public void testEnforcedAttributes() {
        Safelist safelist = Safelist.enforceAttributes();
        assertTrue(safelist.getEnforcedAttributes("a"));
        assertTrue(safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void testRemoveEnforcedAttribute() {
        Safelist safelist = Safelist.removeEnforcedAttribute("a", "href");
        assertTrue(!safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeAttribute("a", "", ""));
    }

    @Test
    public void testAddProtocols() {
        Safelist safelist = Safelist.addProtocols("img", "alt", "");
        Set<String> protocols = safelist.getEnforcedAttributes("img");
        assertTrue(protocols.contains("x-http"));
        assertTrue(protocols.contains("data"));
        assertFalse(safelist.isSafeAttribute("script", "", ""));
    }

    @Test
    public void testRemoveProtocols() {
        Safelist safelist = Safelist.removeProtocols("img", "alt");
        Set<String> protocols = safelist.getEnforcedAttributes("img");
        assertTrue(protocols.contains("x-http"));
        assertTrue(protocols.contains("data"));
        assertFalse(safelist.isSafeAttribute("script", "", ""));
    }

}