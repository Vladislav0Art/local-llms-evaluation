package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("testKey", "testValue");

        Attributes attrs2 = new Attributes();
        attrs2.put("testKey", "testValue");

        assertEquals(attrs1, attrs2);
    }

}