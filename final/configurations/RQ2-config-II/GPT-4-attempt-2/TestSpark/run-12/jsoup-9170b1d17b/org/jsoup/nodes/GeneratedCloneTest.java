package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attributes = new Attributes();
        attributes.add("key1", "value1");
        Attributes clone = attributes.clone();
        Assert.assertEquals(attributes, clone);
    }

}