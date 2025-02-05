package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes testAttributes = new Attributes();
        testAttributes.add("key", "value");
        Iterator<Attribute> iterator = testAttributes.iterator();

        assertTrue(iterator.hasNext());
    }

}