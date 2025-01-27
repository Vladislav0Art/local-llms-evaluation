package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void none_SimpleTextTest() {
        Safelist safelist = Safelist.none();
        assertEquals(Safelist.simpleText(), safelist);
    }

    @Test
    public void simpleText_BasicTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("img", null, null));
    }

    @Test
    public void basic_NoneTest() {
        Safelist safelist = Safelist.basic();
        assertNotEquals(Safelist.none(), safelist);
    }

    @Test
    public void basicWithImages_SimpleTextTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertEquals(Safelist.simpleText(), safelist);
    }

    @Test
    public void relaxed_NoneTest() {
        Safelist safelist = Safelist.relaxed();
        assertNotEquals(Safelist.none(), safelist);
    }

    @Test
    public void addTags_AddTagsTest() {
        Safelist safelist = Safelist.addTags("tag");
        assertTrue(safelist.isSafeTag("tag"));
    }

    @Test
    public void removeTags_RemoveTagsTest() {
        Safelist safelist = Safelist.removeTags("tag");
        assertFalse(safelist.isSafeTag("tag"));
    }

    @Test
    public void addAttributes_AddAttributesTest() {
        Safelist safelist = Safelist.addAttributes("img", "alt", "text");
        assertTrue(safelist.isSafeAttribute("img", null, new Attribute("alt", "text")));
    }

    @Test
    public void removeAttributes_RemoveAttributesTest() {
        Safelist safelist = Safelist.removeAttributes("img", "alt");
        assertFalse(safelist.isSafeAttribute("img", null, new Attribute("alt", "text")));
    }

    @Test
    public void addEnforcedAttribute_AddEnforcedAttributeTest() {
        Safelist safelist = Safelist.addEnforcedAttribute("img", "alt", "text");
        assertTrue(safelist.getEnforcedAttributes("img").contains(new Attribute("alt", "text")));
    }

    @Test
    public void removeEnforcedAttribute_RemoveEnforcedAttributeTest() {
        Safelist safelist = Safelist.removeEnforcedAttribute("img", "alt");
        assertEquals(null, safelist.getEnforcedAttributes("img"));
    }

    @Test
    public void preserveRelativeLinks_PreserveLinksTest() {
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeAttribute("href", null, new Attribute("href", "https://example.com")));
    }

    @Test
    public void addProtocols_AddProtocolsTest() {
        Safelist safelist = Safelist.addProtocols("img", "alt", "https://example.com");
        assertTrue(safelist.getEnforcedAttributes("img").contains(new Attribute("alt", "text")));
    }

    @Test
    public void removeProtocols_RemoveProtocolsTest() {
        Safelist safelist = Safelist.removeProtocols("img", "alt", new String[]{"https://example.com"});
        assertFalse(safelist.getEnforcedAttributes("img").contains(new Attribute("alt", "text")));
    }

}