package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseReaderTest {

    @Test
    public void parseReaderTest() {
        XmlTreeBuilder xb = new XmlTreeBuilder();
        StringReader str = new StringReader("<html></html>");
        Document dc = xb.parse(str, "");
        Assert.assertEquals("<html>\n" + " <head></head>\n" + " <body></body>\n" + "</html>", dc.html());
    }

}