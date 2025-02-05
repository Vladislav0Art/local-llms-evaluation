package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseStringTest {

    @Test
    public void parseStringTest() {
        // Scenario: Parsing from a plain String
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<root></root>", "baseUri");
        Assert.assertNotNull(document);
    }

}