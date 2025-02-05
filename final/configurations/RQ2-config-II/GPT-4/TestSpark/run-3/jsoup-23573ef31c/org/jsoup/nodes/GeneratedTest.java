package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import java.nio.charset.Charset;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Connection mockConnection;

    @Test
    public void CreateShellTest() {
        Document doc = Document.createShell("https://example.com");
        assertNotNull(doc);
    }

    @Test
    public void locationTest() {
        Document doc = new Document("https://example.com");
        assertThat(doc.location(), is("https://example.com"));
    }

    @Test
    public void connectionTest() {
        Document doc = new Document("https://example.com");
        doc.connection(mockConnection);
        assertNotNull(doc.connection());
    }

    @Test
    public void titleTest() {
        Document doc = new Document("https://example.com");
        doc.title("Test Title");
        assertThat(doc.title(), is("Test Title"));
    }

    @Test
    public void outerHtmlTest() {
        Document doc = new Document("https://example.com");
        assertNotNull(doc.outerHtml());
    }

    @Test
    public void charsetTest() {
        Document doc = new Document("https://example.com");
        Charset charset = Charset.forName("UTF-8");
        doc.charset(charset);
        assertEquals(charset, doc.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document doc = new Document("https://example.com");
        doc.updateMetaCharsetElement(true);
        assertTrue(doc.updateMetaCharsetElement());
    }

    @Test
    public void shallowCloneTest() {
        Document doc = new Document("https://example.com");
        Document clone = doc.shallowClone();
        assertNotNull(clone);
    }

    @Test
    public void parserTest() {
        Document doc = new Document("https://example.com");
        Parser parser = Parser.htmlParser();
        doc.parser(parser);
        assertEquals(parser, doc.parser());
    }

    @Test
    public void connectionAlternativeTest() {
        Document doc = new Document("https://example.com");
        doc.connection(mockConnection);
        assertEquals(mockConnection, doc.connection());
    }

    @Test
    public void documentTypeTest() {
        Document doc = new Document("https://example.com");
        assertNull(doc.documentType());
    }

    @Test
    public void headTest() {
        Document doc = new Document("https://example.com");
        assertNotNull(doc.head());
    }

    @Test
    public void bodyTest() {
        Document doc = new Document("https://example.com");
        assertNotNull(doc.body());
    }

    @Test
    public void formsTest() {
        Document doc = new Document("https://example.com");
        List<FormElement> forms = doc.forms();
        assertNotNull(forms);
    }

    @Test
    public void expectFormExceptionTest() {
        Document doc = new Document("https://example.com");
        doc.expectForm("");
    }

    @Test
    public void textTest() {
        Document doc = new Document("https://example.com");
        doc.text("Sample Text");
        assertTrue(doc.hasText());
    }

    @Test
    public void nodeNameTest() {
        Document doc = new Document("https://example.com");
        assertThat(doc.nodeName(), is("#document"));
    }

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("https://example.com");
        OutputSettings outputSettings = new OutputSettings();
        doc.outputSettings(outputSettings);
        assertEquals(outputSettings, doc.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document doc = new Document("https://example.com");
        doc.quirksMode(QuirksMode.NO_QUIRKS);
        assertEquals(QuirksMode.NO_QUIRKS, doc.quirksMode());
    }

}