package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Tag;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.Elements;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void testElementConstructor() {
        String tagName = "div";
        Element element = new Element(tagName);
        assertNotNull(element);
        assertEquals(tagName, element.tagName());
    }

    @Test
    public void testElementConstructorWithTag() {
        String tagName = "div";
        Tag tag = Tag.valueOf(tagName);
        Element element = new Element(tag);
        assertNotNull(element);
        assertEquals(tagName, element.tagName());
    }

    @Test
    public void testHasChildNodes() {
        Element element = new Element("div");
        assertFalse(element.hasChildNodes());
        element.appendChild(new Element("p"));
        assertTrue(element.hasChildNodes());
    }

    @Test
    public void testEnsureChildNodes() {
        Element element = new Element("div");
        assertTrue(element.ensureChildNodes().isEmpty());
        element.appendChild(new Element("p"));
        assertFalse(element.ensureChildNodes().isEmpty());
    }

}