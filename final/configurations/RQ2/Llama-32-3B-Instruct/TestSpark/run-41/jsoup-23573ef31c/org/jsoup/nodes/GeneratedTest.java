package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedTest {

    @Mock
    private Connection connection;

    @Mock
    private Parser parser;

    @Mock
    private QuirksMode quirksMode;

    @Mock
    private OutputSettings outputSettings;

    @Test
    public void createShell_ShellIsCreated() {
        Document document = Document.createShell("http://example.com");
        assertNotNull(document);
    }

    @Test
    public void location_LocationIsReturned() {
        Document document = new Document("http://example.com");
        String location = document.location();
        assertEquals("http://example.com", location);
    }

    @Test
    public void connection_ConnectionIsReturned() {
        Document document = new Document("http://example.com");
        Connection connection = document.connection();
        assertNotNull(connection);
        when(connection.toString()).thenReturn("Connection to http://example.com");
        String connectionStr = connection.toString();
        assertEquals("Connection to http://example.com", connectionStr);
    }

    @Test
    public void head_HeadElementIsReturned() {
        Document document = new Document("http://example.com");
        Element head = document.head();
        assertNotNull(head);
        assertTrue(head instanceof Tag);
    }

    @Test
    public void body_BodyElementIsReturned() {
        Document document = new Document("http://example.com");
        Element body = document.body();
        assertNotNull(body);
        assertTrue(body instanceof Tag);
    }

    @Test
    public void forms_FormalElementsAreReturned() {
        List<FormElement> formElements = new ArrayList<>();
        formElements.add(new FormElement());
        formElements.add(new FormElement());
        Document document = new Document("http://example.com");
        List<FormElement> result = document.forms();
        assertEquals(formElements, result);
    }

    @Test
    public void expectForm_FormIsReturned() {
        FormElement form = new FormElement();
        Document document = new Document("http://example.com");
        FormElement result = document.expectForm("input[name=\"test\"]");
        assertNotNull(result);
        assertTrue(result instanceof Tag);
    }

    @Test
    public void title_TitleIsSet() {
        String title = "Hello World";
        Document document = new Document("http://example.com");
        document.title(title);
        assertEquals(title, document.title());
    }

    @Test
    public void createElement_ElementIsCreated() {
        String tagName = "div";
        Element element = document.createElement(tagName);
        assertNotNull(element);
        assertTrue(element instanceof Tag);
    }

    @Test
    public void clone_CloneDocumentIsReturned() {
        Document document = new Document("http://example.com");
        Document result = document.clone();
        assertNotNull(result);
        assertEquals(document, result);
    }

    @Test
    public void shallowClone_ShallowCloneIsReturned() {
        Document document = new Document("http://example.com");
        Document result = document.shallowClone();
        assertNotNull(result);
        assertEquals(document, result);
    }

    @Test
    public void outputSettings_OutputSettingsAreReturned() {
        OutputSettings outputSettings = new OutputSettings();
        Document document = new Document("http://example.com");
        OutputSettings result = document.outputSettings();
        assertNotNull(result);
        assertEquals(outputSettings, result);
    }

    @Test
    public void quirksMode_QuirksModeIsReturned() {
        QuirksMode quirksMode = new QuirksMode();
        Document document = new Document("http://example.com");
        QuirksMode result = document.quirksMode();
        assertNotNull(result);
        assertEquals(quirksMode, result);
    }

    @Test
    public void charset_CharsetIsSet() {
        Charset charset = Charset.forName("UTF-8");
        Document document = new Document("http://example.com");
        document.charset(charset);
        assertEquals(charset, document.charset());
    }

    @Test
    public void updateMetaCharsetElement_UpdateMetaCharsetElementIsReturned() {
        boolean updateMetaCharsetElement = false;
        Document document = new Document("http://example.com");
        boolean result = document.updateMetaCharsetElement();
        assertEquals(updateMetaCharsetElement, result);
    }

}