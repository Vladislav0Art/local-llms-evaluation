package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTest {

    private Element doc;

    @BeforeEach
    public void setup() {
        String baseUri = "http://example.com";
        doc = new Document(baseUri);
    }

    @Test
    public void testHeadElement() {
        assertEquals("<html>", doc.head().outerHtml());
        assertEquals("http://example.com/base.html", doc.head().href());
        Mockito.when(doc.connection()).thenReturn(Mockito.any(Connection.class));
    }

    @Test
    public void testBodyElement() {
        Element body = doc.body();
        assertEquals("<body>", body.outerHtml());
        assertEquals("http://example.com/base.html", body.href());
        Mockito.when(doc.connection()).thenReturn(Mockito.any(Connection.class));
    }

    @Test
    public void testFormsElements() {
        List<FormElement> forms = doc.forms();
        assertEquals(0, forms.size());
        Mockito.when(doc.forms()).thenReturn(Mockito.mock(List.class));
    }

    @Test
    public void testExpectForm() {
        FormElement form = doc.expectForm("id='myId'");
        assertEquals("id='myId'", form.cssQuery());
        assertEquals("", form.title());
        Mockito.when(doc.documentType()).thenReturn(DocumentType.SELF);
        Mockito.when(form.cssQuery()).thenReturn("someCss");
    }

    @Test
    public void testTitleElement() {
        String title = "Hello World";
        doc.title(title);
        assertEquals("<title>Hello World</title>", doc.outerHtml());
    }

    @Test
    public void testTextElement() {
        String text = "This is a sample text.";
        Element textElement = doc.text(text);
        assertEquals(text, textElement.text());
    }

    @Test
    public void testNodeName() {
        assertEquals("document", doc.nodeName());
    }

    @Test
    public void testCharset() {
        Charset charset = "utf-8";
        Mockito.when(doc.charset(charset)).thenReturn(charset);
        assertEquals("utf-8", doc.charset().toString());
    }

}