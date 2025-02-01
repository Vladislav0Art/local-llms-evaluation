package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedDeduplicateTest {

    @Test
    public void deduplicateTest() {
        String key = "attribute";
        String value1 = "value_one";
        String value2 = "value_two";
        Attributes attributes = new Attributes();
        attributes.add(key, value1);
        attributes.add(key, value2);
        int duplicates = attributes.deduplicate(ParseSettings.preserveCase);
        Assert.assertEquals(1, duplicates);
        Assert.assertEquals(value2, attributes.get(key));
    }

}