package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedIndexOfKeyTest {

    @Test
    public void indexOfKeyTest() {
        Attributes attrs = new Attributes();
        attrs.add("key", "value");
        int index = attrs.indexOfKey("key");
        assertEquals(0, index);
    }

}