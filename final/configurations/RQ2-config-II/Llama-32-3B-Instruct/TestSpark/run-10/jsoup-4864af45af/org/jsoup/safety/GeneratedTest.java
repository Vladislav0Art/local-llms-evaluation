package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void none_isEmpty() {
        Set<String> tags = new HashSet<>();
        Set<String> attributes = new HashSet<>();
        Set<String> protocols = new HashSet<>();

        Safelist s = Safelist.none();
        assertTrue(s.addTags(tags));
        assertFalse(s.removeTags(tags));
        assertTrue(s.getEnforcedAttributes("tag").isEmpty());
        assertTrue(s.addProtocols("tag", "attribute", protocols));
        assertFalse(s.removeProtocols("tag", "attribute", protocols));
    }

    @Test
    public void simpleText_addsNoTags() {
        Set<String> tags = new HashSet<>();
        Safelist s = Safelist.simpleText();
        assertTrue(s.addTags(tags));
        assertFalse(s.removeTags(tags));
        assertTrue(s.getEnforcedAttributes("tag").isEmpty());
    }

    @Test
    public void basic_addsDefaultTags() {
        Set<String> tags = new HashSet<>();
        Safelist s = Safelist.basic();
        assertTrue(s.addTags(tags));
        assertFalse(s.removeTags(tags));
        assertEquals(3, s.getEnforcedAttributes("tag").size());
    }

    @Test
    public void relaxed_addsDefaultAndCommonTags() {
        Set<String> tags = new HashSet<>();
        tags.add("img");
        Safelist s = Safelist.relaxed();
        assertTrue(s.addTags(tags));
        assertFalse(s.removeTags(tags));
        assertEquals(2, s.getEnforcedAttributes("tag").size());
    }

    @Test
    public void basicWithImages_addsDefaultTagsAndImages() {
        Set<String> tags = new HashSet<>();
        tags.add("img");
        Safelist s = Safelist.basicWithImages();
        assertTrue(s.addTags(tags));
        assertFalse(s.removeTags(tags));
        assertEquals(2, s.getEnforcedAttributes("tag").size());
    }

    @Test
    public void preserveRelativeLinks_preservesLinks() {
        Set<String> tags = new HashSet<>();
        Element img = new Element();
        img.attr("src", "https://example.com");
        Safelist s = new Safelist(Safelist.relaxed());
        assertTrue(s.preserveRelativeLinks(true));
        assertEquals("https://example.com", s.getEnforcedAttributes("img").attr("src"));
    }

    @Test
    public void preserveRelativeLinks_doesNotPreserveLinks() {
        Set<String> tags = new HashSet<>();
        Element img = new Element();
        img.attr("src", "https://example.com");
        Safelist s = new Safelist(Safelist.relaxed());
        assertTrue(s.preserveRelativeLinks(false));
        assertNull(s.getEnforcedAttributes("img").attr("src"));
    }

    @Test
    public void addTags_addsTags() {
        Set<String> tags = new HashSet<>();
        Safelist s = new Safelist();
        assertTrue(s.addTags(tags));
        assertFalse(s.removeTags(tags));
    }

    @Test
    public void removeTags_removesTags() {
        Set<String> tags = new HashSet<>();
        Safelist s = new Safelist();
        s.addTags(tags);
        assertTrue(s.removeTags(tags));
        assertFalse(s.removeTags(tags));
    }

    @Test
    public void addAttributes_addsAttributes() {
        String tag = "img";
        String attribute = "src";
        String value = "https://example.com";
        Safelist s = new Safelist();
        assertTrue(s.addAttributes(tag, attribute, value));
        assertFalse(s.removeAttributes(tag, attribute));
    }

    @Test
    public void removeAttributes_removesAttributes() {
        String tag = "img";
        String attribute = "src";
        String value = "https://example.com";
        Safelist s = new Safelist();
        s.addAttributes(tag, attribute, value);
        assertTrue(s.removeAttributes(tag, attribute));
        assertFalse(s.removeAttributes(tag, attribute));
    }

    @Test
    public void addEnforcedAttribute_addsAttribute() {
        String tag = "img";
        String attribute = "src";
        String value = "https://example.com";
        Safelist s = new Safelist();
        assertTrue(s.addEnforcedAttribute(tag, attribute, value));
        assertFalse(s.removeEnforcedAttribute(tag, attribute));
    }

    @Test
    public void removeEnforcedAttribute_removesAttribute() {
        String tag = "img";
        String attribute = "src";
        String value = "https://example.com";
        Safelist s = new Safelist();
        s.addEnforcedAttribute(tag, attribute, value);
        assertTrue(s.removeEnforcedAttribute(tag, attribute));
        assertFalse(s.removeEnforcedAttribute(tag, attribute));
    }

    @Test
    public void isSafeTag_returnsTrue() {
        String tag = "img";
        assertTrue(Safelist.none().isSafeTag(tag));
    }

    @Test
    public void isSafeAttribute_returnsFalse() {
        String tagName = "tag";
        Element el = new Element();
        Attribute attr = new Attribute();
        assertFalse(Safelist.none().isSafeAttribute(tagName, el, attr));
    }

}