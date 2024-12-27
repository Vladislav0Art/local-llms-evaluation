package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

public class GeneratedTest {

    @Mock
    private Tag tag;

    public ElementTest() {
        MockitoAnnotations.initMocks(this);
    }

    // Tag related tests

    @Test
    public void testCreateElementWithTag_ReturnsElementWithCorrectTag() {
        Document doc = new Document();
        Element element = Element.create(tag);
        assertEquals(tag, element.tag());
    }

    @Test
    public void testGetTag_WhenElementIsNotCreated_ReturnsNull() {
        Document doc = new Document();
        assert null == Element.create(tag).tag();
    }

    @Test
    public void testCreateElementWithAttributes_ReturnsElementWithCorrectAttributes() {
        Document doc = new Document();
        Element element = Element.create(tag, "key", "value");
        assertEquals("value", element.attr("key"));
    }

    @Test
    public void testGetAttribute_WhenElementHasAttr_ReturnsValue() {
        Document doc = new Document();
        Element element = Element.create(tag, null, "value");
        assertEquals("value", element.attr(null));
    }

    @Test
    public void testHasAttr_WhenElementHasAttr_ReturnsTrue() {
        Document doc = new Document();
        Element element = Element.create(tag, "key", "value");
        assertTrue(element.hasAttr("key"));
    }

    @Test
    public void testRemoveAttr_WhenElementHasAttr_RemovesAttr() {
        Document doc = new Document();
        Element element = Element.create(tag, "key1", "value1");
        element.removeAttr("key1");
        assertFalse(element.hasAttr("key1"));
    }

    @Test
    public void testCreateElementWithText_ReturnsElementWithCorrectText() {
        Document doc = new Document();
        Element element = Element.create(tag, null, "text");
        assertEquals("text", element.text());
    }

    @Test
    public void testGetText_WhenElementHasText_ReturnsValue() {
        Document doc = new Document();
        Element element = Element.create(tag, null, "text");
        assertEquals("text", element.text());
    }

    @Test
    public void testHasText_WhenElementHasText_ReturnsTrue() {
        Document doc = new Document();
        Element element = Element.create(tag, null, "text");
        assertTrue(element.hasText());
    }

    @Test
    public void testGetText_WhenElementDoesNotHaveText_ReturnsEmptyString() {
        Document doc = new Document();
        Element element = Element.create(tag, null, null);
        assertEquals("", element.text());
    }

    @Test
    public void testCreateElementWithText_ReturnsElementWithCorrectAttributesAndText() {
        Document doc = new Document();
        Element element = Element.create(tag, "key", "text");
        assertEquals("text", element.attr("key"));
    }

    @Test
    public void testGetHtml_WhenElementHasText_ReturnsHtmlString() {
        Document doc = new Document();
        Element element = Element.create(tag, null, "text");
        assertEquals("<tag><text></text></tag>", element.html().toString());
    }

    @Test
    public void testCreateElementWithoutText_ReturnsElementWithCorrectAttributesAndEmptyText() {
        Document doc = new Document();
        Element element = Element.create(tag, "key", "");
        assertEquals("", element.attr("key"));
    }

    @Test
    public void testGetHtml_WhenElementDoesNotHaveText_ReturnsHtmlString() {
        Document doc = new Document();
        Element element = Element.create(tag, null, null);
        assertEquals("<tag></tag>", element.html().toString());
    }

}