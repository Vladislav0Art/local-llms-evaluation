package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void createShell_documentCreatedWithCorrectBaseUri() {
        String baseUri = "https://www.example.com";
        Document document = Document.createShell(baseUri);
        assertNotNull(document);
        assertEquals(baseUri, document.baseUri());
    }

    @Test
    public void location_locationMethodReturnsCorrectString() {
        String expectedLocation = "/index.html";
        Document document = Document.createShell("https://www.example.com");
        assertEquals(expectedLocation, document.location());
    }

    @Test
    public void connection_connectionMethodReturnsCorrectConnection() {
        Connection expectedConnection = Jsoup.connect("https://www.example.com").get();
        Document document = Document.createShell("https://www.example.com");
        assertEquals(expectedConnection, document.connection());
    }

    @Test
    public void documentType_documentTypeMethodReturnsCorrectDocumentType() {
        String expectedDocumentType = "html";
        Document document = Document.createShell("https://www.example.com");
        assertEquals(expectedDocumentType, document.documentType());
    }

    @Test
    public void head_elementHeadReturnsCorrectTag() {
        Document document = Document.createShell("https://www.example.com");
        Element element = document.head();
        assertNotNull(element);
        assertTrue(element.tagName().equals("head"));
    }

    @Test
    public void body_elementBodyReturnsCorrectTag() {
        Document document = Document.createShell("https://www.example.com");
        Element element = document.body();
        assertNotNull(element);
        assertTrue(element.tagName().equals("body"));
    }

    @Test
    public void forms_formsMethodReturnsListOfFormsElements() {
        List<FormElement> expectedForms = Arrays.asList(new FormElement(), new FormElement());
        Document document = Document.createShell("https://www.example.com");
        assertEquals(expectedForms, document.forms());
    }

    @Test
    public void expectForm_expectFormMethodReturnsCorrectFormElement() {
        String expectedCssQuery = "form";
        List<FormElement> forms = Arrays.asList(new FormElement(), new FormElement());
        Document document = Document.createShell("https://www.example.com");
        assertEquals(forms.get(0), document.expectForm(expectedCssQuery));
    }

    @Test
    public void title_titleMethodReturnsCorrectString() {
        String expectedTitle = "Example Title";
        Document document = Document.createShell("https://www.example.com");
        assertEquals(expectedTitle, document.title());
    }

    @Test
    public void title_setTitle_methodSetsCorrectTitle() {
        String expectedTitle = "New Example Title";
        Document document = Document.createShell("https://www.example.com");
        document.setTitle(expectedTitle);
        assertEquals(expectedTitle, document.title());
    }

    @Test
    public void createElement_createElementMethodCreatesCorrectTagElement() {
        String expectedTagName = "p";
        Element element = document.createElement(expectedTagName);
        assertNotNull(element);
        assertTrue(element.tagName().equals(expectedTagName));
    }

    @Test
    public void outerHtml_outerHtmlMethodReturnsCorrectString() {
        String expectedOuterHtml = "<html><body>Hello World!</body></html>";
        Document document = Document.createShell("https://www.example.com");
        assertEquals(expectedOuterHtml, document.outerHtml());
    }

    @Test
    public void text_textMethodSetsCorrectTextContent() {
        String expectedText = "New Text Content";
        Document document = Document.createShell("https://www.example.com");
        document.text(expectedText);
        assertEquals(expectedText, document.text());
    }

    @Test
    public void nodeName_nodeNameMethodReturnsCorrectString() {
        String expectedNodeName = "#document";
        Document document = Document.createShell("https://www.example.com");
        assertEquals(expectedNodeName, document.nodeName());
    }

    @Test
    public void charset_charsetMethodSetsCorrectCharset() {
        Charset expectedCharset = Charset.forName("UTF-8");
        Document document = Document.createShell("https://www.example.com");
        document.charset(expectedCharset);
        assertEquals(expectedCharset, document.charset());
    }

    @Test
    public void updateMetaCharsetElement_updateMetaCharsetElementMethodUpdatesMetaCharsetCorrectly() {
        boolean expectedUpdate = true;
        Document document = Document.createShell("https://www.example.com");
        document.updateMetaCharsetElement(expectedUpdate);
        assertTrue(document.updateMetaCharsetElement());
    }

}