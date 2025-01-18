package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attrs1 = new Attributes();
        attrs1.put("testKey", "testValue");

        Attributes attrs2 = new Attributes();
        attrs2.put("key", "value");

        attrs1.addAll(attrs2);
        assertTrue(attrs1.hasKey("key"));
    }

}