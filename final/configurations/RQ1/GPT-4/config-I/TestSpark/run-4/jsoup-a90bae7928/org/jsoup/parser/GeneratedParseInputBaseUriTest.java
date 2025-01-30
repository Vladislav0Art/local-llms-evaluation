package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseInputBaseUriTest {

    @Test
    public void parseInputBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader input = new StringReader("<tag>someXml</tag>");
        Document document = xmlTreeBuilder.parse(input, "http://base.uri");
        Assert.assertEquals("someXml", document.body().text());
    }

}