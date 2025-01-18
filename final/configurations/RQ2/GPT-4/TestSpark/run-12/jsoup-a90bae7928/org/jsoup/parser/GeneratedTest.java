package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedTest {

    @Test
    public void defaultSettingsTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        Assert.assertNotNull(xb.defaultSettings());
    }

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        StringReader str = new StringReader("<html></html>");
        Document dc = xb.parse(str, "");
        Assert.assertEquals("<html>\n" + " <head></head>\n" + " <body></body>\n" + "</html>", dc.html());
    }

    @Test
    public void parseStringTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        Document dc = xb.parse("<html></html>", "");
        Assert.assertEquals("<html>\n" + " <head></head>\n" + " <body></body>\n" + "</html>", dc.html());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        Assert.assertNotSame(xb, xb.newInstance());
    }

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        List<Node> nd = xb.parseFragment("<html></html>", "", new Parser(xb));
        Assert.assertEquals(1, nd.size());
    }

    @Test
    public void parseFragmentContextTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        List<Node> nd = xb.parseFragment("<html></html>", null, "", new Parser(xb));
        Assert.assertEquals(1, nd.size());
    }

}