package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes clonedAttributes = attributes.clone();
        Assert.assertTrue(attributes.equals(clonedAttributes));
    }

}