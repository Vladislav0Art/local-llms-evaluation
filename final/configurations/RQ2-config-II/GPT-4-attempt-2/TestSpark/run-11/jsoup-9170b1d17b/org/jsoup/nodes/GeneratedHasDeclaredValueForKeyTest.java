package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedHasDeclaredValueForKeyTest {

    @Test
    public void hasDeclaredValueForKeyTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertTrue(attrs.hasDeclaredValueForKey("key"));
    }

}