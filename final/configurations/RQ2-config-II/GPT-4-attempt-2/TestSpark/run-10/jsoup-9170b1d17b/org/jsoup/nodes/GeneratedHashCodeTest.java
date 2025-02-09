package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        int expectedHashCode = attributes.hashCode();
        attributes.put("key", "value1");

        Assert.assertNotEquals(expectedHashCode, attributes.hashCode());
    }

}