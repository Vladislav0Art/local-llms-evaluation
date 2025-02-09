package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attrs1 = new Attributes();
        attrs1.add("key", "value");

        Attributes attrs2 = new Attributes();
        attrs2.add("key", "value");

        Assert.assertEquals(attrs1, attrs2);
    }

}