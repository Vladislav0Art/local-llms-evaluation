package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedAsListTest {

    @Test
    public void asListTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        List<Attribute> list = attrs.asList();
        Assert.assertEquals(list.size(), 1);
        Assert.assertTrue(list.get(0).getKey().equals("key"));
    }

}