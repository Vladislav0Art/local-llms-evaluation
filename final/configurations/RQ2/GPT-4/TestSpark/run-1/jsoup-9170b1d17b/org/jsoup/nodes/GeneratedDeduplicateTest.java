package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedDeduplicateTest {

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.add("key", "value");
        Assert.assertEquals(2, attributes.size());
        attributes.deduplicate(new ParseSettings(true, true));
        Assert.assertEquals(1, attributes.size());
    }

}