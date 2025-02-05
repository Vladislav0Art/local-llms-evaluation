package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        Document doc = Document.createShell("https://www.example.com");
        assertNotNull(doc);
    }

    @Test
    public void locationTest() {
        Document doc = new Document("https://www.example.com");
        assertEquals("https://www.example.com", doc.location());
    }

    @Test
    public void documentTypeTest() {
        Document doc = new Document("https://www.example.com");
        assertNull(doc.documentType());
    }

    @Test
    public void titleTest() {
        Document doc = new Document("https://www.example.com");
        doc.title("Test Title");
        assertEquals("Test Title", doc.title());
    }

    @Test
    public void createElementTest() {
        Document doc = new Document("https://www.example.com");
        Element el = doc.createElement("p");
        assertNotNull(el);
    }

    @Test
    public void outerHtmlTest() {
        Document doc = new Document("https://www.example.com");
        String html = doc.outerHtml();
        assertNotNull(html);
    }

    @Test
    public void nodeNameTest() {
        Document doc = new Document("https://www.example.com");
        assertEquals("#document", doc.nodeName());
    }

    @Test
    public void charsetTest() {
        Document doc = new Document("https://www.example.com");
        Charset charset = Charset.forName("UTF-8");
        doc.charset(charset);
        assertEquals(charset, doc.charset());
    }

    @Test
    public void cloneTest() {
        Document doc = new Document("https://www.example.com");
        Document doc2 = doc.clone();
        assertNotNull(doc2);
        assertNotSame(doc, doc2);
    }

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("https://www.example.com");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        doc.outputSettings(outputSettings);
        assertEquals(outputSettings, doc.outputSettings());
    }

    @Test
    public void parseTest() {
        Document doc = new Document("https://www.example.com");
        Parser parser = Parser.htmlParser();
        doc.parser(parser);
        assertEquals(parser, doc.parser());
    }

    @Test
    public void expectFormEmptySelectorTest() {
        Document doc = new Document("https://www.example.com");
        doc.expectForm("");
    }

}