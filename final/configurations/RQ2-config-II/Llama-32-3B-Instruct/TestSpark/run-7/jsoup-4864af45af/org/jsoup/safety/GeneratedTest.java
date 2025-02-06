package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GeneratedTest {

    @Test
    public void none_SafelistCreatedTest() {
        assertTrue(Safelist.none().isSafeTag(""));
    }

    @Test
    public void simpleText_TextOnlySafelistTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.add("text");
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("text"));
    }

    @Test
    public void basic_BasicSafelistTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.add("a", "img", "br", "strong");
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void basicWithImages_ImageUrlsAllowedTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.add("img");
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeAttribute("", null, new Attribute("", "", "https://example.com/image.jpg")));
    }

    @Test
    public void relaxed_AllowedTagsIncludeBasicAndSimpleTextTagsTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.addAll(Safelist.basic().getSafeTags());
        safeTags.addAll(Safelist.simpleText().getSafeTags());
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void none_SafeTagsAreNotAllowedTest() {
        Set<String> safeTags = new HashSet<>();
        assertFalse(Safelist.none().isSafeTag("script"));
    }

    @Test
    public void addTags_MultipleTagsAddedTest() {
        Safelist safelist = Safelist.addTags("a", "img");
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void removeTags_ExistingAllowedTagsNotRemovedTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.addAll(Safelist.addTags("a", "img").getSafeTags());
        Safelist safelist = Safelist.removeTags("script");
        assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void addAttributes_AttributesAddedToExistingTagsTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.addAll(Safelist.addTags("a", "img").getSafeTags());
        Safelist safelist = Safelist.addAttributes("a", "href", "https://example.com");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("", "", "https://example.com")));
    }

    @Test
    public void removeAttributes_ExistingAllowedAttributesNotRemovedTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.addAll(Safelist.addTags("a").getSafeTags());
        Safelist safelist = Safelist.removeAttributes("script", "href");
        assertTrue(safelist.isSafeAttribute("a", null, new Attribute("", "", "")));
    }

    @Test
    public void addEnforcedAttribute_AttributeAddedToExistingTagTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.addAll(Safelist.addTags("img").getSafeTags());
        Safelist safelist = Safelist.addEnforcedAttribute("img", "alt", "https://example.com/image.jpg");
        assertTrue(safelist.isSafeAttribute("img", null, new Attribute("", "", "https://example.com/image.jpg")));
    }

    @Test
    public void removeEnforcedAttribute_ExistingAllowedAttributesNotRemovedTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.addAll(Safelist.addTags("a").getSafeTags());
        Safelist safelist = Safelist.removeEnforcedAttribute("img", "alt");
        assertTrue(safelist.isSafeAttribute("img", null, new Attribute("", "", "")));
    }

    @Test
    public void preserveRelativeLinks_RelativeLinksAllowedTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.addAll(Safelist.addTags("a").getSafeTags());
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeAttribute("", null, new Attribute("", "", "https://example.com/path")));
    }

    @Test
    public void addProtocols_AddedProtocolsAllowedOnExistingTagsTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.addAll(Safelist.addTags("img").getSafeTags());
        Safelist safelist = Safelist.addProtocols("img", "src", "https://example.com/image.jpg");
        assertTrue(safelist.isSafeAttribute("", null, new Attribute("", "", "https://example.com/image.jpg")));
    }

    @Test
    public void removeProtocols_ExistingAllowedProtocolsNotRemovedTest() {
        Set<String> safeTags = new HashSet<>();
        safeTags.addAll(Safelist.addTags("img").getSafeTags());
        Safelist safelist = Safelist.removeProtocols("script", "src");
        assertTrue(safelist.isSafeAttribute("", null, new Attribute("", "", "")));
    }

}