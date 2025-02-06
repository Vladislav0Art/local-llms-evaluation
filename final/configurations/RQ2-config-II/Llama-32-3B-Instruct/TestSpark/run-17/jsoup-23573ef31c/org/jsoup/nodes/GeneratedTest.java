package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    @Test
    public void createShellDocumentTest() {
        // Arrange and Act
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);

        // Assert
        assertNotNull(document);
    }

    @Test
    public void locationMethodTest() {
        // Arrange and Act
        Document document = new Document("http://example.com");

        // Assert
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void connectionMethodTest() {
        // Arrange and Act
        Connection connection = null;
        Document document = Document.createShell("http://example.com");
        Document result = document.connection(connection);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void titleSetterTest() {
        // Arrange and Act
        Document document = new Document("http://example.com");
        document.title("Hello World");

        // Assert
        assertEquals("Hello World", document.title());
    }

    @Test
    public void createElementMethodTest() {
        // Arrange and Act
        Element element = Document.createElement("div");
        Document document = new Document("http://example.com");
        Element result = document.createElement("p");

        // Assert
        assertEquals("p", result.nodeName());
    }

    @Test
    public void charsetSetterTest() {
        // Arrange and Act
        Document document = new Document("http://example.com");
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);

        // Assert
        assertEquals(Charset.forName("UTF-8"), document.charset());
    }

    @Test
    public void outputSettingsSetterTest() {
        // Arrange and Act
        Document document = new Document("http://example.com");
        OutputSettings outputSettings = new OutputSettings();
        Document result = document.outputSettings(outputSettings);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void quirksModeSetterTest() {
        // Arrange and Act
        Document document = new Document("http://example.com");
        QuirksMode quirksMode = QuirksMode.CRITICAL;
        Document result = document.quirksMode(quirksMode);

        // Assert
        assertEquals(QuirksMode.CRITICAL, result.quirksMode());
    }

    @Test
    public void parserSetterTest() {
        // Arrange and Act
        Document document = new Document("http://example.com");
        Parser parser = new Parser();
        Document result = document.parser(parser);

        // Assert
        assertNotNull(result);
    }

    @Test
    public void shallowCloneMethodTest() {
        // Arrange and Act
        Document document = new Document("http://example.com");
        Document shallowClone = document.shallowClone();

        // Assert
        assertNotNull(shallowClone);
        assertNotSame(document, shallowClone);
    }

}