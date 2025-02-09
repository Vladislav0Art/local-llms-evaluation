package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Attributes attrs = new Attributes();
        attrs.put("key13", "value13");
        Assert.assertEquals("key13=\"value13\"", attrs.html());
    }

}