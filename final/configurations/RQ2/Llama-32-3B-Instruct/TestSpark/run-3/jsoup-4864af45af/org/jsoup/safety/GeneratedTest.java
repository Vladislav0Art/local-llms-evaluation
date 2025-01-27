package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void none_Safelist() {
        assertSame(Safelist.none(), Safelist.none());
    }

    @Test
    public void simpleText_AddTags_MultipleTags() {
        Safelist simpleText = Safelist.simpleText();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("a");
        expectedTags.add("b");
        expectedTags.add("c");
        simpleText = simpleText.addTags("a", "b", "c");
        assertTrue(simpleText.isSafeTag("a"));
        assertTrue(simpleText.isSafeTag("b"));
        assertTrue(simpleText.isSafeTag("c"));
    }

    @Test
    public void basic_RemoveTags_MultipleTagsToRemove() {
        Safelist basic = Safelist.basic();
        Set<String> expectedTagsToRemove = new HashSet<>();
        expectedTagsToRemove.add("img");
        expectedTagsToRemove.add("style");
        expectedTagsToRemove.add("script");
        basic = basic.removeTags(expectedTagsToRemove);
        assertFalse(basic.isSafeTag("img"));
        assertFalse(basic.isSafeTag("style"));
        assertFalse(basic.isSafeTag("script"));
    }

    @Test
    public void relaxed_AddAttributes_MultipleAttributes() {
        Safelist relaxed = Safelist.relaxed();
        Set<String> expectedAttributes = new HashSet<>();
        expectedAttributes.add("alt");
        expectedAttributes.add("title");
        expectedAttributes.add("data-src");
        relaxed = relaxed.addAttributes("img", "alt", "description", "href");
        assertTrue(relaxed.isSafeAttribute("img", null, new Attribute()));
        assertEquals(3, relaxed.getEnforcedAttributes("img").size());
    }

    @Test
    public void preserveRelativeLinks_Preserve_Preserve() {
        Safelist preserveRelativeLinks = Safelist.preserveRelativeLinks(true);
        assertSame(Safelist.preserveRelativeLinks, preserveRelativeLinks);
    }

    @Test
    public void isSafeTag_EmptyString_SafeAttribute() {
        Attributes attributes = new Attributes();
        assertTrue(Safelist.none().isSafeAttribute("", null, new Attribute()));
    }

    @Test
    public void isSafeAttributeTagNameNull_AttributesNull_SafeAttributes() {
        Safelist none = Safelist.none();
        Attributes attributes = new Attributes();
        assertFalse(none.isSafeAttribute(null, null, new Attribute()));
    }

    @Test
    public void basic_EnforcedAttributes_TagsWithAttributes() {
        Safelist basic = Safelist.basic();
        Set<String> expectedTags = new HashSet<>();
        expectedTags.add("img");
        assertEquals(expectedTags, basic.getEnforcedAttributes("img"));
    }

}