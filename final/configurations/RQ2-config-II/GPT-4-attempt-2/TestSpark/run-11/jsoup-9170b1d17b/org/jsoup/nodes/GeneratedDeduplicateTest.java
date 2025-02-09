package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedDeduplicateTest {

    @Test
    public void deduplicateTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value1");
        attrs.add("key", "value2");

        attrs.deduplicate(ParseSettings.preserveCase);
        Assert.assertEquals(1, attrs.size());
    }

}