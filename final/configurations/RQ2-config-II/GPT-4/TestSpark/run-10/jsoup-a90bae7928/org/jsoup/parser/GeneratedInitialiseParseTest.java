package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        // Scenario: Initialization of parser
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader reader = new StringReader("<root></root>");
        xmlTreeBuilder.initialiseParse(reader, "baseUri", Parser.xmlParser());
        Assert.assertNotNull(xmlTreeBuilder.stack);
    }

}