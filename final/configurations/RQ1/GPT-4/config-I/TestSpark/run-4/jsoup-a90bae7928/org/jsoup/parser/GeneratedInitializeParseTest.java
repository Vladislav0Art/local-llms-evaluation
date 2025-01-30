package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInitializeParseTest {

    @Test
    public void initializeParseTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader input = new StringReader("<tag>someXml</tag>");
        xmlTreeBuilder.initialiseParse(input, "http://base.uri", Parser.xmlParser());
        Document document = xmlTreeBuilder.doc;
        Assert.assertEquals("http://base.uri", document.baseUri());
    }

}