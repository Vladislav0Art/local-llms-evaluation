package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class GeneratedHasKeyInvalidKeyTest {

    @Test
    public void hasKeyInvalidKeyTest() {
        Attributes attrs = new Attributes();

        assertFalse(attrs.hasKey("key"));
    }

}