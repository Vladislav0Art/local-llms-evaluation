package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        attributes.add("key2", "value2");
        String html = attributes.html();
        Assert.assertTrue(html.contains("key1=\"value1\""));
        Assert.assertTrue(html.contains("key2=\"value2\""));
    }

}