package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

public class GeneratedDeduplicateTest {

    @Test
    public void deduplicateTest() {
        ParseSettings settings = new ParseSettings(true, false);
        Attributes attributes = new Attributes();
        attributes.put("Key", "value1");
        attributes.put("key", "value2");

        int removed = attributes.deduplicate(settings);

        Assert.assertEquals(1, removed);
        Assert.assertEquals(1, attributes.size());
        Assert.assertTrue(attributes.hasKey("Key"));
        Assert.assertFalse(attributes.hasKey("key"));
    }

}