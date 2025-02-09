package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        String baseUri = "http://example.com";
        Document doc = Document.createShell(baseUri);
        assertEquals(baseUri, doc.location());
    }

    @Test
    public void locationTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        assertEquals(baseUri, doc.location());
    }

    @Test
    public void connectionTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        Connection connection = doc.connection();
        connection.url(baseUri);

        assertEquals(baseUri, connection.request().url().toString());
    }

    @Test
    public void formsTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        List<FormElement> forms = doc.forms();

        assertEquals(0, forms.size());
    }

    @Test
    public void titleTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        String expectedTitle = "Test Title";
        doc.title(expectedTitle);

        assertEquals(expectedTitle, doc.title());
    }

    @Test
    public void charsetTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        doc.charset(StandardCharsets.UTF_8);

        assertEquals(StandardCharsets.UTF_8, doc.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        doc.updateMetaCharsetElement(true);

        assertTrue(doc.updateMetaCharsetElement());
    }

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("");
        OutputSettings outputSettings = new OutputSettings();
        outputSettings.prettyPrint(false);
        doc.outputSettings(outputSettings);

        assertEquals(outputSettings.prettyPrint(), doc.outputSettings().prettyPrint());
    }

    @Test
    public void cloneTest() {
        String baseUri = "http://example.com";
        Document doc = new Document(baseUri);
        Document cloned = doc.clone();

        assertTrue(cloned != doc && cloned.location().equals(doc.location()));
    }

    @Test
    public void parserTest() {
        Document doc = new Document("");
        Parser parser = mock(Parser.class);
        doc.parser(parser);

        assertEquals(parser, doc.parser());
    }

}