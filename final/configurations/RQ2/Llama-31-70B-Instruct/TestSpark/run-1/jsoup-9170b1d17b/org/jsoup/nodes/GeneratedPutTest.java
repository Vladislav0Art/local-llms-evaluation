package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedPutTest {

    private Attributes attributes;

    @Before
    public void setUp() {
        attributes = new Attributes();
    }

    @After
    public void tearDown() {
        attributes = null;
    }

    @Test
    public void putTest() {
        Attributes expected = attributes;
        Attributes actual = attributes.put("key", "value");
        assertEquals(expected, actual);
    }

}