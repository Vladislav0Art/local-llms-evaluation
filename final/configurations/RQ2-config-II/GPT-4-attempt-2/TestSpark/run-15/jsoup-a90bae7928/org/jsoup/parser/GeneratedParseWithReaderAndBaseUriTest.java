package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseWithReaderAndBaseUriTest {

    private XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();

    // Test initialiseParse method

    @Test
    public void parseWithReaderAndBaseUriTest() {
        StringReader stringReader = new StringReader("<root></root>");
        String baseUri = "http://base.uri";
        Document document = xmlTreeBuilder.parse(stringReader, baseUri);

        Assert.assertNotNull(document);
    }

}