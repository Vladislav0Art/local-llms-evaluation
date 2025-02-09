package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key", "value");

        Attributes attributes2 = new Attributes();
        attributes2.addAll(attributes1);

        Assert.assertTrue(attributes2.hasKey("key"));
    }

}