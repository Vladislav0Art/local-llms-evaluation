package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedRemoveTest {

    @Test
    public void removeTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        attrs.remove("testKey");
        assertFalse(attrs.hasKey("testKey"));
    }

}