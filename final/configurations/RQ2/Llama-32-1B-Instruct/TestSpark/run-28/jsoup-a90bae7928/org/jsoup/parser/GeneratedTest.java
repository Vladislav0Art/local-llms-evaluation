package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedTest {

    private Document expectedDocument = new Document();

    @Test
    public void testInitializeParse() {
        // Arrange
        String baseUri = "";
        Parser parser = null;
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        builder.initialiseParse(new java.io.StringReader(baseUri), defaultSettings, parser);

        // Assert
        assertEquals(expectedDocument, builder.parse(new java.io.StringReader(baseUri)).getDoc());
    }

    @Test
    public void testProcess() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();
        Parser parser = new DefaultParser();

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        boolean result = builder.process(new Token());

        // Assert
        assertEquals(false, result);
    }

    @Test
    public void testInsertNode() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(baseUri).getDoc();

        // Assert
        assertEquals(1, document.getElementsByTagName("tag").length);
    }

    @Test
    public void testInsertNodeWithToken() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(baseUri).getDoc();

        // Assert
        assertEquals(1, document.getElementsByTagName("tag").length);
    }

    @Test
    public void testInsertToken() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(baseUri).getDoc();

        // Assert
        assertEquals(1, document.getElementsByTagName("tag").length);
    }

    @Test
    public void testInsertCommentToken() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(baseUri).getDoc();

        // Assert
        assertEquals(1, document.getElementsByTagName("tag").length);
    }

    @Test
    public void testInsertCharacterToken() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(baseUri).getDoc();

        // Assert
        assertEquals(1, document.getElementsByTagName("tag").length);
    }

    @Test
    public void testInsertDoctype() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(baseUri).getDoc();

        // Assert
        assertEquals(1, document.getElementsByTagName("tag").length);
    }

    @Test
    public void testInsertEndTag() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(baseUri).getDoc();

        // Assert
        assertEquals(1, document.getElementsByTagName("tag").length);
    }

    @Test
    public void testPopStackClose() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(baseUri).getDoc();

        // Assert
        assertEquals(1, document.getElementsByTagName("tag").length);
    }

    @Test
    public void testInsertFragment() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();
        Parser parser = new DefaultParser();
        DocumentFragment fragment = builder.parseFragment(new java.io.StringReader(""));
        expectedDocument.appendChild(fragment);

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        document = builder.parse(baseUri).getDoc();

        // Assert
        assertEquals(1, document.getElementsByTagName("tag").length);
    }

    @Test
    public void testInsertFragmentWithContext() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();
        Parser parser = new DefaultParser();
        DocumentFragment fragment = builder.parseFragment(new java.io.StringReader(""));
        expectedDocument.appendChild(fragment);

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(baseUri).getDoc();

        // Assert
        assertEquals(1, document.getElementsByTagName("tag").length);
    }

    @Test
    public void testParseFragment() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();
        Parser parser = new DefaultParser();
        DocumentFragment fragment = builder.parseFragment(new java.io.StringReader(""));
        expectedDocument.appendChild(fragment);

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        document = builder.parse(baseUri).getDoc();

        // Assert
        assertEquals(1, document.getElementsByTagName("tag").length);
    }

    @Test
    public void testParseFragmentWithContext() {
        // Arrange
        String baseUri = "";
        ParseSettings defaultSettings = new ParseSettings();
        Parser parser = new DefaultParser();
        DocumentFragment fragment = builder.parseFragment(new java.io.StringReader(""));
        expectedDocument.appendChild(fragment);

        // Act
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse(baseUri).getDoc();

        // Assert
        assertEquals(1, document.getElementsByTagName("tag").length);
    }

}