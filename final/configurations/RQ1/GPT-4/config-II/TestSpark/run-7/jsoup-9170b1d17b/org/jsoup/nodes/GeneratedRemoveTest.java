package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;

public class GeneratedRemoveTest {

    @Test
    public void removeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        Assert.assertEquals("", attributes.get("key"));
    }

}