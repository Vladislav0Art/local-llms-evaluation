package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testText() {
        // Test with empty string
        String text = "";
        assertEquals("", customElement.text(text));

        // Test with non-empty string
        text = "Hello";
        assertEquals("Hello", customElement.text(text));
    }

    @Test
    public void testWholeText() {
        // Test with empty string
        String wholeText = "";
        assertEquals("", customElement.wholeText(wholeText));

        // Test with non-empty string
        wholeText = "Hello World";
        assertEquals("Hello World", customElement.wholeText(wholeText));
    }

    @Test
    public void testWholeOwnText() {
        // Test with empty string
        String wholeOwnText = "";
        assertEquals("", customElement.wholeOwnText(wholeOwnText));

        // Test with non-empty string
        wholeOwnText = "Hello World";
        assertEquals("Hello World", customElement.wholeOwnText(wholeOwnText));
    }

    @Test
    public void testOwnText() {
        // Test with empty string
        String ownText = "";
        assertEquals("", customElement.ownText(ownText));

        // Test with non-empty string
        ownText = "Hello";
        assertEquals("Hello", customElement.ownText(ownText));
    }

    @Test
    public void testData() {
        // Test with empty data
        String data = "";
        assertEquals("", customElement.data(data));

        // Test with non-empty data
        data = "Hello World";
        assertEquals("Hello World", customElement.data(data));
    }

    @Test
    public void testClassName() {
        // Test with empty class name
        String classNames = "";
        assertEquals("", customElement.classNames(classNames));

        // Test with non-empty class name
        classNames = "hello";
        assertEquals("hello", customElement.classNames(classNames));
    }

    @Test
    public void testAddClass() {
        // Test with no class name
        String addClass = "";
        assertNotEquals(addClass, customElement.addClass(addClass));

        // Test with non-empty class name
        addClass = "hello";
        assertEquals("hello", customElement.addClass(addClass));
    }

    @Test
    public void testRemoveClass() {
        // Test with no class name
        String removeClass = "";
        assertEquals("", customElement.removeClass(removeClass));

        // Test with non-empty class name
        removeClass = "hello";
        assertEquals("hello", customElement.removeClass(removeClass));
    }

    @Test
    public void testToggleClass() {
        // Test with no class name
        String toggleClass = "";
        assertEquals("", customElement.toggleClass(toggleClass));

        // Test with non-empty class name
        toggleClass = "hello";
        assertEquals("hello", customElement.toggleClass(toggleClass));
    }

    @Test
    public void testVal() {
        // Test with empty value
        String val = "";
        assertEquals("", customElement.val(val));

        // Test with non-empty value
        val = "Hello World";
        assertEquals("Hello World", customElement.val(val));
    }

    @Test
    public void testShallowClone() {
        // Create a sample document
        Document doc = new Document();
        doc.addTag(new Tag("div", "Hello World"));

        // Clone the document
        CustomElement clone = (CustomElement) doc.shallowClone();

        // Check if the cloned element is identical to the original element
        assertEquals(doc, clone);
    }

    @Test
    public void testOuterHtmlHead() {
        // Create a sample document
        Document doc = new Document();
        doc.addTag(new Tag("div", "Hello World"));

        // Add outer HTML head
        doc.outerHtmlHead(null, 0, null);

        // Check if the head element is generated correctly
        assertEquals(doc, doc.outerHtmlTail(doc.outerHtmlTail(doc.outerHtmlTail(doc.outerHtmlHead(null, 0, null))));
    }

}