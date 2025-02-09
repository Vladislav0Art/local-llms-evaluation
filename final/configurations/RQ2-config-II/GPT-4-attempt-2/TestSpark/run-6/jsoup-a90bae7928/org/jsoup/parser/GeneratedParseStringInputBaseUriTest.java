package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseStringInputBaseUriTest {

    @Test
    public void parseStringInputBaseUriTest() {
        String input = "<xml>Test content</xml>";
        String baseUri = "http://example.com";

        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse(input, baseUri);

        Assert.assertEquals("http://example.com", document.baseUri());
    }

}