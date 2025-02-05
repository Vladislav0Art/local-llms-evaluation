package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        Attributes attrs = new Attributes();
        assertTrue(attrs.isEmpty());
        attrs.add("key", "value");
        assertFalse(attrs.isEmpty());
    }

}