package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() throws IOException {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        attributes.add("key2", "value2");

        String expectedHtml = "key1=\"value1\" key2=\"value2\"";
        Assert.assertEquals(expectedHtml, attributes.html());
    }

}