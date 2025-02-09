package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attrs1 = new Attributes();
        attrs1.add("key", "value");
        Attributes attrs2 = new Attributes();
        attrs2.add("key", "value");
        assertTrue(attrs1.equals(attrs2));
    }

}