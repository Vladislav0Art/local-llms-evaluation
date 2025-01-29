package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    private Document document = new Document();

    @Test
    public void testText() {
        assertEquals("Hello, World!", document.text("Hello, World!"));
    }

    @Test
    public void testWholeText() {
        assertEquals("", document.wholeText());
        assertEquals("<script>alert('Hello')</script>", document.wholeOwnText());
    }

    @Test
    public void testOwnText() {
        assertTrue(document.ownText().contains("World"));
        assertFalse(document.ownText().contains("Hello"));
    }

    @Test
    public void testData() {
        assertEquals("", document.data());
        assertEquals("test", document.data("test"));
    }

    @Test
    public void testClassName() {
        assertTrue(document.classNames().contains("test"));
        assertTrue(document.classNames().contains("other"));
    }

    @Test
    public void testAddClass() {
        Element element = document.addClass("other");
        assertEquals("other", element.className());
        assertEquals("", element.val());
        assertEquals(null, element.html(""));
    }

    @Test
    public void testRemoveClass() {
        Element element = document.removeClass("test");
        assertEquals("test", element.className());
        assertEquals("", element.val());
        assertEquals(null, element.html(""));
    }

    @Test
    public void testToggleClass() {
        Element element = document.toggleClass("other");
        assertEquals("other", element.className());
        assertEquals("test", element.className());
        assertEquals("", element.val());
        assertEquals(null, element.html(""));
    }

    @Test
    public void testShouldIndent() {
        assertTrue(document.shouldIndent(new Document.OutputSettings()));
        assertFalse(document.shouldIndent(new Document.OutputSettings(true)));
    }

    @Test
    public void testOuterHtmlHead() {
        Element head = document.outerHtmlHead(document.root(), 1, new Document.OutputSettings());
        assertEquals("<head>\n", document.html(head));
    }

    @Test
    public void testOuterHtmlTail() {
        Element tail = document.outerHtmlTail(document.root(), 0, new Document.OutputSettings());
        assertEquals("", tail.html());
    }

}