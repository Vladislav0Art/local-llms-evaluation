package org.jsoup.nodes;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.nio.charset.Charset;
import java.util.List;

public class GeneratedTest {

    @Test
    public void createShellTest() {
        Document doc = Document.createShell("http://example.com");
        Assert.assertEquals("http://example.com", doc.location());
    }

    @Test
    public void locationTest() {
        Document doc = new Document("http://example.com");
        Assert.assertEquals("http://example.com", doc.location());
    }

    @Test
    public void connectionMockTest() {
        Document doc = new Document("http://example.com");
        Connection connection = Jsoup.connect("http://example.com");
        doc = doc.connection(connection);
        Assert.assertEquals(connection, doc.connection());
    }

    @Test
    public void documentTypeTest() {
        Document doc = new Document("http://example.com");
        DocumentType docType = doc.documentType();
        Assert.assertNotNull(docType);
    }

    @Test
    public void headTest() {
        Document doc = new Document("http://example.com");
        Element head = doc.head();
        Assert.assertNotNull(head);
    }

    @Test
    public void bodyTest() {
        Document doc = new Document("http://example.com");
        Element body = doc.body();
        Assert.assertNotNull(body);
    }

    @Test
    public void formsTest() {
        Document doc = new Document("http://example.com");
        List<FormElement> forms = doc.forms();
        Assert.assertNotNull(forms);
    }

    @Test
    public void titleReadWriteTest() {
        Document doc = new Document("http://example.com");
        doc.title("TestTitle");
        Assert.assertEquals("TestTitle", doc.title());
    }

    @Test
    public void createElementTest() {
        Document doc = new Document("http://example.com");
        Element newElem = doc.createElement("div");
        Assert.assertNotNull(newElem);
    }

    @Test
    public void outerHtmlTest() {
        Document doc = new Document("http://example.com");
        String expected = "<html>\n <head></head>\n <body></body>\n</html>";
        String outerHtml = doc.outerHtml();
        Assert.assertEquals(expected, outerHtml);
    }

    @Test
    public void textTest() {
        Document doc = new Document("http://example.com");
        doc.text("TestText");
        Assert.assertEquals("TestText", doc.text());
    }

    @Test
    public void nodeNameTest() {
        Document doc = new Document("http://example.com");
        Assert.assertEquals("#document", doc.nodeName());
    }

    @Test
    public void charsetReadWriteTest() {
        Document doc = new Document("http://example.com");
        doc.charset(Charset.forName("UTF-8"));
        Assert.assertEquals(Charset.forName("UTF-8"), doc.charset());
    }

    @Test
    public void updateMetaCharsetElementReadWriteTest() {
        Document doc = new Document("http://example.com");
        doc.updateMetaCharsetElement(true);
        Assert.assertTrue(doc.updateMetaCharsetElement());
    }

    @Test
    public void cloneTest() {
        Document doc1 = new Document("http://example.com");
        Document doc2 = doc1.clone();
        Assert.assertNotSame(doc1, doc2);
        Assert.assertEquals(doc1.outerHtml(), doc2.outerHtml());
    }

    @Test
    public void outputSettingsTest() {
        Document doc = new Document("http://example.com");
        Document.OutputSettings settings = doc.outputSettings();
        Assert.assertNotNull(settings);
    }

    @Test
    public void quirksModeTest() {
        Document doc = new Document("http://example.com");
        doc.quirksMode(Document.QuirksMode.quirks);
        Assert.assertEquals(Document.QuirksMode.quirks, doc.quirksMode());
    }

    @Test
    public void parserTest() {
        Document doc = new Document("http://example.com");
        Parser parser = doc.parser();
        Assert.assertNotNull(parser);
    }

}