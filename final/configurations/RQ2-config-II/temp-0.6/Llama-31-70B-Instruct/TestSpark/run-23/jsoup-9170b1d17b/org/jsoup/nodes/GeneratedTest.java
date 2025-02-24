package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void testIndexOfKey() {
        Attributes attributes = new Attributes();
        int index = attributes.indexOfKey("key");
        Assert.assertEquals(0, index);
    }

    @Test
    public void testCheckNotNull() {
        Attributes attributes = new Attributes();
        String value = attributes.checkNotNull(null);
        Assert.assertEquals("", value);
    }

    @Test
    public void testGet() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String value = attributes.get("key");
        Assert.assertEquals("value", value);
    }

    @Test
    public void testGetIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        String value = attributes.getIgnoreCase("key");
        Assert.assertEquals("value", value);
    }

    @Test
    public void testGetUserData() {
        Attributes attributes = new Attributes();
        attributes.putUserData("key", "value");
        Object value = attributes.getUserData("key");
        Assert.assertEquals("value", value);
    }

}