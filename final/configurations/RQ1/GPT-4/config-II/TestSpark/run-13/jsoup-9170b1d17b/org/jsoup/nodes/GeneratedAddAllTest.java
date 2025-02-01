package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key1", "value");
        Attributes attributes2 = new Attributes();
        attributes2.add("key2", "value");
        attributes1.addAll(attributes2);
        Assert.assertEquals(2, attributes1.size());
    }

}