package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        String html = attributes.html();
        Assert.assertTrue(html.contains("key"));
    }

}