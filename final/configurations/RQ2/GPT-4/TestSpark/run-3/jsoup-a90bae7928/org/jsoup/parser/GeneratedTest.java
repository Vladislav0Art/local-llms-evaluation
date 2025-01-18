package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedTest {

    @Test
    public void initialiseParseTest() {
        StringReader input = new StringReader("<sample>test</sample>");
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(input, "", new Parser(xmlTreeBuilder));
        Assert.assertFalse(xmlTreeBuilder.stack.isEmpty());
    }

    @Test
    public void parseInputStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<sample>test</sample>";
        Document doc = xmlTreeBuilder.parse(input, "");
        Assert.assertNotNull(doc);
        Assert.assertFalse(doc.getAllElements().isEmpty());
    }

    @Test
    public void parseInputReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader input = new StringReader("<sample>test</sample>");
        Document doc = xmlTreeBuilder.parse(input, "");
        Assert.assertNotNull(doc);
        Assert.assertFalse(doc.getAllElements().isEmpty());
    }

    @Test
    public void newInstanceTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        TreeBuilder newInstance = xmlTreeBuilder.newInstance();
        Assert.assertTrue(newInstance instanceof XmlTreeBuilder);
    }

}