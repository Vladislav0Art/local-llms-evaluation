package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Attributes;
import org.jsoup.helper.Validate;
import org.jsoup.internal.Normalizer;

public class GeneratedTest {

    @Test
    public void none_EmptySafelist_ReturnsNone() {
        Safelist safelist = Safelist.none();
        assertNotNull(safelist);
        assertTrue(safelist.isEmpty());
    }

    @Test
    public void simpleText_SimpleTextSafelist_ReturnsSimpleTextSafelist() {
        Safelist safelist = Safelist.simpleText();
        assertNotNull(safelist);
        assertTrue(safelist.contains("text"));
    }

    @Test
    public void basicBasicSafelist_ReturnsBasicSafelist() {
        Safelist safelist = Safelist.basic();
        assertNotNull(safelist);
        assertTrue(safelist.contains("a"));
        assertFalse(safelist.contains("img"));
    }

    @Test
    public void basicWithImages_BasicWithImagesSafelist_ReturnsBasicWithImagesSafelist() {
        Safelist safelist = Safelist.basicWithImages();
        assertNotNull(safelist);
        assertTrue(safelist.contains("a"));
        assertTrue(safelist.contains("img"));
    }

    @Test
    public void relaxedRelaxedSafelist_ReturnsRelaxedSafelist() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
        assertTrue(safelist.contains("a"));
        assertTrue(safelist.contains("img"));
        assertFalse(safelist.contains("script"));
    }

    @Test
    public void addTags_AddTagsToExistingSafelist_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.addTags("b", "strong");
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("b"));
        assertTrue(newSafelist.contains("strong"));
    }

    @Test
    public void removeTags_RemoveTagsFromExistingSafelist_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.removeTags("a", "img");
        assertNotNull(newSafelist);
        assertFalse(newSafelist.contains("a"));
        assertFalse(newSafelist.contains("img"));
    }

    @Test
    public void addAttributes_AddAttributeToExistingTag_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.addAttributes("b", "style", "color: red;");
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("b"));
        assertEquals(1, newSafelist.getEnforcedAttributes("b").size());
    }

    @Test
    public void removeAttributes_RemoveAttributeFromExistingTag_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.removeAttributes("b", "style");
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("b"));
        assertEquals(0, newSafelist.getEnforcedAttributes("b").size());
    }

    @Test
    public void addEnforcedAttribute_AddEnforcedAttributeToExistingTag_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.addEnforcedAttribute("a", "alt", "image.png");
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("a"));
        assertEquals(1, newSafelist.getEnforcedAttributes("a").size());
    }

    @Test
    public void removeEnforcedAttribute_RemoveEnforcedAttributeFromExistingTag_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.removeEnforcedAttribute("a", "alt");
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("a"));
        assertEquals(0, newSafelist.getEnforcedAttributes("a").size());
    }

    @Test
    public void preserveRelativeLinks_PreserveOrDoNotPreserve_RelativeLinks_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.preserveRelativeLinks(true);
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("a"));
    }

    @Test
    public void addProtocols_AddProtocolToExistingTag_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.addProtocols("img", "src", "http://example.com");
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("img"));
        assertEquals(1, newSafelist.getEnforcedAttributes("img").size());
    }

    @Test
    public void removeProtocols_RemoveProtocolFromExistingTag_ReturnsNewSafelist() {
        Safelist safelist = Safelist.relaxed();
        Safelist newSafelist = safelist.removeProtocols("img", "src");
        assertNotNull(newSafelist);
        assertTrue(newSafelist.contains("img"));
        assertEquals(0, newSafelist.getEnforcedAttributes("img").size());
    }

    @Test
    public void isSafeTag_ReturnsTrueForSafeTags() {
        assertTrue(Safelist.basic().isSafeTag("a"));
        assertFalse(Safelist.relaxed().isSafeTag("script"));
    }

    @Test
    public void isSafeAttribute_ReturnsTrueForSafeAttributes() {
        Safelist safelist = Safelist.relaxed();
        assertNotNull(safelist);
        assertEquals(true, safelist.isSafeAttribute("img", new Element(), new Attribute()));
    }

}