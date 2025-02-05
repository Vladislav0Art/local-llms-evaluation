package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSizeTest {

    @Test
    public void sizeTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.add("key1", "value1");
        testAttributes.add("key2", "value2");

        assertEquals(2, testAttributes.size());
    }

}