package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedGetUserDataTest {

    private Attributes attributes;

    @Before
    public void setup() {
        attributes = new Attributes();
    }

    @Test
    public void getUserDataTest() {
        attributes.putUserData("key1", "value1");

        assertEquals("value1", attributes.getUserData("key1"));
        assertNull(attributes.getUserData("key2"));
    }

}