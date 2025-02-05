package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseReaderTest {

    @Test
    public void parseReaderTest() {
        // Scenario: Parsing from a Reader
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<root></root>");
        Document document = xmlTreeBuilder.parse(reader, "baseUri");
        Assert.assertNotNull(document);
    }

}