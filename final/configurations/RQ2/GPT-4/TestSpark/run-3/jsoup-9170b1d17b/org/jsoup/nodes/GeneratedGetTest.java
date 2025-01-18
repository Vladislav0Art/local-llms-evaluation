package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        assertEquals("testValue", attrs.get("testKey"));
    }

}