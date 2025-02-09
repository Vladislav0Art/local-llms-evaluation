package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedDeduplicateTest {

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value1");
        attributes.put("key", "value2");
        ParseSettings settings = new ParseSettings(true, true);
        Assert.assertEquals(1, attributes.deduplicate(settings));
    }

}