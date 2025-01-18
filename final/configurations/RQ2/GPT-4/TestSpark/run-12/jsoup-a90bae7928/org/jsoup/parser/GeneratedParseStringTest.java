package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseStringTest {

    @Test
    public void parseStringTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        Document dc = xb.parse("<html></html>", "");
        Assert.assertEquals("<html>\n" + " <head></head>\n" + " <body></body>\n" + "</html>", dc.html());
    }

}