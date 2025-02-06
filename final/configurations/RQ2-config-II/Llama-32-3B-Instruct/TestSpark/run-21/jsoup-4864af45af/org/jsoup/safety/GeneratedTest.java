package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

public class GeneratedTest {

    @Test
    public void none_emptyTagsTest() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag(""));
    }

    @Test
    public void simpleText_safelyTagsTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void basic_safelyTagsTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("br"));
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void basicWithImages_tagsTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("br"));
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void relaxed_tagsTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("div"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void addTags_addsTagsTest() {
        Safelist safelist = Safelist.addTags("p", "span");
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("span"));
    }

    @Test
    public void removeTags_removalsTagsTest() {
        Safelist safelist = Safelist.basic();
        safelist = safelist.removeTags("img");
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void addAttributes_addsAttributesTest() {
        Safelist safelist = Safelist.addTags("a", "href");
        assertEquals(1, safelist.getEnforcedAttributes("a").size());
        safelist = safelist.removeAttributes("a", "href");
        assertFalse(safelist.getEnforcedAttributes("a").containsKey("href"));
    }

    @Test
    public void addProtocols_addsProtocolsTest() {
        Safelist safelist = Safelist.addTags("img", "src");
        assertEquals(1, safelist.getEnforcedAttributes("img").size());
        safelist = safelist.removeProtocols("img", "src");
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void preserveRelativeLinks_preservesLinksTest() {
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeAttribute("", null, null));
    }

}