package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes original = new Attributes();
        original.put("key", "value");

        Attributes clone = original.clone();

        assertEquals(original, clone);
        assertNotSame(original, clone);
    }

}