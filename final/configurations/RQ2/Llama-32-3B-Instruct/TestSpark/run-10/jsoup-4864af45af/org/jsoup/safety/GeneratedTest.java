package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void none_SafeTagsTest() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void simpleText_SelfClosingTagsTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("/body"));
        assertTrue(safelist.isSafeTag("/p"));
        assertFalse(safelist.isSafeTag("<body>"));
        assertFalse(safelist.isSafeTag("</body>"));
    }

    @Test
    public void basic_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("/img"));
        assertTrue(safelist.isSafeAttribute("img", null, null));
        assertFalse(safelist.isSafeTag("<img>"));
        assertFalse(safelist.isSafeTag("</img>"));
    }

    @Test
    public void basicWithImages_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("/img"));
        assertTrue(safelist.isSafeAttribute("img", null, null));
        assertFalse(safelist.isSafeTag("<img>"));
        assertFalse(safelist.isSafeTag("</img>"));
    }

    @Test
    public void relaxed_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("/body"));
        assertTrue(safelist.isSafeAttribute("div", null, null));
        assertFalse(safelist.isSafeTag("<body>"));
        assertFalse(safelist.isSafeTag("</body>"));
    }

    @Test
    public void addTags_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.addTags("img", "br");
        assertTrue(safelist.isSafeTag("/img"));
        assertTrue(safelist.isSafeAttribute("img", null, null));
        assertFalse(safelist.isSafeTag("<img>"));
        assertFalse(safelist.isSafeTag("</img>"));
    }

    @Test
    public void removeTags_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.removeTags("script", "font");
        assertTrue(safelist.isSafeTag("/img"));
        assertFalse(safelist.isSafeAttribute("img", null, null));
        assertFalse(safelist.isSafeTag("<img>"));
        assertFalse(safelist.isSafeTag("</img>"));
    }

    @Test
    public void addAttributes_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.addAttributes("img", "src");
        assertTrue(safelist.isSafeAttribute("img", null, "href"));
        assertTrue(safelist.isSafeAttribute("img", null, "src"));
        assertFalse(safelist.isSafeAttribute("img", null, "src"));
    }

    @Test
    public void removeAttributes_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.removeAttributes("script", "href");
        assertTrue(safelist.isSafeAttribute("script", null, "type"));
        assertFalse(safelist.isSafeAttribute("script", null, "href"));
    }

    @Test
    public void addEnforcedAttribute_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.addEnforcedAttribute("img", "src", "https://example.com");
        assertTrue(safelist.isSafeAttribute("img", null, "src"));
        assertFalse(safelist.isSafeAttribute("img", null, "href"));
    }

    @Test
    public void removeEnforcedAttribute_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.removeEnforcedAttribute("script", "type");
        assertTrue(safelist.isSafeAttribute("script", null, "type"));
        assertFalse(safelist.isSafeAttribute("script", null, "href"));
    }

    @Test
    public void preserveRelativeLinks_PreserveTest() {
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeTag("/a"));
        assertFalse(safelist.isSafeTag("<a>"));
    }

    @Test
    public void addProtocols_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.addProtocols("img", "src", "https://example.com");
        assertTrue(safelist.isSafeAttribute("img", null, "src"));
        assertFalse(safelist.isSafeAttribute("img", null, "href"));
    }

    @Test
    public void removeProtocols_SelfClosingTagsAndAttributesTest() {
        Safelist safelist = Safelist.removeProtocols("script", "type", "https://example.com");
        assertTrue(safelist.isSafeAttribute("script", null, "type"));
        assertFalse(safelist.isSafeAttribute("script", null, "href"));
    }

}