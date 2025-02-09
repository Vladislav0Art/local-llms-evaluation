package org.jsoup.parser;

import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedParseValidDocumentTest {

    @Test
    public void parseValidDocumentTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Assert.assertNotNull(xmlTreeBuilder.parse(new StringReader("<test>value</test>"), ""));
    }

}