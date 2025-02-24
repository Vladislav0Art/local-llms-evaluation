package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedIndexOfKeyTest {

    private Attributes attributes;

    @Before
    public void setup() {
        attributes = new Attributes();
    }

    @Test
    public void indexOfKeyTest() {
        attributes.add("key1", "value1");
        attributes.add("key2", "value2");
        attributes.add("key3", "value3");

        assertEquals(2, attributes.indexOfKey("key3"));
    }

}