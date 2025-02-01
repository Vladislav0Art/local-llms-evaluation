package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.parser.*;
import org.junit.Assert;
import org.junit.Test;

import java.io.StringReader;

public class GeneratedParseTest_using_string {

    @Test
    public void parseTest_using_string() {
        XmlTreeBuilder xmlTreeBuilder = new XmlTreeBuilder();
        Document result = xmlTreeBuilder.parse("<test>data</test>", "www.example.com");
        Assert.assertNotNull(result);
        Assert.assertEquals("test", result.body().children().first().tagName());
    }

}