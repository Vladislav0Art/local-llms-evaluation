package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedHasKeyIgnoreCaseTest {

    @Test
    public void hasKeyIgnoreCaseTest() {
        Attributes attrs = new Attributes();
        attrs.put("testKey", "testValue");
        assertTrue(attrs.hasKeyIgnoreCase("TESTKEY"));
    }

}