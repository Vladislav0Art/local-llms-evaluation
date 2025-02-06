package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void none() {
        Safelist safelist = Safelist.nonce();
        assertTrue(safelist.isSafeTag("script"));
        assertFalse(safelist.isSafeAttribute("img", null, null));
        assertNull(safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void simpleText() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("span"));
        assertFalse(safelist.isSafeAttribute("div", null, null));
        assertNull(safelist.getEnforcedAttributes("div"));
    }

    @Test
    public void basic() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeAttribute("b", null, null));
        assertNull(safelist.getEnforcedAttributes("b"));
    }

    @Test
    public void basicWithImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeAttribute("a", null, null));
        assertNull(safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void relaxed() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeAttribute("script", null, null));
        assertNull(safelist.getEnforcedAttributes("script"));
    }

    @Test
    public void preserveRelativeLinks() {
        Safelist safelist = Safelist.preserveRelativeLinks(false);
        assertTrue(!safelist.isSafeTag("base"));
        assertFalse(safelist.isSafeAttribute("a", null, null));
        assertNull(safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void addTags() {
        Safelist safelist = Safelist.addTags("div", "span");
        assertTrue(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeAttribute("img", null, null));
        assertNull(safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void removeTags() {
        Safelist safelist = Safelist.removeTags("script");
        assertTrue(!safelist.isSafeTag("script"));
        assertFalse(safelist.isSafeAttribute("img", null, null));
        assertNull(safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void addAttributes() {
        Safelist safelist = Safelist.addAttributes("div", "style");
        assertTrue(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeAttribute("img", null, null));
        assertNull(safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void removeAttributes() {
        Safelist safelist = Safelist.removeAttributes("div", "style");
        assertTrue(!safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeAttribute("img", null, null));
        assertNull(safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void addEnforcedAttribute() {
        Safelist safelist = Safelist.addEnforcedAttribute("div", "style", "color: red");
        assertTrue(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeAttribute("img", null, null));
        assertEquals("color: red", safelist.getEnforcedAttributes("img").getValue());
    }

    @Test
    public void removeEnforcedAttribute() {
        Safelist safelist = Safelist.removeEnforcedAttribute("div", "style");
        assertTrue(!safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeAttribute("img", null, null));
        assertNull(safelist.getEnforcedAttributes("img"));
    }

}