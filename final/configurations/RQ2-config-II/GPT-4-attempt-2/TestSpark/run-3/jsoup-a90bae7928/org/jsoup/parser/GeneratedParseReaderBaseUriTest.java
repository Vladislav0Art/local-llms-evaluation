package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseReaderBaseUriTest {

    @Test
    public void parseReaderBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document docOutput = xmlTreeBuilder.parse(new StringReader("<root>text</root>"), "http://example.com");
        Assert.assertEquals("html", docOutput.nodeName());
    }

}