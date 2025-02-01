package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.Connection;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.junit.Test;
import org.mockito.Mockito;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class GeneratedTest {

    @Test
    public void DocumentDefaultConstructorTest() {
        Document doc = new Document("http://example.com");
        assertEquals("http://example.com", doc.location());
    }

    @Test
    public void DocumentCreateShellTest() {
        Document doc = Document.createShell("http://example.com");
        assertEquals("http://example.com", doc.location());
    }

    @Test
    public void DocumentConnectionTest() {
        Document doc = new Document("http://example.com");
        Connection connectionMock = Mockito.mock(Connection.class);
        doc.connection(connectionMock);
        assertEquals(connectionMock, doc.connection());
    }

    @Test
    public void DocumentCharsetTest() {
        Document doc = new Document("http://example.com");
        doc.charset(StandardCharsets.UTF_8);
        assertEquals(StandardCharsets.UTF_8, doc.charset());
    }

    @Test
    public void DocumentUpdateMetaCharsetElementTest() {
        Document doc = new Document("http://example.com");
        doc.updateMetaCharsetElement(true);
        assertEquals(true, doc.updateMetaCharsetElement());
    }

    @Test
    public void DocumentCloneTest() {
        Document doc = new Document("http://example.com");
        Document clone = doc.clone();
        assertNotSame(doc, clone);
        assertEquals(doc.location(), clone.location());
    }

    @Test
    public void DocumentShallowCloneTest() {
        Document doc = new Document("http://example.com");
        Document outer = doc.shallowClone();
        assertNotSame(doc, outer);
        assertEquals(doc.location(), outer.location());
    }

    @Test
    public void DocumentParserTest() {
        Document doc = new Document("http://example.com");
        Parser parserMock = Mockito.mock(Parser.class);
        doc.parser(parserMock);
        assertEquals(parserMock, doc.parser());
    }

    @Test
    public void DocumentTitleTest() {
        Document doc = Document.createShell("http://example.com");
        doc.title("Document Title");
        assertEquals("Document Title", doc.title());
    }

    @Test
    public void DocumentHeadTest() {
        Document doc = Document.createShell("http://example.com");
        Element head = doc.head();
        assertEquals("head", head.tagName());
    }

    @Test
    public void DocumentBodyTest() {
        Document doc = Document.createShell("http://example.com");
        Element body = doc.body();
        assertEquals("body", body.tagName());
    }

    @Test
    public void locationTest() {
        Document document = new Document("http://localhost");
        assertEquals("http://localhost", document.location());
    }

}