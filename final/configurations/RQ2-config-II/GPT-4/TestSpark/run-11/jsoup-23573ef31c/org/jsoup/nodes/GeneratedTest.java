package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void DocumentConstructorTest() {
        Document document = new Document("http://baseuri.com");
        Assert.assertEquals("http://baseuri.com", document.location());
    }

    @Test
    public void createShellTest() {
        Document document = Document.createShell("http://baseuri.com");
        Assert.assertEquals("http://baseuri.com", document.location());
    }

    @Test
    public void documentTypeTest() {
        Document document = new Document("http://baseuri.com");
        Assert.assertNull(document.documentType());
    }

    @Test
    public void titleTest() {
        Document document = new Document("http://baseuri.com");
        document.title("Test Title");
        Assert.assertEquals("Test Title", document.title());
    }

    @Test
    public void charsetTest() {
        Document document = new Document("http://baseuri.com");
        Charset charset = Charset.forName("UTF-8");
        document.charset(charset);
        Assert.assertEquals(charset, document.charset());
    }

    @Test
    public void updateMetaCharsetElementTest() {
        Document document = new Document("http://baseuri.com");
        document.updateMetaCharsetElement(true);
        Assert.assertTrue(document.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document document = new Document("http://baseuri.com");
        Document cloned = document.clone();
        Assert.assertNotSame(document, cloned);
        Assert.assertEquals(document.location(), cloned.location());
    }

    @Test
    public void outputSettingsTest() {
        Document document = new Document("http://baseuri.com");
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        document.outputSettings(outputSettings);
        Assert.assertEquals(outputSettings, document.outputSettings());
    }

    @Test
    public void quirksModeTest() {
        Document document = new Document("http://baseuri.com");
        document.quirksMode(Document.QuirksMode.quirks);
        Assert.assertEquals(Document.QuirksMode.quirks, document.quirksMode());
    }

    @Test
    public void parserTest() {
        Document document = new Document("http://baseuri.com");
        Parser parser = Parser.htmlParser();
        document.parser(parser);
        Assert.assertEquals(parser, document.parser());
    }

    @Test
    public void connectionTest() {
        Document document = new Document("http://baseuri.com");
        Connection connection = mock(Connection.class);
        document.connection(connection);
        Assert.assertEquals(connection, document.connection());
    }

}