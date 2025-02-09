package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedAddKeyAndValueTest {

    @Test
    public void addKeyAndValueTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        Assert.assertEquals("value", attrs.get("key"));
    }

}