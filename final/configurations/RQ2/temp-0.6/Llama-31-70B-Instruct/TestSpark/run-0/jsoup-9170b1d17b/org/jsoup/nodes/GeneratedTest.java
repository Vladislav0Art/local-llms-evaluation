package org.jsoup.nodes;

import static org.jsoup.internal.Normalizer.lowerCase;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.jsoup.SerializationException;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.Assert;

public class GeneratedTest {

    @Test
    public void indexOfKeyTest() {
        Attributes attributes = new Attributes();
        int actualValue = attributes.indexOfKey("key");
        Assert.assertEquals(0, actualValue);
    }

    @Test
    public void checkNotNullTest() {
        Attributes attributes = new Attributes();
        String actualValue = Attributes.checkNotNull("value");
        Assert.assertEquals("value", actualValue);
    }

    @Test
    public void getTest() {
        Attributes attributes = new Attributes();
        String actualValue = attributes.get("key");
        Assert.assertEquals("", actualValue);
    }

    @Test
    public void getIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        String actualValue = attributes.getIgnoreCase("key");
        Assert.assertEquals("", actualValue);
    }

    @Test
    public void getUserDataTest() {
        Attributes attributes = new Attributes();
        Object actualValue = attributes.getUserData("key");
        Assert.assertNull(actualValue);
    }

}