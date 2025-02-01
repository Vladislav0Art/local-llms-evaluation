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
        attributes.add("key", "value1");
        attributes.add("key", "value2");
        int numDuplicates = attributes.deduplicate(ParseSettings.htmlDefault);
        Assert.assertEquals(1, numDuplicates);
    }

}