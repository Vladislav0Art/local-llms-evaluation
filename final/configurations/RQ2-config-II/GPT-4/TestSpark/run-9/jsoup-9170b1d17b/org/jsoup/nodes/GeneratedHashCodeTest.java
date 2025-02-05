package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");

        Attributes clonedAttributes = attributes.clone();

        Assert.assertEquals(attributes.hashCode(), clonedAttributes.hashCode());
    }

}