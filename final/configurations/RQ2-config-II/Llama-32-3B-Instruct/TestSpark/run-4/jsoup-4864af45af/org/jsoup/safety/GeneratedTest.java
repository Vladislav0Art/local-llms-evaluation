package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;

public class GeneratedTest {

    @Test
    public void none_SafelistCreated() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
    }

    @Test
    public void simpleText_SafelistContainsOnlyTextTags() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void basic_SafelistContainsOnlyBasicTagsAndAttributes() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeAttribute("div", null, null));
        assertTrue(safelist.isSafeTag("div"));
    }

    @Test
    public void basicWithImages_SafelistContainsBasicTagsAndAttributesPlusImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void relaxed_SafelistContainsAllTagsAndAttributes() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeAttribute("div", null, null));
        assertTrue(safelist.isSafeTag("div"));
    }

    @Test
    public void none_AddTagsTagsBecomeSafe() {
        Safelist safelist = Safelist.none();
        Safelist newSafelist = safelist.addTags("p");
        assertTrue(newSafelist.isSafeTag("p"));
    }

    @Test
    public void basic_removeTagsTagsBecomeNotSafe() {
        Safelist safelist = Safelist.basic();
        Safelist newSafelist = safelist.removeTags("p");
        assertFalse(newSafelist.isSafeTag("p"));
    }

    @Test
    public void simpleText_addAttributesAttributesBecomeEnforced() {
        Safelist safelist = Safelist.simpleText();
        Safelist newSafelist = safelist.addAttributes("div", "class", "test");
        assertTrue(newSafelist.getEnforcedAttributes("div").containsKey("class"));
    }

    @Test
    public void basic_addProtocolsProtocolsBecomeEnforced() {
        Safelist safelist = Safelist.basic();
        Safelist newSafelist = safelist.addProtocols("a", "href", "https://example.com");
        assertTrue(newSafelist.getEnforcedAttributes("a").containsKey("href"));
    }

    @Test
    public void none_removeTagsTagsBecomeNotSafe() {
        Safelist safelist = Safelist.none();
        Safelist newSafelist = safelist.removeTags("p");
        assertFalse(newSafelist.isSafeTag("p"));
    }

}