package org.jsoup.safety;

public class GeneratedTest {

    @Test
    public void none_SafelistNone() {
        assertSame(Safelist.none(), Safelist.none());
    }

    @Test
    public void simpleText_SimpleText() {
        assertSame(Safelist.simpleText(), Safelist.simpleText());
    }

    @Test
    public void basic_BasicSafelist() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void basicWithImages_SimpleTextAndImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void relaxed_RelaxedSafelist() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("script"));
        assertFalse(safelist.isSafeAttribute("script", null, null));
    }

    @Test
    public void preserveRelativeLinks_PreserveRelativeLinks() {
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertSame(Safelist.relaxed(), safelist);
    }

    @Test
    public void addTags_AddTagToSafelist() {
        Safelist safelist = Safelist.basic();
        Safelist safelist1 = Safelist.addTags("b", "a");
        assertTrue(safelist1.isSafeTag("b"));
        assertTrue(safelist1.isSafeTag("a"));
    }

    @Test
    public void removeTags_RemoveTagFromSafelist() {
        Safelist safelist = Safelist.basicWithImages();
        Safelist safelist1 = Safelist.removeTags("img");
        assertFalse(safelist1.isSafeTag("img"));
    }

    @Test
    public void addAttributes_AddAttributeToSafelist() {
        Safelist safelist = Safelist.basic();
        Safelist safelist1 = Safelist.addAttributes("a", "href", "https://example.com");
        assertTrue(safelist1.getEnforcedAttributes("a").containsKey("href"));
    }

    @Test
    public void removeAttributes_RemoveAttributeFromSafelist() {
        Safelist safelist = Safelist.basicWithImages();
        Safelist safelist1 = Safelist.removeAttributes("img", "src");
        assertFalse(safelist1.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void addEnforcedAttribute_AddEnforcedAttributeToSafelist() {
        Safelist safelist = Safelist.basic();
        Safelist safelist1 = Safelist.addEnforcedAttribute("a", "href", "https://example.com");
        assertTrue(safelist1.getEnforcedAttributes("a").containsKey("href"));
    }

    @Test
    public void removeEnforcedAttribute_RemoveEnforcedAttributeFromSafelist() {
        Safelist safelist = Safelist.basicWithImages();
        Safelist safelist1 = Safelist.removeEnforcedAttribute("img", "src");
        assertFalse(safelist1.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void preserveRelativeLinks_PreserveRelativeLinksDisabled() {
        Safelist safelist = Safelist.preserveRelativeLinks(false);
        assertNotSame(Safelist.relaxed(), safelist);
    }

    @Test
    public void addProtocols_AddProtocolToSafelist() {
        Safelist safelist = Safelist.basic();
        Safelist safelist1 = Safelist.addProtocols("img", "src", "https://example.com");
        assertTrue(safelist1.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void removeProtocols_RemoveProtocolFromSafelist() {
        Safelist safelist = Safelist.basicWithImages();
        Safelist safelist1 = Safelist.removeProtocols("img", "src", null);
        assertFalse(safelist1.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void isSafeTag_IsSafeTagForBasicSafelist() {
        assertSame(true, Safelist.basic().isSafeTag("p"));
        assertSame(false, Safelist.relaxed().isSafeTag("script"));
    }

    @Test
    public void isSafeAttribute_IsSafeAttributeForBasicSafelist() {
        Safelist safelist = Safelist.relaxed();
        assertSame(false, safelist.isSafeAttribute(null, null, null));
    }

}