package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest {

    @Test
    public void testAddClass() {
        // Arrange
        String className = "test-class";
        Element element = new MyElement();

        // Act
        element.addClass(className);

        // Assert
        assertEquals(className, element.getClassName());
    }

    @Test
    public void testRemoveClass() {
        // Arrange
        String className = "test-class";
        Element element = new MyElement();
        element.removeClass(className);

        // Act
        assertNotEquals(className, element.getClassName());

        // Assert
        assertTrue(element.getClassName().isEmpty());
    }

    @Test
    public void testToggleClass() {
        // Arrange
        String className = "test-class";

        // Act
        Element element = new MyElement();
        element.toggleClass(className);

        // Assert
        assertEquals(className, element.getClassName());

        // Assert
        assertTrue(element.getClassName().isEmpty());
    }

    @Test
    public void testShouldIndent() {
        // Arrange
        Document.OutputSettings out = new Document.OutputSettings();

        // Act
        boolean indent = MyElement.shouldIndent(out);

        // Assert
        assertTrue(indent);
    }

    @Test
    public void testOuterHtmlHeadTail() {
        // Arrange
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        myElement.outerHtmlHead(accum, 1, out);

        // Act
        String tail = myElement.outerHtmlTail(accum, 2, out);

        // Assert
        assertEquals("My Element", tail);
    }

    @Test
    public void testClone() {
        // Arrange
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();

        // Act
        MyElement myElement = new MyElement().clone();

        // Assert
        assertTrue(myElement.getClassName().equals("My Element"));
        assertNotEquals(accum.toString(), myElement.getHtml());
    }

    @Test
    public void testRoot() {
        // Arrange
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();

        // Act
        MyElement myElement = new MyElement().root();

        // Assert
        assertTrue(myElement.getClassName().equals("My Element"));
        assertNotEquals(accum.toString(), myElement.getHtml());
    }

    @Test
    public void testTraverse() {
        // Arrange
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();

        // Act
        MyElement myElement = new MyElement().traverse(out);

        // Assert
        assertTrue(myElement.getClassName().equals("My Element"));
        assertNotEquals(accum.toString(), myElement.getHtml());
    }

    @Test
    public void testForEachNode() {
        // Arrange
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();

        // Act
        MyElement myElement = new MyElement().forEach(out);

        // Assert
        assertTrue(myElement.getClassName().equals("My Element"));
        assertNotEquals(accum.toString(), myElement.getHtml());
    }

    @Test
    public void testForEach() {
        // Arrange
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();

        // Act
        MyElement myElement = new MyElement().forEach(out);

        // Assert
        assertTrue(myElement.getClassName().equals("My Element"));
        assertNotEquals(accum.toString(), myElement.getHtml());
    }

    @Test
    public void testFilter() {
        // Arrange
        Document.OutputSettings out = new Document.OutputSettings();
        Appendable accum = new StringBuilder();

        // Act
        MyElement myElement = new MyElement().filter(out);

        // Assert
        assertTrue(myElement.getClassName().equals("My Element"));
        assertNotEquals(accum.toString(), myElement.getHtml());
    }

}