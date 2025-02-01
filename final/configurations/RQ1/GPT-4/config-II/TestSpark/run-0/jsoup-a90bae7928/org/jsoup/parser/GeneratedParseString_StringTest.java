package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseString_StringTest {

    @Test
    public void parseString_StringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse("<test></test>", "http://base.uri");

        Assert.assertNotNull(document);
        Assert.assertEquals("<test></test>", document.body().html());
    }

}