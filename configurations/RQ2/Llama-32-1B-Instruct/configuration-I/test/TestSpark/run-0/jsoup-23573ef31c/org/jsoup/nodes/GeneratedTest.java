package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void createShell() {
        // Arrange
        String baseUri = "https://example.com";

        // Act
        Document document = Document.createShell(baseUri);

        // Assert
        assertNotNull(document);
    }

    @Test
    public void location() {
        // Arrange
        String baseUri = "https://example.com";
        Element element = new Element("html");
        element.attr("base", baseUri);

        // Act
        Document document = new Document(element, null, null);
        String location = document.location().toString();

        // Assert
        assertEquals(baseUri + "/", location);
    }

    @Test
    public void text() {
        // Arrange
        String baseUri = "https://example.com";
        Element element = new Element("html");
        element.attr("base", baseUri);

        // Act
        document = new Document(element, null, null);
        String text = document.text();

        // Assert
        assertEquals("Hello World", text);
    }

    @Test
    public void nodeName() {
        // Arrange
        String baseUri = "https://example.com";
        Element element = new Element("html");
        element.attr("base", baseUri);

        // Act
        Document document = new Document(element, null, null);
        String nodeName = document.nodeName();

        // Assert
        assertEquals("html", nodeName);
    }

    @Test
    public void updateMetaCharsetElement() {
        // Arrange
        String baseUri = "https://example.com";
        Element element = new Element("html");
        element.attr("base", baseUri);

        // Act
        boolean updated = document.updateMetaCharsetElement();

        // Assert
        assertTrue(updated);
    }

    @Test
    public void shallowClone() {
        // Arrange
        String baseUri = "https://example.com";
        Document document = new Document(new Element("html"), null, null);

        // Act
        Document clonedDocument = document.shallowClone();

        // Assert
        assertNotNull(clonedDocument);
    }

    @Test
    public void outputSettings() {
        // Arrange
        String baseUri = "https://example.com";
        Document document = new Document(new Element("html"), null, null);

        // Act
        OutputSettings outputSettings = document.outputSettings(null);

        // Assert
        assertNotNull(outputSettings);
    }

    @Test
    public void outputSettingsSetting() {
        // Arrange
        String baseUri = "https://example.com";
        Document document = new Document(new Element("html"), null, null);

        // Act
        OutputSettings outputSettings = document.outputSettings(null).outputSettings();

        // Assert
        assertNotNull(outputSettings);
    }

    @Test
    public void quirksMode() {
        // Arrange
        String baseUri = "https://example.com";
        Document document = new Document(new Element("html"), null, null);

        // Act
        QuirksMode quirksMode = document.quirksMode(null).quirksMode();

        // Assert
        assertNotNull(quirksMode);
    }

    @Test
    public void quirksModeSetting() {
        // Arrange
        String baseUri = "https://example.com";
        Document document = new Document(new Element("html"), null, null);

        // Act
        QuirksMode quirksMode = document.quirksMode(null).quirksMode().quirksMode();

        // Assert
        assertNotNull(quirksMode);
    }

    @Test
    public void parser() {
        // Arrange
        String baseUri = "https://example.com";
        Document document = new Document(new Element("html"), null, null);

        // Act
        Parser parser = document.parser(null).parser();

        // Assert
        assertNotNull(parser);
    }

}