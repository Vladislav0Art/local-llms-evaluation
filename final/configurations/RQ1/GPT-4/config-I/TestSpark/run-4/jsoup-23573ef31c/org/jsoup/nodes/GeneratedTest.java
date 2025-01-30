package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.XmlDeclaration;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void DocumentConstructorTest() {
        Document document = new Document("https://www.google.com");
        assertEquals("https://www.google.com", document.location());
        assertEquals(StandardCharsets.UTF_8, document.outputSettings().charset());
    }

    @Test
    public void createShellTest() {
        Document document = Document.createShell("https://www.google.com");
        assertNotNull(document.selectFirst("html"));
        assertNotNull(document.selectFirst("head"));
        assertNotNull(document.selectFirst("body"));
    }

    @Test
    public void connectionTest() throws IOException {
        Document document = Jsoup.connect("https://www.google.com").get();
        assertNotNull(document.connection());
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("https://www.google.com");
        Node node = new DocumentType("html", "publicId", "sysId");
        document.appendChild(node);
        assertEquals(node, document.documentType());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("https://www.google.com");
        Element element = document.createElement("div");
        assertEquals("div", element.tagName());
    }

    @Test
    public void titleSettingTest() {
        Document document = new Document("https://www.google.com");
        document.title("New Title");
        assertEquals("New Title", document.title());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("https://www.google.com");
        Document cloned = document.clone();
        assertEquals(document.getClass(), cloned.getClass());
    }

    @Test
    public void shallowCloneTest() {
        Document document = new Document("https://www.google.com");
        Document shallowCloned = document.shallowClone();
        assertEquals(document.getClass(), shallowCloned.getClass());
    }

    @Test
    public void parserTest() {
        Document document = new Document("https://www.google.com");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

}