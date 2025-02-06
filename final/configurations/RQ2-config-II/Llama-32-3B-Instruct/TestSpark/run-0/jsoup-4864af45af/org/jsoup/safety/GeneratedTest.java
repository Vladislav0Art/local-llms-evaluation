package org.jsoup.safety;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GeneratedTest {

    @Test
    public void none_Safelist() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist instanceof Safelist);
    }

    @Test
    public void simpleText_NoFilterTest() {
        Safelist safelist = Safelist.simpleText();
        assertFalse(safelist.isSafeTag("script"));
    }

    @Test
    public void basic_SimpleTagsTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void basic_ImageTagTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeAttribute("img", new Element(), new Attribute()));
    }

    @Test
    public void basic_ATagTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeAttribute("a", new Element(), new Attribute()));
    }

    @Test
    public void basic_InvalidTagsTest() {
        Safelist safelist = Safelist.basic();
        assertFalse(safelist.isSafeTag("script"));
        assertFalse(safelist.isSafeTag("iframe"));
    }

    @Test
    public void none_SafeAttributeTest() {
        Safelist safelist = Safelist.none();
        assertTrue(safelist.getEnforcedAttributes("img").isEmpty());
    }

    @Test
    public void simpleText_SimpleTagsTest() {
        Safelist safelist = Safelist.simpleText();
        assertEquals(1, safelist.getEnforcedAttributes("img").size());
        assertEquals(2, safelist.getEnforcedAttributes("a").size());
    }

    @Test
    public void basic_WithImages_BasicTagsTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("img"));
        assertTrue(safelist.isSafeTag("a"));
    }

    @Test
    public void relaxed_SimpleTagsTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("script"));
        assertTrue(safelist.isSafeTag("iframe"));
    }

}