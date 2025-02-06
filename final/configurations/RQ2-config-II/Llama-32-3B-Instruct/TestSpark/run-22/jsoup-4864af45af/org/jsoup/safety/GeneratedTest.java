package org.jsoup.safety;

import org.jsoup.safety.Safelist;
import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void none() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag(""));
    }

    @Test
    public void simpleText() {
        Safelist safelist = Safelist.simpleText();
        assertFalse(safelist.isSafeAttribute("", null, null));
    }

    @Test
    public void basic() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void basicWithImages() {
        Safelist safelist = Safelist.basicWithImages();
        assertFalse(safelist.isSafeAttribute("", null, null));
    }

    @Test
    public void relaxed() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeAttribute("", null, null));
    }

    @Test
    public void copyConstructor() {
        Safelist safelist1 = new Safelist();
        Safelist safelist2 = new Safelist(safelist1);
        assertEquals(safelist1, safelist2);
    }

    @Test
    public void addTags() {
        Safelist safelist = Safelist.addTags("img");
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void removeTags() {
        Safelist safelist = Safelist.removeTags("img");
        assertFalse(safelist.isSafeTag("img"));
    }

    @Test
    public void addAttributes() {
        Safelist safelist = Safelist.addAttributes("img", "alt", "image");
        assertTrue(safelist.isSafeAttribute("", null, new Attribute("alt", "image")));
    }

    @Test
    public void removeAttributes() {
        Safelist safelist = Safelist.removeAttributes("img", "alt");
        assertFalse(safelist.isSafeAttribute("", null, new Attribute("alt", "")));
    }

    @Test
    public void addEnforcedAttribute() {
        Safelist safelist = Safelist.addEnforcedAttribute("img", "alt", "image");
        assertTrue(safelist.getEnforcedAttributes("img").containsKey("alt"));
    }

    @Test
    public void removeEnforcedAttribute() {
        Safelist safelist = Safelist.removeEnforcedAttribute("img", "alt");
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("alt"));
    }

    @Test
    public void preserveRelativeLinks() {
        Safelist safelist = Safelist.preserveRelativeLinks(true);
        assertTrue(safelist.isSafeTag(""));
    }

    @Test
    public void addProtocols() {
        Safelist safelist = Safelist.addProtocols("img", "src", "http://example.com");
        assertTrue(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void removeProtocols() {
        Safelist safelist = Safelist.removeProtocols("img", "src", new String[]{"http://example.com"});
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

}