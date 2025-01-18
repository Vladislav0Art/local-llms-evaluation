package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        assertTrue(attrs.hasKey("testKey"));
    }

}