package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key", "value");
        Attributes attributes2 = new Attributes();
        attributes2.add("key", "value");
        Assert.assertTrue(attributes1.equals(attributes2));
    }

}