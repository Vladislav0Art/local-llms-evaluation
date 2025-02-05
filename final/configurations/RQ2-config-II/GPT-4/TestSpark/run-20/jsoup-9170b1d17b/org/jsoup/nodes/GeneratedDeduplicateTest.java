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
        attributes.add("key", "value1").add("key", "value2");
        int deduplicated = attributes.deduplicate(ParseSettings.preserveCase);
        Assert.assertEquals(1, deduplicated);
        Assert.assertEquals(1, attributes.size());
    }

}