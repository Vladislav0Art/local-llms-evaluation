package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedParseGivenInputAndBaseUriTest {

    @Test
    public void parseGivenInputAndBaseUriTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document result = xmlTreeBuilder.parse("<tag>", "http://base.uri");
        Assert.assertEquals("http://base.uri", result.baseUri());
    }

}