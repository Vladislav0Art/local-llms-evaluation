package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedAsListTest {

    @Test
    public void asListTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        List<Attribute> list = attrs.asList();
        Assert.assertFalse(list.isEmpty());
    }

}