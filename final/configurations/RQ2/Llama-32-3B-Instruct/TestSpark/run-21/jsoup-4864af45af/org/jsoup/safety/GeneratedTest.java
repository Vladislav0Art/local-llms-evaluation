package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void none_SafelistTest() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void simpleText_EnforcesBasicTagsTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("p"));
    }

    @Test
    public void basic_EnforcesImageAndLinkTagsTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(saflist.isSafeTag("a"));
    }

    @Test
    public void basicWithImages_EnforcesBasicTagsIncludingImagesTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void relaxed_AllowsEverything() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(saflist.isSafeTag("script"));
    }

    @Test
    public void addTags_AddsNewTagsToSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img", "p");
        assertTrue(saflist.isSafeTag("img"));
        assertTrue(saflist.isSafeTag("p"));
    }

    @Test
    public void removeTags_RemovesNewlyAddedTagsFromSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img", "p");
        safelist = Safelist.removeTags("img", "p");
        assertFalse(saflist.isSafeTag("img"));
        assertFalse(saflist.isSafeTag("p"));
    }

    @Test
    public void addAttributes_AddsNewAttributesToSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img");
        safelist = Safelist.addAttributes("img", "alt", "example");
        assertEquals(1, ((Attribute) new Attributes().add("alt")).getIntValue());
    }

    @Test
    public void removeAttributes_RemovesNewlyAddedAttributesFromSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img");
        safelist = Safelist.removeAttributes("img", "alt");
        assertNull((Attribute) new Attributes().add("alt"));
    }

    @Test
    public void addEnforcedAttribute_AddsNewEnforcedAttributeToSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img");
        safelist = Safelist.addEnforcedAttribute("img", "data-src", "example.com");
        assertEquals(1, ((Attribute) new Attributes().add("data-src")).getIntValue());
    }

    @Test
    public void removeEnforcedAttribute_RemovesNewlyAddedEnforcedAttributesFromSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img");
        safelist = Safelist.removeEnforcedAttribute("img", "data-src");
        assertNull((Attribute) new Attributes().add("data-src"));
    }

    @Test
    public void preserveRelativeLinks_SafelyPreservesRelativeLinksTest() {
        Safelist safelist = Safelist.relaxed();
        assertFalse(safelist.preserveRelativeLinks(false));
    }

    @Test
    public void addProtocols_AddsNewProtocolsToSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img");
        safelist = Safelist.addProtocols("img", "data-src", "https://example.com");
        assertEquals(1, ((Attribute) new Attributes().add("data-src")).getIntValue());
    }

    @Test
    public void removeProtocols_RemovesNewlyAddedProtocolsFromSafelistTest() {
        Safelist safelist = Safelist.none();
        safelist = Safelist.addTags("img");
        safelist = Safelist.removeProtocols("img", "data-src");
        assertNull((Attribute) new Attributes().add("data-src"));
    }

}