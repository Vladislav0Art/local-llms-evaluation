package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testNone() {
        Safelist safelist = Safelist.none();
        assertFalse(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeAttribute("tag", "test"));
    }

    @Test
    public void testSimpleText() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeAttribute("test", "test"));
    }

    @Test
    public void testBasic() {
        Safelist safelist = Safelist.basic();
        assertFalse(safelist.isSafeTag("a"));
        assertFalse(safelist.isSafeAttribute("tag", "test"));
        assertFalse(safelist.isSafeAttribute("image", "src"));
    }

    @Test
    public void testBasicWithImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeAttribute("tag", "test"));
        assertFalse(safelist.isSafeAttribute("image", "src"));
    }

    @Test
    public void testRelaxed() {
        Safelist safelist = Safelist.relativelyUnsafe();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeAttribute("tag", "test"));
        assertFalse(safelist.isSafeAttribute("image", "src"));
    }

    @Test
    public void testRelaxedWithImages() {
        Safelist safelist = Safelist.relativelyUnsafe();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeAttribute("tag", "test"));
        assertFalse(safelist.isSafeAttribute("image", "src"));
    }

    @Test
    public void testAddTags() {
        Safelist safelist = new Safelist();
        safelist.addTags("img");
        assertEquals(1, safelist.getEnforcedAttributes("img").size());
    }

    @Test
    public void testRemoveTags() {
        Safelist safelist = new Safelist();
        safelist.removeTags("img");
        assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void testAddAttributes() {
        Safelist safelist = new Safelist();
        safelist.addAttributes("class", "test");
        assertEquals(1, safelist.getEnforcedAttributes("class").size());
    }

    @Test
    public void testRemoveAttributes() {
        Safelist safelist = new Safelist();
        safelist.removeAttributes("class");
        assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void testAddEnforcedAttribute() {
        Safelist safelist = new Safelist();
        safelist.addEnforcedAttribute("img", "src", "https://example.com/image.jpg");
        assertEquals(1, safelist.getEnforcedAttributes("img").size());
    }

    @Test
    public void testRemoveEnforcedAttribute() {
        Safelist safelist = new Safelist();
        safelist.removeEnforcedAttribute("tag", "test");
        assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void testPreserveRelativeLinks() {
        Safelist safelist = new Safelist(Safelist.preserveRelativeLinks(true));
        Element element = new Element();
        element.appendChild(new Element("img", Map.of()));
        assertFalse(safelist.isSafeTag("a"));
    }

}