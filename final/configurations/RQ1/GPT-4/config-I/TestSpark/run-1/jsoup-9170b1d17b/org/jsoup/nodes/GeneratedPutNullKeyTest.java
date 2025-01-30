package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedPutNullKeyTest {

    @Test
    public void putNullKeyTest() {
        Attributes attributes = new Attributes();
        try {
            attributes.put(null, "value");
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Key must not be null", e.getMessage());
        }
    }

}