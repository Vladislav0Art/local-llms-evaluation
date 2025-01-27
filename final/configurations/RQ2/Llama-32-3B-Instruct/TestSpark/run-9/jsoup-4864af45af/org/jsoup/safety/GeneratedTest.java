package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.helper.Validate;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.junit.Test;

public class GeneratedTest {

    @Test
    public void none_SafeTags() {
        Safelist safeList = Safelist.none();
        assertTrue(safeList.isSafeTag("img"));
        assertFalse(safeList.isSafeTag("script"));
    }

    @Test
    public void simpleText_NoAttributes() {
        Safelist safeList = Safelist.simpleText();
        assertNull(safeList.getEnforcedAttributes("div"));
    }

    @Test
    public void basic_SimpleTagsAndAttributes() {
        Safelist safeList = Safelist.basic();
        assertEquals(new HashSet<>(Arrays.asList("img", "br", "p")), safeList.getEnforcedAttributes("body"));
    }

    @Test
    public void basicWithImages_RelativeLinksPreserved() {
        Safelist safeList = Safelist.basicWithImages();
        assertTrue(safeList.preserveRelativeLinks(true));
    }

    @Test
    public void relaxed_NoSpecificTagsOrProtocols() {
        Safelist safeList = Safelist.relaxed();
        assertTrue(safeList.isSafeTag("div"));
        assertFalse(safeList.isSafeTag("script"));
    }

    @Test
    public void basic_SimpleTagsAndAttributes_addTags() {
        Safelist safeList = Safelist.basic();
        safeList.addTags("strong", "b");
        assertEquals(new HashSet<>(Arrays.asList("img", "br", "p", "strong", "b")), safeList.getEnforcedAttributes("body"));
    }

    @Test
    public void basic_SimpleTagsAndAttributes_removeTags() {
        Safelist safeList = Safelist.basic();
        safeList.removeTags("strong");
        assertEquals(new HashSet<>(Arrays.asList("img", "br", "p")), safeList.getEnforcedAttributes("body"));
    }

    @Test
    public void basic_SimpleTagsAndAttributes_addImageTag() {
        Safelist safeList = Safelist.basic();
        safeList.addAttributes("img", new String[]{"src"});
        assertTrue(safeList.isSafeAttribute("img", null, new Attribute("", "", "")));
    }

    @Test
    public void basic_SimpleTagsAndAttributes_removeImageTag() {
        Safelist safeList = Safelist.basic();
        safeList.removeAttributes("img", new String[]{});
        assertFalse(safeList.isSafeAttribute("img", null, new Attribute("", "", "")));
    }

    @Test
    public void simpleText_NoAttributes_addEnforcedAttribute() {
        Safelist safeList = Safelist.simpleText();
        safeList.addEnforcedAttribute("a", "href", "");
        assertEquals(new HashSet<>(Arrays.asList("img", "br", "p")), safeList.getEnforcedAttributes("body"));
    }

    @Test
    public void basic_SimpleTagsAndAttributes_addProtocols() {
        Safelist safeList = Safelist.basic();
        safeList.addProtocols("a", new String[]{"href"});
        assertTrue(safeList.isSafeAttribute("a", null, new Attribute("", "", "")));
    }

    @Test
    public void basic_SimpleTagsAndAttributes_removeProtocols() {
        Safelist safeList = Safelist.basic();
        safeList.removeProtocols("a", new String[]{});
        assertFalse(safeList.isSafeAttribute("a", null, new Attribute("", "", "")));
    }

}