package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedHasKeyTest {

    @Test
    public void hasKeyTest() {
        Attributes attr = new Attributes();
        attr.put("key", "value");
        assertTrue(attr.hasKey("key"));
    }

}