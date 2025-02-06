package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GeneratedTest {

    @Test
    public void none_SafeTag() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void simpleText_SimpleTextSafe() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("p"));
        assertFalse(safelist.isSafeTag("h1"));
    }

    @Test
    public void basic_BasicTagsSafe() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("b"));
    }

    @Test
    public void relaxed_RelaxedTagsSafe() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("div"));
        assertTrue(safelist.isSafeTag("span"));
    }

    @Test
    public void addTags_addTags() {
        Safelist safelist = Safelist.simpleText().addTags("strong", "em");
        assertTrue(safelist.isSafeTag("strong"));
        assertTrue(safelist.isSafeTag("em"));
    }

    @Test
    public void removeTags_removeTags() {
        Safelist safelist = Safelist.simpleText().removeTags("img", "script");
        assertFalse(safelist.isSafeTag("img"));
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void addAttributes_addAttributes() {
        Safelist safelist = Safelist.basic().addAttributes("img", "alt", "image.jpg");
        assertTrue(safelist.getEnforcedAttributes("img").containsKey("alt"));
        assertTrue(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

    @Test
    public void removeAttributes_removeAttributes() {
        Safelist safelist = Safelist.basic().removeAttributes("img", "alt");
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("alt"));
    }

    @Test
    public void addEnforcedAttribute_addEnforcedAttribute() {
        Safelist safelist = Safelist.relaxed().addEnforcedAttribute("div", "data-id", "12345");
        assertTrue(safelist.getEnforcedAttributes("div").containsKey("data-id"));
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("data-id"));
    }

    @Test
    public void removeEnforcedAttribute_removeEnforcedAttribute() {
        Safelist safelist = Safelist.relaxed().removeEnforcedAttribute("div", "data-id");
        assertFalse(safelist.getEnforcedAttributes("div").containsKey("data-id"));
    }

    @Test
    public void preserveRelativeLinks_preserveRelativeLinks_true() {
        Safelist safelist = Safelist.preserveRelativeLinks(true).addProtocols("a", "hreflang", "en-US");
        assertTrue(safelist.getEnforcedAttributes("a").containsKey("hreflang"));
    }

    @Test
    public void preserveRelativeLinks_preserveRelativeLinks_false() {
        Safelist safelist = Safelist.preserveRelativeLinks(false).addProtocols("img", "src", "image.jpg");
        assertFalse(safelist.getEnforcedAttributes("img").containsKey("src"));
    }

}