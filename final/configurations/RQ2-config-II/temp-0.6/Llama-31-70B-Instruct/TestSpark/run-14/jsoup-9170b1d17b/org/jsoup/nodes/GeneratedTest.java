package org.jsoup.nodes;

import static org.jsoup.internal.Normalizer.lowerCase;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.jsoup.internal.StringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Attributes attributes;

    @Mock
    private Attribute attribute;

    @Mock
    private ParseSettings settings;

    @Test
    public void indexOfKeyTest() {
        Mockito.when(attributes.indexOfKey("key")).thenReturn(0);
        int index = attributes.indexOfKey("key");
        Assert.assertEquals(0, index);
    }

    @Test
    public void checkNotNullTest() {
        String expected = "test";
        String result = Attributes.checkNotNull("test");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void getTest() {
        Mockito.when(attributes.get("key")).thenReturn("value");
        String result = attributes.get("key");
        Assert.assertEquals("value", result);
    }

    @Test
    public void getIgnoreCaseTest() {
        Mockito.when(attributes.getIgnoreCase("key")).thenReturn("value");
        String result = attributes.getIgnoreCase("key");
        Assert.assertEquals("value", result);
    }

    @Test
    public void getUserDataTest() {
        Mockito.when(attributes.getUserData("key")).thenReturn("value");
        Object result = attributes.getUserData("key");
        Assert.assertEquals("value", result);
    }

}