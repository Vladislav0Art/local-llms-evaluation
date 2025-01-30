package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

public class GeneratedHtmlOutputTest {

    @Test
    public void htmlOutputTest() throws Exception {
        Attributes attributes = new Attributes();
        attributes.add("attr1", "value1");
        String htmlOutput = attributes.html();
        Assert.assertTrue(htmlOutput.contains("attr1=\"value1\""));
    }

}