package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Connection connection;

    @Test
    public void createShell

    ShellCreatedWithBaseUri() {
        Document document = Document.createShell("http://example.com");
        assertNull(document.location());
    }

    @Test
    public void location

    ShellLocationIsNotSet() {
        Document document = Document.createShell("http://example.com");
        assertNull(document.location());
    }

    @Test
    public void connection

    ShellConnectionIsCorrectlySet() {
        when(Document.connection()).thenReturn(connection);
        Document document = Document.createShell("http://example.com");
        assertEquals(connection, document.connection());
    }

    @Test
    public void head

    EmptyHeadElement() {
        Document document = Document.createShell("http://example.com");
        assertNull(document.head());
    }

    @Test
    public void body

    EmptyBodyElement() {
        Document document = Document.createShell("http://example.com");
        assertNull(document.body());
    }

    @Test
    public void forms

    FormsAreEmpty() {
        Document document = Document.createShell("http://example.com");
        assertTrue(document.forms().isEmpty());
    }

    @Test
    public void expectForm

    FormIsFoundByCssQuery() {
        when(connection.selectFirst(".test")).thenReturn(new FormElement("test"));
        Document document = Document.createShell("http://example.com");
        assertEquals("test", document.expectForm(".test").tagName());
    }

    @Test
    public void title

    ShellTitleIsSetToEmptyString() {
        Document document = Document.createShell("http://example.com");
        assertNull(document.title());
    }

    @Test
    public void title

    SetCorrectly() {
        Document document = Document.createShell("http://example.com");
        document.title("test");
        assertEquals("test", document.title());
    }

    @Test
    public void createElement

    ShellElementIsCreatedWithCorrectName() {
        Element element = document.createElement("div");
        assertEquals("div", element.tagName());
    }

    @Test
    public void outerHtml

    EmptyDocumentHasEmptyHtml() {
        Document document = new Document();
        assertNull(document.outerHtml());
    }

    @Test
    public void text

    StringIsCorrectlyPlacedInTextElement() {
        when(connection.text()).thenReturn("test");
        Document document = Document.createShell("http://example.com");
        assertEquals("test", document.text().trim());
    }

    @Test
    public void nodeName

    ShellNodeNameIsEmptyString() {
        Document document = new Document();
        assertNull(document.nodeName());
    }

    @Test
    public void charset

    CharsetIsSetToCharsetEncoder() {
        when(connection.charset()).thenReturn(Charset.forName("utf-8"));
        Document document = new Document();
        assertEquals(Charset.forName("utf-8"), document.charset());
    }

    @Test
    public void updateMetaCharsetElement

    MetaCharsetUpdateIsFalseByDefault() {
        boolean result = document.updateMetaCharsetElement();
        assertFalse(result);
    }

    @Test
    public void outputSettings

    DefaultOutputSettingsAreUsed() {
        Document document = new Document();
        assertEquals(OutputSettings.DEFAULT, document.outputSettings());
    }

    @Test
    public void quirksMode

    DefaultQuirksModeIsUsed() {
        Document document = new Document();
        assertEquals(QuirksMode.DEFAULT, document.quirksMode());
    }

}