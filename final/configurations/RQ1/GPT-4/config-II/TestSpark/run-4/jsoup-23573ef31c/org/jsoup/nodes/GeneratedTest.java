package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.helper.DataUtil;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void DocumentBaseUriTest() {
        Document document = new Document("http://test.com");
        assertEquals("http://test.com", document.baseUri());
    }

    @Test
    public void createShellBaseUriTest() {
        Document document = Document.createShell("http://test.com");
        assertEquals("http://test.com", document.baseUri());
    }

    @Test
    public void locationTest() {
        Document document = new Document("");
        assertEquals("", document.location());
    }

    @Test
    public void headTest() {
        Document document = new Document("");
        Element head = document.head();
        assertTrue(head.is("head"));
    }

    @Test
    public void bodyTest() {
        Document document = new Document("");
        Element body = document.body();
        assertTrue(body.is("body"));
    }

    @Test
    public void titleTest() {
        Document document = new Document("");
        document.title("Test title");
        assertEquals("Test title", document.title());
    }

    @Test
    public void outerHtmlTest() {
        Document document = new Document("");
        assertNotNull(document.outerHtml());
    }

    @Test
    public void textTest() {
        Document document = new Document("");
        document.text("Test text");
        assertEquals("Test text", document.text());
    }

    @Test
    public void charsetTest() {
        Document document = new Document("");
        document.charset(Charset.forName("UTF-8"));
        assertEquals(Charset.forName("UTF-8"), document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("");
        document.updateMetaCharsetElement(true);
        assertEquals(true, document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("");
        Document clonedDocument = document.clone();
        assertEquals(clonedDocument.outerHtml(), document.outerHtml());
    }

    @Test
    public void parserTest() {
        Document document = new Document("");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        assertEquals(parser, document.parser());
    }

}