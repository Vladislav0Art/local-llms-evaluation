package org.jsoup.safety;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.safety.Safelist;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    private static final String ALL = "all";
    private static final String TEST_TAG = "a";
    private static final String TEST_ATTR = "href";
    private static final String TEST_PROTOCOL = "http";

    @Test
    public void noneTest() {
        Safelist safelist = Safelist.none();
        assertEquals(0, safelist.tagNames.size());
    }

    @Test
    public void simpleTextTest() {
        Safelist safelist = Safelist.simpleText();
        assertTrue(safelist.isSafeTag("b"));
        assertTrue(safelist.isSafeTag("i"));
        assertTrue(safelist.isSafeTag("em"));
        assertTrue(safelist.isSafeTag("strong"));
        assertTrue(safelist.isSafeTag("u"));
    }

    @Test
    public void basicTest() {
        Safelist safelist = Safelist.basic();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("blockquote"));
    }

    @Test
    public void basicWithImagesTest() {
        Safelist safelist = Safelist.basicWithImages();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("blockquote"));
        assertTrue(safelist.isSafeTag("img"));
    }

    @Test
    public void relaxedTest() {
        Safelist safelist = Safelist.relaxed();
        assertTrue(safelist.isSafeTag("a"));
        assertTrue(safelist.isSafeTag("p"));
        assertTrue(safelist.isSafeTag("blockquote"));
        assertTrue(safelist.isSafeTag("div"));
    }

    @Test
    public void testAddTags() {
        Safelist safelist = Safelist.none();
        safelist.addTags(TEST_TAG, "p");

        assertTrue(safelist.tagNames.contains(TEST_TAG));
    }

    @Test
    public void testRemoveTags() {
        Safelist safelist = Safelist.basic();
        safelist.removeTags(TEST_TAG, "p");

        assertTrue(!safelist.tagNames.contains(TEST_TAG));
    }

    @Test
    public void testAddAttributes() {
        Safelist safelist = Safelist.none();
        safelist.addAttributes(TEST_TAG, TEST_ATTR, "class");

        assertTrue(safelist.attributes.get(TEST_TAG).contains(TEST_ATTR));
    }

    @Test
    public void testRemoveAttributes() {
        Safelist safelist = Safelist.basic();
        safelist.removeAttributes(TEST_TAG, TEST_ATTR, "class");

        assertTrue(!safelist.attributes.get(TEST_TAG).contains(TEST_ATTR));
    }

    @Test
    public void testAddEnforcedAttribute() {
        Safelist safelist = Safelist.none();
        safelist.addEnforcedAttribute(TEST_TAG, TEST_ATTR, TEST_PROTOCOL);

        Map<String, String> attrs = safelist.getEnforcedAttributes(TEST_TAG);
        assertEquals(TEST_PROTOCOL, attrs.get(TEST_ATTR));
    }

    @Test
    public void testRemoveEnforcedAttribute() {
        Safelist safelist = Safelist.basic();
        safelist.removeEnforcedAttribute(TEST_TAG, TEST_ATTR);

        Map<String, String> attrs = safelist.getEnforcedAttributes(TEST_TAG);
        assertTrue(attrs.isEmpty());
    }

    @Test
    public void testAddProtocols() {
        Safelist safelist = Safelist.none();
        safelist.addProtocols(TEST_TAG, TEST_ATTR, TEST_PROTOCOL);

        assertTrue(safelist.protocols.get(TEST_TAG).containsKey(TEST_ATTR));
        assertTrue(safelist.protocols.get(TEST_TAG).get(TEST_ATTR).contains(TEST_PROTOCOL));
    }

    @Test
    public void testRemoveProtocols() {
        Safelist safelist = Safelist.relaxed();
        safelist.removeProtocols(TEST_TAG, TEST_ATTR, TEST_PROTOCOL);

        assertTrue(!safelist.protocols.get(TEST_TAG).get(TEST_ATTR).contains(TEST_PROTOCOL));
    }

}