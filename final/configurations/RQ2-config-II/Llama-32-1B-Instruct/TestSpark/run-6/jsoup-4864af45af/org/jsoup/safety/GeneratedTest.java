package org.jsoup.safety;

public class GeneratedTest {

    @Test
    public void none_SafelistNone() {
        Safelist result = new Safelist();
        assertEquals(null, result.none());
    }

    @Test
    public void simpleText_SimpleTag() {
        Safelist result = new Safelist();
        assertTrue(result.simpleText().isSafeTag("a"));
        assertFalse(result.simpleText().isSafeTag("p"));
    }

    @Test
    public void basic_SimpleTagWithImages() {
        Safelist result = new Safelist().basicWithImages();
        assertTrue(result.basicWithImages().isSafeTag("img"));
        assertFalse(result.basicWithImages().isSafeTag("a"));
    }

    @Test
    public void relaxed_SafelistRelaxed() {
        Safelist result = new Safelist().relaxed();
        assertTrue(result.relativelySimpleText().isSafeTag("a"));
        assertFalse(result.relativelySimpleText().isSafeTag("p"));
    }

    @Test
    public void noTags_SafeText() {
        Safelist result = new Safelist();
        assertTrue(result.simpleText().isSafe());
    }

    @Test
    public void addTags_SafeTag() {
        Safelist result = new Safelist();
        String tag = "a";
        result.addTags(tag);
        assertTrue(result.isSafeTag(tag));
        assertEquals("a", result.getEnforcedAttributes(tag).iterator().next().getKey());
    }

    @Test
    public void removeTags_SafeTag() {
        Safelist result = new Safelist();
        String tag = "a";
        result.removeTags(tag);
        assertFalse(result.isSafeTag(tag));
        assertEquals("", result.getEnforcedAttributes(tag).iterator().next().getKey());
    }

    @Test
    public void addAttributes_SafeAttribute() {
        Safelist result = new Safelist();
        Element el = new Element("p");
        String tagName = "a";
        assertTrue(result.addAttributes(tagName, "href"));
        assertEquals("href", result.getEnforcedAttributes(tagName).iterator().next().getKey());
    }

    @Test
    public void removeAttributes_SafeAttribute() {
        Safelist result = new Safelist();
        Element el = new Element("p");
        String tagName = "a";
        assertTrue(result.removeAttributes(tagName, "href"));
        assertEquals("", result.getEnforcedAttributes(tagName).iterator().next().getKey());
    }

    @Test
    public void addEnforcedAttribute_SafeAttribute() {
        Safelist result = new Safelist();
        Element el = new Element("p");
        String tagName = "a";
        result.addEnforcedAttribute(tagName, "href", "https://example.com");
        assertEquals("href=https://example.com", result.getEnforcedAttributes(tagName).iterator().next().getKey());
    }

    @Test
    public void removeEnforcedAttribute_SafeAttribute() {
        Safelist result = new Safelist();
        Element el = new Element("p");
        String tagName = "a";
        assertTrue(result.removeEnforcedAttribute(tagName, "href"));
        assertEquals("", result.getEnforcedAttributes(tagName).iterator().next().getKey());
    }

    @Test
    public void preserveRelativeLinks_Safelist() {
        Safelist result = new Safelist().preserveRelativeLinks(true);
        assertTrue(result.preserveRelativeLinks(true));
    }

}