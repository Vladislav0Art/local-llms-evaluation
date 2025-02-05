package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedAddAttributeTest {

    @Test
    public void addAttributeTest() {
        Attributes attr = new Attributes();
        attr.add("key", "value");
        assertEquals("value", attr.get("key"));
    }

}