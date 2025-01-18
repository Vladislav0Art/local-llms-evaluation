package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedParseInputReaderTest {

    @Test
    public void parseInputReaderTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        StringReader input = new StringReader("<sample>test</sample>");
        Document doc = xmlTreeBuilder.parse(input, "");
        Assert.assertNotNull(doc);
        Assert.assertFalse(doc.getAllElements().isEmpty());
    }

}