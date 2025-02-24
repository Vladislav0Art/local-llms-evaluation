package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    private Attributes attributes;

    @Before
    public void setup() {
        attributes = new Attributes();
    }

    @Test
    public void indexOfKeyTest() {
        int expected = 0;

        int actual = attributes.indexOfKey("key");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkNotNullTest() {
        String expected = "value";

        String actual = Attributes.checkNotNull("value");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest() {
        String expected = "value";

        String actual = attributes.get("key");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIgnoreCaseTest() {
        String expected = "value";

        String actual = attributes.getIgnoreCase("key");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getUserDataTest() {
        Object expected = new Object();

        Object actual = attributes.getUserData("key");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addTest() {
        String expected = "value";

        Attributes actual = attributes.add("key", "value");

        Assert.assertEquals(expected, actual.get("key"));
    }

}