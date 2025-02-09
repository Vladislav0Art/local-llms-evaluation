package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedHtmlTest {

    @Test
    public void htmlTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        String html = attrs.html();
        Assert.assertEquals(" key=\"value\"", html);
    }

}