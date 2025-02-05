package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedPutAttributeTest {

    @Test
    public void putAttributeTest() {
        Attributes attr = new Attributes();
        attr.put("key", "value");
        assertEquals("value", attr.get("key"));
    }

}