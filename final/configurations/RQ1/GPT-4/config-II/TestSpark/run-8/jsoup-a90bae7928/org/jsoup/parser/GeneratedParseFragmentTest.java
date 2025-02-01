package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedParseFragmentTest {

    @Test
    public void parseFragmentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element element = new Element(new Tag("tag"), "http://base.uri");
        Assert.assertNotNull(xmlTreeBuilder.parseFragment("<tag>", element, "http://base.uri", new Parser(xmlTreeBuilder)));
    }

}