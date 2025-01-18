package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void documentConstructorTest() {
        Document document = new Document("http://test.url");
        assertNotNull(document);
    }

    @Test
    public void createShellTest() {
        Document shell = Document.createShell("http://test.url");
        assertNotNull(shell);
    }

    @Test
    public void locationTest() {
        Document document = new Document("http://test.url");
        assertEquals("http://test.url", document.location());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("http://test.url");
        Connection connection = document.connection();
        assertNotNull(connection);
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("http://test.url");
        assertNull(document.documentType());
    }

    @Test
    public void headElementTest() {
        Document document = new Document("http://test.url");
        Element head = document.head();
        assertNotNull(head);
    }

    @Test
    public void bodyElementTest() {
        Document document = new Document("http://test.url");
        Element body = document.body();
        assertNotNull(body);
    }

    @Test
    public void formsTest() {
        Document document = new Document("http://test.url");
        List<FormElement> forms = document.forms();
        assertTrue(forms.isEmpty());
    }

    @Test
    public void documentTitleTest() {
        Document document = new Document("http://test.url");
        document.title("Test Title");
        assertEquals("Test Title", document.title());
    }

    @Test
    public void createElementTest() {
        Document document = new Document("http://test.url");
        Element element = document.createElement("div");
        assertEquals("div", element.tagName());
    }

    @Test
    public void outerHtmlTest() {
        Document document = new Document("http://test.url");
        String outerHtml = document.outerHtml();
        assertNotNull(outerHtml);
    }

    @Test
    public void textTest() {
        Document document = new Document("http://test.url");
        document.text("Test Text");
        assertEquals("Test Text", document.text());
    }

    @Test
    public void nodeNameTest() {
        Document document = new Document("http://test.url");
        assertEquals("#document", document.nodeName());
    }

    @Test
    public void charsetTest() {
        Document document = new Document("http://test.url");
        document.charset(Charset.forName("UTF-8"));
        assertEquals(Charset.forName("UTF-8"), document.charset());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("http://test.url");
        Document documentClone = document.clone();
        assertNotNull(documentClone);
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://test.url");
        Document.OutputSettings outputSettings = document.outputSettings();
        assertNotNull(outputSettings);
    }

    @Test
    public void parserTest() {
        Document document = new Document("http://test.url");
        Parser parser = document.parser();
        assertNotNull(parser);
    }

}