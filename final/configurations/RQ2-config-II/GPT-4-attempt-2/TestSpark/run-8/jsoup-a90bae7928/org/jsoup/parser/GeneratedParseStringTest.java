package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedParseStringTest {

    @Test
    public void parseStringTest() {
        XmlTreeBuilder builder = new XmlTreeBuilder();
        Document document = builder.parse("<root></root>", "http://example.com");
        Assert.assertEquals("root", document.childNode(0).nodeName());
    }

}