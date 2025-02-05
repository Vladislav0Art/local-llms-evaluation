package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedNewInstanceTest {

    @Test
    public void newInstanceTest() {
        // Scenario: Creating a new instance of XmlTreeBuilder
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        XmlTreeBuilder newXmlTreeBuilder = xmlTreeBuilder.newInstance();
        Assert.assertNotNull(newXmlTreeBuilder);
    }

}