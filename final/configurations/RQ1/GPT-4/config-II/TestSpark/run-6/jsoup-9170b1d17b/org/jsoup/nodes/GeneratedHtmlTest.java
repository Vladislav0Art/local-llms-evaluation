package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() throws Exception {
        String key = "attributeTestKey";
        String value = "valueToAdd";
        Attributes attributes = new Attributes();
        attributes.add(key, value);
        String expectedHtml = key + "=\"" + value + "\" ";
        Assert.assertEquals(expectedHtml, attributes.html());
    }

}