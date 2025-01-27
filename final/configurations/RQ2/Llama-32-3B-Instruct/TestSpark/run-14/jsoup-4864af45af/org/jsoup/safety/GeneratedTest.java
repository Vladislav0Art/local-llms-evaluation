package org.jsoup.safety;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void none_NoTags_ReturnsNone() {
        Safelist result = Safelist.none();
        assertTrue(result.isEmpty());
    }

    @Test
    public void simpleText_SimpleTags_ReturnsSimpleText() {
        Safelist result = Safelist.simpleText();
        assertTrue(result.getSafeTags().contains("img"));
        assertTrue(result.getSafeTags().contains("br"));
    }

    @Test
    public void basic_NoTags_ReturnsBasic() {
        Safelist result = Safelist.basic();
        assertTrue(result.isEmpty());
    }

    @Test
    public void basicWithImages_SimpleTags_ReturnsBasicWithImages() {
        Safelist result = Safelist.basicWithImages();
        assertTrue(result.getSafeTags().contains("img"));
        assertTrue(result.getSafeTags().contains("br"));
    }

    @Test
    public void relaxed_NoTags_ReturnsRelaxed() {
        Safelist result = Safelist.relaxed();
        assertTrue(result.isEmpty());
    }

    @Test
    public void addTags_AddTag_ReturnsAddTag() {
        Safelist result = Safelist.addTags("b");
        assertTrue(result.getSafeTags().contains("b"));
    }

    @Test
    public void removeTags_RemoveTag_ReturnsRemoveTag() {
        Safelist result = Safelist.removeTags("b");
        assertFalse(result.getSafeTags().contains("b"));
    }

    @Test
    public void addAttributes_AddAttribute_ReturnsAddAttribute() {
        Safelist result = Safelist.addAttributes("img", "alt", "image.jpg");
        assertTrue(result.getEnforcedAttributes("img").contains("alt=\"image.jpg\""));
    }

    @Test
    public void removeAttributes_RemoveAttribute_ReturnsRemoveAttribute() {
        Safelist result = Safelist.removeAttributes("img", "alt");
        assertFalse(result.getEnforcedAttributes("img").contains("alt"));
    }

    @Test
    public void preserveRelativeLinks_PreserveLink_ReturnsPreserveLink() {
        Safelist result = new Safelist().preserveRelativeLinks(true);
        assertTrue(result.preservesRelativeLinks());
    }

    @Test
    public void addProtocols_AddProtocol_ReturnsAddProtocol() {
        Safelist result = Safelist.addProtocols("img", "src", "http://example.com");
        assertTrue(Arrays.asList(result.getEnforcedAttributes("img").get("src")).contains("http://example.com"));
    }

    @Test
    public void removeProtocols_RemoveProtocol_ReturnsRemoveProtocol() {
        Safelist result = new Safelist().removeProtocols("img", "src", Arrays.asList("http://example.com"));
        assertFalse(result.getEnforcedAttributes("img").get("src").contains("http://example.com"));
    }

}