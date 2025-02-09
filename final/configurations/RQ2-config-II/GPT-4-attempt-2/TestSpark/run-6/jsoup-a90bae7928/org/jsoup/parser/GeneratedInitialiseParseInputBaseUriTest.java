package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.parser.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedInitialiseParseInputBaseUriTest {

    @Test
    public void initialiseParseInputBaseUriTest() {
        StringReader input = new StringReader("<xml>Test content</xml>");
        String baseUri = "http://example.com";
        Parser parser = Parser.xmlParser();

        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(input, baseUri, parser);

        Assert.assertEquals("http://example.com", xmlTreeBuilder.getBaseUri());
    }

}