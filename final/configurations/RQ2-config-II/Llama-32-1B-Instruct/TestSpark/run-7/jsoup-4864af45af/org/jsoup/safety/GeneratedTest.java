package org.jsoup.safety;

import org.junit.jupiter.api.Test;

import static org.jsoup.safety.Safelist.none;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void basicSafe() {
        Safelist safelist = none();
        safelist.addTags("a", "b");
        safelist.addAttributes("class", "style");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("b"));
    }

    @Test
    public void basicNotSafe() {
        Safelist safelist = none();
        safelist.removeTags("a");
        assertEquals(", ", safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void safeTagAttribute() {
        Safelist safelist = none();
        safelist.addTags("img", "link");
        safelist.addAttributes("class", "style");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("img"));
        assertEquals("", safelist.getEnforcedAttributes("link"));
    }

    @Test
    public void safeTagAttributeNoAttribute() {
        Safelist safelist = none();
        safelist.addTags("img", "link");
        safelist.preserveRelativeLinks(true);
        safelist.removeAttributes("style");
        assertEquals("", safelist.getEnforcedAttributes("img"));
        assertEquals("", safelist.getEnforcedAttributes("link"));
    }

    @Test
    public void relaxedSafe() {
        Safelist safelist = none();
        safelist.addTags("a", "b");
        safelist.preserveRelativeLinks(false);
        assertEquals("", safelist.getEnforcedAttributes("b"));
        assertEquals(", ", safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void basicWithImagesSafe() {
        Safelist safelist = none();
        safelist.addTags("img", "link");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("img"));
        assertEquals("", safelist.getEnforcedAttributes("link"));
    }

    @Test
    public void relaxedWithImagesSafe() {
        Safelist safelist = none();
        safelist.addTags("img", "link");
        safelist.preserveRelativeLinks(false);
        assertEquals("", safelist.getEnforcedAttributes("img"));
        assertEquals("", safelist.getEnforcedAttributes("link"));
    }

    @Test
    public void addTags() {
        Safelist safelist = none();
        safelist.addTags("a", "b");
        safelist.addTags("img", "link");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("b"));
        assertEquals("", safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void removeTags() {
        Safelist safelist = none();
        safelist.removeTags("a", "b");
        safelist.removeTags("link", "style");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("b"));
        assertEquals("", safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void addAttribute() {
        Safelist safelist = none();
        safelist.addAttributes("class", "style");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("b"));
        assertEquals("", safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void removeAttribute() {
        Safelist safelist = none();
        safelist.removeAttributes("class", "style");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("b"));
        assertEquals("", safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void addEnforceAttribute() {
        Safelist safelist = none();
        safelist.addEnforcedAttribute("class", "style", "");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("b"));
        assertEquals("", safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void removeEnforceAttribute() {
        Safelist safelist = none();
        safelist.removeEnforceAttribute("style");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("b"));
        assertEquals("", safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void addProtocols() {
        Safelist safelist = none();
        safelist.addProtocols("a", "href");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("b"));
        assertEquals("", safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void removeProtocols() {
        Safelist safelist = none();
        safelist.removeProtocols("a", "href");
        safelist.preserveRelativeLinks(true);
        assertEquals("", safelist.getEnforcedAttributes("b"));
        assertEquals("", safelist.getEnforcedAttributes("img"));
    }

}