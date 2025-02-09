package org.jsoup.parser;

import org.junit.Test;
import org.junit.Assert;
import org.jsoup.nodes.*;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseStringBaseUriTest {

    @Test
    public void parseStringBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document docOutput = xmlTreeBuilder.parse("<root>Hello, World!</root>", "http://example.com");
        Assert.assertEquals("html", docOutput.nodeName());
    }

}