package org.jsoup.safety;

public class GeneratedTest {

    @Test
    public void testNone() {
        Safelist none = org.jsoup.safety.Safelist.none();
        assertEquals(null, none);
    }

    @Test
    public void testSimpleText() {
        Safelist simpleText = org.jsoup.safety.Safelist.simpleText();
        assertEquals("simple_text", simpleText.getEnforcedAttributes("a"));
    }

    @Test
    public void testBasic() {
        Safelist basic = org.jsoup.safety.Safelist.basic();
        assertEquals("basic", basic.getEnforcedAttributes("a"));
    }

    @Test
    public void testBasicWithImages() {
        Safelist basicWithImages = org.jsoup.safety.Safelist.basicWithImages();
        assertEquals("basic_with_images", basicWithImages.getEnforcedAttributes("img"));
    }

    @Test
    public void testRelaxed() {
        Safelist relaxed = org.jsoup.safety.Safelist.relaxed();
        assertEquals("relaxed", relaxed.getEnforcedAttributes("a"));
    }

    @Test
    public void testPreserveRelativeLinks() {
        Safelist safelist = org.jsoup.safety.Safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void testAddTags() {
        Safelist safeList = new Safelist();
        safeList.addTags("tag1", "tag2");
        assertEquals("tag1, tag2", safeList.getEnforcedAttributes("a"));
    }

    @Test
    public void testRemoveTags() {
        Safelist safelist = org.jsoup.safety.Safelist.simpleText();
        safelist.removeTags("tag");
        assertEquals("", safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void testAddAttributes() {
        Safelist safeList = new Safelist();
        safeList.addAttributes("attribute1", "value1", "attribute2");
        assertEquals("attribute1=value1,attribute2", safeList.getEnforcedAttributes("a"));
    }

    @Test
    public void testRemoveAttributes() {
        Safelist safelist = org.jsoup.safety.Safelist.simpleText();
        safelist.removeAttributes("tag");
        assertEquals("", safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void testAddEnforcedAttribute() {
        Safelist safeList = new Safelist();
        safeList.addEnforcedAttribute("attribute1", "value1", "attribute2");
        assertEquals("attribute1=value1,attribute2", safeList.getEnforcedAttributes("a"));
    }

    @Test
    public void testRemoveEnforcedAttribute() {
        Safelist safelist = org.jsoup.safety.Safelist.simpleText();
        safelist.removeEnforcedAttribute("tag");
        assertEquals("", safelist.getEnforcedAttributes("a"));
    }

    @Test
    public void testPreserveRelativeLinksWithoutImages() {
        Safelist safelist = new Safelist(true);
        assertTrue(safelist.isSafeTag("a"));
    }

}