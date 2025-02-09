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
        attributes.put("key", "value");
        attributes.put("KEY", "value");
        ParseSettings settings = new ParseSettings(true, true);
        attributes.deduplicate(settings);

        Assert.assertEquals(1, attributes.size());
    }

}