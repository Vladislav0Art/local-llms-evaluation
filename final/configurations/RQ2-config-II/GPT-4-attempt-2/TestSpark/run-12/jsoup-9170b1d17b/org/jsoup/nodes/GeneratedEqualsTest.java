package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key1", "value1");
        Attributes attributes2 = new Attributes();
        attributes2.add("key1", "value1");
        Assert.assertEquals(attributes1, attributes2);
    }

}