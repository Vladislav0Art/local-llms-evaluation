package org.jsoup.parser;

import org.jsoup.parser.*;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedInitialiseParseTest {

    @Test
    public void initialiseParseTest() {
        StringReader input = new StringReader("<sample>test</sample>");
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        xmlTreeBuilder.initialiseParse(input, "", new Parser(xmlTreeBuilder));
        Assert.assertFalse(xmlTreeBuilder.stack.isEmpty());
    }

}