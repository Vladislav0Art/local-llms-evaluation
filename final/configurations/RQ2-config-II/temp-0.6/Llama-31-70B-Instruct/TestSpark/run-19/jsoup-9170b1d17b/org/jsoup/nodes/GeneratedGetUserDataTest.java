package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.ParseSettings;
import org.jsoup.internal.Normalizer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.mockito.Mockito;

public class GeneratedGetUserDataTest {

    private Attributes attributes;

    @Before
    public void setUp() {
        attributes = new Attributes();
    }

    @Test
    public void getUserDataTest() {
        attributes.putUserData("key", "value");
        assertNotNull(attributes.getUserData("key"));
        assertEquals("value", attributes.getUserData("key"));
    }

}