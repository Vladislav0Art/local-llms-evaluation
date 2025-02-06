package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer.lowerCase;

public class GeneratedTest {

    @Test
    public void none_SafelistReturnsNone() {
        Safelist safelist = Safelist.none();
        assertEquals(Safelist.none(), safelist);
    }

    @Test
    public void simpleText_SafelistContainsSimpleTags() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void basic_SafelistContainsBasicTags() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("h1"));
        assertTrue(safelist.isSafeTag("h2"));
    }

    @Test
    public void basicWithImages_SafelistContainsBasicAndImageTags() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void relaxed_SafelistContainsRelaxedTags() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("span"));
        assertTrue(safelist.isSafeTag("div"));
    }

    @Test
    public void addTags_AddsTagsToSafelist() {
        Safelist safelist = Safelist.none();
        Set<String> tags = new HashSet<>();
        tags.add("b");
        safelist = safelist.addTags(tags.toArray(new String[0]));
        assertTrue(safelist.isSafeTag("b"));
    }

    @Test
    public void removeTags_RemovesTagsFromSafelist() {
        Safelist safelist = Safelist.none();
        Set<String> tags = new HashSet<>();
        tags.add("img");
        safelist = safelist.removeTags(tags.toArray(new String[0]));
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void addAttributes_AddsAttributesToSafelist() {
        Safelist safelist = Safelist.none();
        Set<String> attributes = new HashSet<>();
        attributes.add("style");
        safelist = safelist.addAttributes("div", attributes.toArray(new String[0]));
        assertTrue(safelist.getEnforcedAttributes("div").containsKey("style"));
    }

    @Test
    public void removeAttributes_RemovesAttributesFromSafelist() {
        Safelist safelist = Safelist.none();
        Set<String> attributes = new HashSet<>();
        attributes.add("title");
        safelist = safelist.removeAttributes("img", attributes.toArray(new String[0]));
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("title"));
    }

    @Test
    public void preserveRelativeLinks_SafelistPreservesLinks() {
        Safelist safelist = Safelist.none();
        Element element = new Element("a");
        boolean preserve = true;
        safelist = safelist.preserveRelativeLinks(preserve);
        assertTrue(safelist.isSafeAttribute(null, element, null));
    }

    @Test
    public void addProtocols_AddsProtocolsToSafelist() {
        Safelist safelist = Safelist.none();
        Set<String> protocols = new HashSet<>();
        protocols.add("http");
        safelist = safelist.addProtocols("a", "href", protocols.toArray(new String[0]));
        assertTrue(safelist.getEnforcedAttributes("a").containsKey("href"));
    }

    @Test
    public void removeProtocols_RemovesProtocolsFromSafelist() {
        Safelist safelist = Safelist.none();
        Set<String> protocols = new HashSet<>();
        protocols.add("http");
        safelist = safelist.removeProtocols("a", "href", protocols.toArray(new String[0]));
        assertFalse(safelist.getEnforcedAttributes("a").containsKey("href"));
    }

}