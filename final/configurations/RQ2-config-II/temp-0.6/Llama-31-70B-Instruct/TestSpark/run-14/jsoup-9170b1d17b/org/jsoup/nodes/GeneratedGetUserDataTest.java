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
public class GeneratedGetUserDataTest {

    @Mock
    private Attributes attributes;

    @Mock
    private Attribute attribute;

    @Mock
    private ParseSettings settings;

    @Test
    public void getUserDataTest() {
        Mockito.when(attributes.getUserData("key")).thenReturn("value");
        Object result = attributes.getUserData("key");
        Assert.assertEquals("value", result);
    }

}