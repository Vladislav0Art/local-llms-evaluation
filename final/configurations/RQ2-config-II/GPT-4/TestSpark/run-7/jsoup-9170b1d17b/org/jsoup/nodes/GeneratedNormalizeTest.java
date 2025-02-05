package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedNormalizeTest {

    @Test
    public void normalizeTest() {
        Attributes attrs = new Attributes();
        attrs.add("KEY", "value");
        attrs.normalize();
        assertFalse(attrs.hasKey("KEY"));
        assertTrue(attrs.hasKey("key"));
    }

}