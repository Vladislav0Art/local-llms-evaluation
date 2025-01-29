package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GeneratedTest {

    @Test
    public void testDocumentType() {
        Document document = new Document("https://example.com");
        assertEquals(documentType(), document.documentType());
    }

    @Test
    public void testHead() {
        Document document = new Document("https://example.com", ParseSettings.None);
        Element head = document.head();
        assertEquals(head, headElement());
    }

    @Test
    public void testBody() {
        Document document = new Document("https://example.com", ParseSettings.None);
        Elements bodyElements = document.body();
        assertEquals(bodyElements, bodyElementsList());
    }

    @Test
    public void testForms() {
        Document document = new Document("https://example.com");
        Element form1 = document.expectForm("testForm");
        Element form2 = document.expectForm("anotherTestForm");
        List<FormElement> forms = document.forms();
        assertEquals(2, forms.size());
        assertEquals(form1, forms.get(0));
        assertEquals(form2, forms.get(1));
    }

    @Test
    public void testTitle() {
        Document document = new Document("https://example.com");
        assertEquals(title(), document.title());
    }

    @Test
    public void testText() {
        Document document = new Document("https://example.com");
        assertEquals(text("Hello World"), document.text("Hello World"));
    }

    @Test
    public void testOuterHtml() {
        Document document = new Document("https://example.com");
        String outerHtml = document.outerHtml();
        assertEquals("<html><body>Hello World</body></html>", outerHtml);
    }

    @Test
    public void testElementName() {
        Document document = new Document("https://example.com", ParseSettings.None);
        Element element = document.createElement("input");
        assertEquals(element, element);
    }

    @Test
    public void testCharset() {
        Document document = new Document("https://example.com");
        document.charset(Charset.forName("UTF-8"));
        assertEquals(document.charset(), Charset.forName("UTF-8"));
    }

    @Test
    public void testUpdateMetaCharsetElement() {
        Document document = new Document("https://example.com", ParseSettings.None);
        document.updateMetaCharsetElement(true);
        assertTrue(document.updateMetaCharsetElement());
    }

}