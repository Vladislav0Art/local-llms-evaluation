package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Token;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseStringInputBaseUriTest {

    @Test
    public void parseStringInputBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<tag>content</tag>", "http://base.uri");
        Assert.assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<tag>\n content\n</tag>\n", document.toString());
    }

}