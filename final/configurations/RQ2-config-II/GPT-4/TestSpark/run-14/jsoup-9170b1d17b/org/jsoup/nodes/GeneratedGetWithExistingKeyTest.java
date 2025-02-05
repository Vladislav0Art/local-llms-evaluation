package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.internal.Attributes;

import static org.junit.Assert.*;

public class GeneratedGetWithExistingKeyTest {

    @Test
    public void getWithExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key_one", "value_one");
        assertEquals("value_one", attributes.get("key_one"));
    }

}