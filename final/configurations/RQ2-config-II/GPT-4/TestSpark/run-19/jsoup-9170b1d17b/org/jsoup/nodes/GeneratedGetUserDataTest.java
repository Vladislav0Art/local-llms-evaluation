package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class GeneratedGetUserDataTest {

    @Test
    public void getUserDataTest() {
        Attributes attrs = new Attributes();
        attrs.putUserData("key", "value");
        Object actualValue = attrs.getUserData("key");
        assertEquals("value", actualValue);
    }

}