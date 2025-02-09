package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.junit.Test;
import org.jsoup.nodes.Attribute;

public class GeneratedIsEmptyNonEmptyAttributesTest {

    @Test
    public void isEmptyNonEmptyAttributesTest() {
        Attributes attrs = new Attributes();
        attrs.put("key", "value");
        assertFalse(attrs.isEmpty());
    }

}