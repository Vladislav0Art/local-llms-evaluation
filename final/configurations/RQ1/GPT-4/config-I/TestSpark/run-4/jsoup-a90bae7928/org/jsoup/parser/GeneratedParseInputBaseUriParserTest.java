package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseInputBaseUriParserTest {

    @Test
    public void parseInputBaseUriParserTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<tag>someXml</tag>";
        Document document = xmlTreeBuilder.parse(input, "http://base.uri");
        Assert.assertEquals("someXml", document.text());
    }

}