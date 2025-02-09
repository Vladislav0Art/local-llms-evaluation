package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        Assert.assertEquals(" key=\"value\"", attrs.toString());
    }

}