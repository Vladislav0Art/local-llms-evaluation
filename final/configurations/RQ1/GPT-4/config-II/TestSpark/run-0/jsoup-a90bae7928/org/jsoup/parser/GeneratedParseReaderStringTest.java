package org.jsoup.parser;

import org.jsoup.nodes.*;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;
import java.util.List;

public class GeneratedParseReaderStringTest {

    @Test
    public void parseReaderStringTest() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document document = xmlTreeBuilder.parse(new StringReader("<test></test>"), "http://base.uri");

        Assert.assertNotNull(document);
        Assert.assertEquals("<test></test>", document.body().html());
    }

}