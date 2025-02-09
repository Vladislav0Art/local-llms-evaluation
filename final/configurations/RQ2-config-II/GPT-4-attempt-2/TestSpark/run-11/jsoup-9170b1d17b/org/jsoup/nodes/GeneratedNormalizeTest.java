package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedNormalizeTest {

    @Test
    public void normalizeTest() {
        Attributes attrs = new Attributes();
        attrs.put("KEY", "value");
        attrs.normalize();
        Assert.assertEquals("value", attrs.get("key"));
    }

}