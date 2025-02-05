package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPutKeyAndValueTest {

    @Test
    public void putKeyAndValueTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.put("key1", "value1");

        assertEquals("value1", testAttributes.get("key1"));
    }

}