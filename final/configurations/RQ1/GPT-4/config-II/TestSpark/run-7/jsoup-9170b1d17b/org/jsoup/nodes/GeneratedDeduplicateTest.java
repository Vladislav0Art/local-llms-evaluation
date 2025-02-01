package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedDeduplicateTest {

    @Test
    public void deduplicateTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value1");
        attributes.put("key", "value2");
        attributes.deduplicate(ParserSettings.preserveCase);
        Assert.assertEquals(1, attributes.size());
        Assert.assertEquals("value2", attributes.get("key"));
    }

}