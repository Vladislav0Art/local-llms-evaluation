package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedNormalizeTest {

    @Test
    public void normalizeTest() {
        Attributes attrs = new Attributes();
        attrs.put("TESTKEY", "testValue");
        attrs.normalize();
        assertTrue(attrs.hasKey("testkey"));
    }

}