package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedSizeTest {

    @Test
    public void sizeTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        attrs.put("testKey1", "testValue1");
        assertEquals(2, attrs.size());
    }

}