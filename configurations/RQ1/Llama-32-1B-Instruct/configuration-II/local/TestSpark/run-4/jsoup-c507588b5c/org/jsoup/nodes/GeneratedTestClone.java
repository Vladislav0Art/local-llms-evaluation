package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestClone {

    @Test
    public void testClone() {
        TextNode original = new TextNode("Hello World!");
        TextNode cloned = original.clone();
        assertTrue(original != cloned);
        assertEquals(original, cloned);
    }

}