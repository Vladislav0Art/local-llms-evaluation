package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.junit.Before;
import org.junit.Test;

public class GeneratedTest {

    private Element element;

    @Before
    public void setUp() {
        element = new Element("tag");
    }

    @Test
    public void testHasChildNodes() {
        assertFalse(element.hasChildNodes());
    }

    @Test
    public void testEnsureChildNodes() {
        assertNotNull(element.ensureChildNodes());
    }

    @Test
    public void testHasAttributes() {
        assertFalse(element.hasAttributes());
    }

    @Test
    public void testAttributes() {
        assertNotNull(element.attributes());
    }

    @Test
    public void testBaseUri() {
        assertNotNull(element.baseUri());
    }

    @Test
    public void testDoSetBaseUri() {
        element.doSetBaseUri("uri");
    }

    @Test
    public void testChildNodeSize() {
        assertEquals(0, element.childNodeSize());
    }

    @Test
    public void testNodeName() {
        assertEquals("tag", element.nodeName());
    }

    @Test
    public void testTagName() {
        assertEquals("tag", element.tagName());
    }

    @Test
    public void testNormalName() {
        assertEquals("tag", element.normalName());
    }

    @Test
    public void testTagName_withTag() {
        element.tagName("newTag");
        assertEquals("newTag", element.tagName());
    }

}