package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;

public class GeneratedHashCodeEqualsTest {

    @Test
    public void hashCodeEqualsTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("key1", "value1");
        Attributes attrs2 = new Attributes();
        attrs2.put("key1", "value1");
        assertTrue(attrs1.equals(attrs2));
        assertEquals(attrs1.hashCode(), attrs2.hashCode());
    }

}