package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedGetUserDataTest {

    @Test
    public void getUserDataTest() {
        Attributes attributes = new Attributes();
        assertNull(attributes.getUserData("key"));
    }

}