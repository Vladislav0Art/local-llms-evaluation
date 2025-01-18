package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedGetNonExistentKeyTest {

    @Test
    public void getNonExistentKeyTest() {
        Attributes attributes = new Attributes();
        Assert.assertEquals("", attributes.get("key"));
    }

}