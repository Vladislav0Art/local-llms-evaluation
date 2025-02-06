package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTest {

    @Test
    public void noneIsSafe() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void simpleTextIsSafe() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("span"));
    }

    @Test
    public void basicIsSafe() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("h1"));
    }

    @Test
    public void basicWithImagesNotSafe() {
        Safelist safelist = Safelist.basic();
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void relaxedIsSafe() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("video"));
        assertTrue(safelist.isSafeTag("audio"));
    }

    @Test
    public void basicAddTagsIsSafe() {
        Safelist safelist = Safelist.basic();
        safelist.addTags("img");
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void basicRemoveTagsNotSafe() {
        Safelist safelist = Safelist.basic();
        safelist.removeTags("img");
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void simpleTextAddAttributesIsSafe() {
        Safelist safelist = Safelist.simpleText();
        safelist.addAttributes("img", "alt");
        assertTrue(safelist.isSafeAttribute("img", null, new Attribute("alt")));
    }

    @Test
    public void simpleTextRemoveAttributesNotSafe() {
        Safelist safelist = Safelist.simpleText();
        safelist.removeAttributes("img", "alt");
        assertFalse(safelist.isSafeAttribute("img", null, new Attribute("alt")));
    }

    @Test
    public void basicAddEnforcedAttributesIsSafe() {
        Safelist safelist = Safelist.basic();
        safelist.addEnforcedAttribute("img", "alt", "myValue");
        assertTrue(safelist.isSafeAttribute("img", null, new Attribute("alt", "myValue")));
    }

    @Test
    public void basicRemoveEnforcedAttributesNotSafe() {
        Safelist safelist = Safelist.basic();
        safelist.removeEnforcedAttribute("img", "alt");
        assertFalse(safelist.isSafeAttribute("img", null, new Attribute("alt")));
    }

    @Test
    public void preserveRelativeLinksIsPreserved() {
        Safelist safelist = Safelist.relaxed();
        safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void addProtocolsIsSafe() {
        Safelist safelist = Safelist.basic();
        safelist.addProtocols("img", "src", "https://example.com");
        assertTrue(safelist.isSafeAttribute("img", null, new Attribute("src", "https://example.com")));
    }

    @Test
    public void removeProtocolsNotSafe() {
        Safelist safelist = Safelist.basic();
        safelist.removeProtocols("img", "src", "https://example.com");
        assertFalse(safelist.isSafeAttribute("img", null, new Attribute("src", "https://example.com")));
    }

}