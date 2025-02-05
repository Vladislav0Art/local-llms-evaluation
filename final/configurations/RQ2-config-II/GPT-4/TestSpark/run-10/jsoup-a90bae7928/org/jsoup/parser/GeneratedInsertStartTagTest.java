package org.jsoup.parser;

import org.jsoup.parser.Parser;
import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedInsertStartTagTest {

    @Test
    public void insertStartTagTest() {
        // Scenario: Insert Token.StartTag into the XmlTreeBuilder
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Element currentElement = xmlTreeBuilder.insert(new Token.StartTag().name("tag"));
        Assert.assertNotNull(currentElement);
    }

}