package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void DocumentConstructorTest() {
        Document doc = new Document("http://example.com");
        assertNotNull(doc);
        assertEquals("http://example.com", doc.location());
    }

    @Test
    public void DocumentConstructorNullBaseUriTest() {
        Document doc = new Document(null);
    }

    @Test
    public void createShellTest() {
        Document doc = Document.createShell("http://example.com");
        assertNotNull(doc);
        assertEquals("http://example.com", doc.location());
    }

    @Test
    public void titleTest() {
        Document doc = new Document("http://example.com");
        doc.title("Test Title");
        assertEquals("Test Title", doc.title());
    }

    @Test
    public void createElementTest() {
        Document doc = new Document("http://example.com");
        Element el = doc.createElement("div");
        assertEquals("div", el.tagName());
    }

    @Test
    public void charsetTest() {
        Document doc = new Document("http://example.com");
        Charset charset = StandardCharsets.UTF_8;
        doc.charset(charset);
        assertEquals(charset, doc.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document doc = new Document("http://example.com");
        doc.updateMetaCharsetElement(false);
        assertFalse(doc.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document doc = new Document("http://example.com");
        Document clone = doc.clone();
        assertNotSame(doc, clone);
        assertEquals(doc.title(), clone.title());
    }

    @Test
    public void shallowCloneTest() {
        Document doc = new Document("http://example.com");
        Document clone = doc.shallowClone();
        assertNotSame(doc, clone);
        assertEquals(doc.title(), clone.title());
    }

    @Test
    public void formsTest() {
        Document doc = new Document("http://example.com");
        List<FormElement> forms = doc.forms();
        assertNotNull(forms);
    }

}