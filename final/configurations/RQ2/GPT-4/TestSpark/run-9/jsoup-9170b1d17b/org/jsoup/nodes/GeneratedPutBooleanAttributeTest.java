package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GeneratedPutBooleanAttributeTest {

    @Test
    public void putBooleanAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        Assert.assertEquals("true", attributes.get("key"));
    }

}