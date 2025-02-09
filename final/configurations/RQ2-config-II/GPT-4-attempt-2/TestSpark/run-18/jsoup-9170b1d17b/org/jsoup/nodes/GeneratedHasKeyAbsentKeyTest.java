package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Attribute;

public class GeneratedHasKeyAbsentKeyTest {

    @Test
    public void hasKeyAbsentKeyTest() {
        Attributes attrs = new Attributes();
        assertFalse(attrs.hasKey("key"));
    }

}