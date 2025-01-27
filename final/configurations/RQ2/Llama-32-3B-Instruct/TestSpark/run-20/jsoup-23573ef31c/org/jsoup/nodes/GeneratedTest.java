package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    @Test
    public void constructorShellTest() {
        Document document = Document.createShell("https://www.example.com");
        assertNotNull(document);
    }

    @Test
    public void locationMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        assertEquals("", document.location());
    }

    @Test
    public void locationMethodNonEmptyDocumentTest() {
        Document document = Jsoup.connect("https://www.example.com").get().body();
        assertNotNull(document);
        String expectedLocation = "about:blank";
        assertEquals(expectedLocation, document.location());
    }

    @Test
    public void connectionMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        assertNull(document.connection());
    }

    @Test
    public void createHeadElementTest() {
        Document document = Document.createShell("https://www.example.com");
        Element head = document.head();
        assertNotNull(head);
    }

    @Test
    public void createBodyElementTest() {
        Document document = Document.createShell("https://www.example.com");
        Element body = document.body();
        assertNotNull(body);
    }

    @Test
    public void getFormsMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        List<FormElement> forms = document.forms();
        assertTrue(forms.isEmpty());
    }

    @Test
    public void expectFormMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        FormElement form = document.expectForm("");
        assertNotNull(form);
        assertFalse(form.matches(""));
    }

    @Test
    public void titleMethodInitialTest() {
        Document document = Document.createShell("https://www.example.com");
        String initialTitle = document.title();
        assertTrue(initialTitle.isEmpty());
    }

    @Test
    public void setTitlMethodSetSuccessTest() {
        Document document = Document.createShell("https://www.example.com");
        document.title("Title Test");
        String finalTitle = document.title();
        assertEquals("Title Test", finalTitle);
    }

    @Test
    public void createElementMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        Element element = document.createElement("");
        assertNotNull(element);
    }

    @Test
    public void outerHtmlMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        String html = document.outerHtml();
        assertTrue(html.isEmpty());
    }

    @Test
    public void textMethodTextSetSuccessTest() {
        Document document = Document.createShell("https://www.example.com");
        document.text("Some Text Test");
        String finalText = document.text();
        assertEquals("Some Text Test", finalText);
    }

    @Test
    public void nodeNameMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        String node = document.nodeName();
        assertTrue(node.isEmpty());
    }

    @Test
    public void charsetSetSuccessTest() {
        Document document = Document.createShell("https://www.example.com");
        document.charset(Charset.forName("UTF-8"));
        String finalCharset = document.charset().name();
        assertEquals("UTF-8", finalCharset);
    }

    @Test
    public void updateMetaCharsetElementMethodFalseReturnTrueTest() {
        Document document = Document.createShell("https://www.example.com");
        boolean result = document.updateMetaCharsetElement();
        assertTrue(result);
    }

    @Test
    public void updateMetaCharsetElementMethodTrueReturnFalseTest() {
        Document document = Document.createShell("https://www.example.com");
        boolean result = document.updateMetaCharsetElement(true);
        assertFalse(result);
    }

    @Test
    public void shallowCloneMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        Document clonedDocument = document.shallowClone();
        assertNotNull(clonedDocument);
    }

    @Test
    public void outputSettingsMethodEmptyDocumentTest() {
        Document document = Document.createShell("https://www.example.com");
        OutputSettings settings = document.outputSettings();
        assertTrue(settings == null || settings.isEmpty());
    }

    @Test
    public void parserMethodNullReturnNullTest() {
        Document document = Document.createShell("https://www.example.com");
        Parser parser = document.parser();
        assertNull(parser);
    }

}