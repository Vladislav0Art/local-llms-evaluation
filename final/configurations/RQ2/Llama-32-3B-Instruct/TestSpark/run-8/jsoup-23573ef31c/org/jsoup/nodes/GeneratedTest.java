package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedTest {

    @Test
    public void constructorWithBaseUriIsCreatedCorrectly() {
        String baseUri = "http://example.com";
        Document document = new Document(baseUri);
        assertNotNull(document);
        assertEquals(baseUri, document.baseUri());
    }

    @Test
    public void createShellStringReturnsDocumentWithShellElement() {
        String baseUri = "http://example.com";
        Document document = Document.createShell(baseUri);
        assertTrue(document.hasChild("html"));
        assertEquals(baseUri, document.location());
    }

    @Test
    public void locationReturnsCorrectLocation() {
        Document document = new Document("http://example.com");
        assertEquals("http://example.com", document.location());
    }

    @Test
    public void connectionReturnsCorrectConnection() {
        Connection connection = new Connection();
        Document document = new Document("http://example.com");
        Document result = document.connection(connection);
        assertNotNull(result);
        assertEquals(connection, result.connection());
    }

    @Test
    public void documentTypeReturnsNullIfNotSet() {
        Document document = new Document("http://example.com");
        assertNull(document.documentType());
    }

    @Test
    public void headElementReturnsCorrectHeadElement() {
        Document document = new Document("http://example.com");
        Element headElement = document.head();
        assertNotNull(headElement);
        assertTrue(headElement.hasChild("title"));
    }

    @Test
    public void bodyElementReturnsCorrectBodyElement() {
        Document document = new Document("http://example.com");
        Element bodyElement = document.body();
        assertNotNull(bodyElement);
        assertTrue(bodyElement.hasChild("html"));
    }

    @Test
    public void formsReturnsListWithCorrectFormElements() {
        List<FormElement> formElements = new ArrayList<>();
        formElements.add(new FormElement());
        Document document = new Document("http://example.com");
        List<FormElement> result = document.forms(formElements);
        assertEquals(formElements, result);
    }

    @Test
    public void expectFormStringReturnsCorrectFormElement() {
        String cssQuery = "input[type=\"text\"]";
        FormElement formElement = new FormElement();
        Document document = new Document("http://example.com");
        FormElement result = document.expectForm(cssQuery, formElements);
        assertNotNull(result);
        assertEquals(formElement, result);
    }

    @Test
    public void titleSetsCorrectTitle() {
        String title = "Example Title";
        Document document = new Document("http://example.com");
        document.title(title);
        assertEquals(title, document.title());
    }

    @Test
    public void createElementStringReturnsCorrectElement() {
        String tagName = "div";
        Element element = new Element();
        Document document = new Document("http://example.com");
        Element result = document.createElement(tagName);
        assertNotNull(result);
        assertEquals(element, result);
    }

    @Test
    public void outerHtmlReturnsCorrectOuterHtml() {
        Document document = new Document("http://example.com");
        String expectedOuterHtml = "<html><body>Hello World!</body></html>";
        assertEquals(expectedOuterHtml, document.outerHtml());
    }

    @Test
    public void textStringSetsCorrectTextContent() {
        String text = "Hello World!";
        Element element = new Element();
        Document document = new Document("http://example.com");
        Element result = document.text(text);
        assertNotNull(result);
        assertEquals(text, result.text());
    }

    @Test
    public void nodeNameReturnsCorrectNodeName() {
        Document document = new Document("http://example.com");
        String expectedNodeName = "HTMLDocument";
        assertEquals(expectedNodeName, document.nodeName());
    }

    @Test
    public void charsetSetsCorrectCharset() {
        Charset charset = Charset.forName("UTF-8");
        Document document = new Document("http://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

    @Test
    public void updateMetaCharsetElementSetsCorrectUpdateFlag() {
        boolean update = true;
        Document document = new Document("http://example.com");
        document.updateMetaCharsetElement(update);
        assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void cloneReturnsCorrectDocumentClone() {
        Document document = new Document("http://example.com");
        Document documentClone = document.clone();
        assertNotNull(documentClone);
        assertEquals(document, documentClone);
    }

    @Test
    public void shallowCloneReturnsCorrectDocumentShallowClone() {
        Document document = new Document("http://example.com");
        Document documentShallowClone = document.shallowClone();
        assertNotNull(documentShallowClone);
        assertEquals(document, documentShallowClone);
    }

    @Test
    public void outputSettingsReturnsCorrectOutputSettings() {
        OutputSettings outputSettings = new OutputSettings();
        Document document = new Document("http://example.com");
        Document result = document.outputSettings(outputSettings);
        assertNotNull(result);
        assertEquals(outputSettings, result.outputSettings());
    }

    @Test
    public void quirksModeSetsCorrectQuirksMode() {
        QuirksMode quirksMode = QuirksMode.Automatic;
        Document document = new Document("http://example.com");
        Document result = document.quirksMode(quirksMode);
        assertNotNull(result);
        assertEquals(quirksMode, result.quirksMode());
    }

    @Test
    public void parserReturnsCorrectParser() {
        Parser parser = new Parser();
        Document document = new Document("http://example.com");
        Document result = document.parser(parser);
        assertNotNull(result);
        assertEquals(parser, result.parser());
    }

}