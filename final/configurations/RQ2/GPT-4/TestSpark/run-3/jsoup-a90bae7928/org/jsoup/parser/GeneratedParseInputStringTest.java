package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedParseInputStringTest {

    @Test
    public void parseInputStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        String input = "<sample>test</sample>";
        Document doc = xmlTreeBuilder.parse(input, "");
        Assert.assertNotNull(doc);
        Assert.assertFalse(doc.getAllElements().isEmpty());
    }

}