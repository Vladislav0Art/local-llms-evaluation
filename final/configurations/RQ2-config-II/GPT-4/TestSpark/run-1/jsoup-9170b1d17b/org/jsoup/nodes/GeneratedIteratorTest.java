package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attr = new Attributes();
        attr.put("key1", "value1");
        attr.put("key2", "value2");

        Iterator<Attribute> iterator = attr.iterator();
        assertNotNull(iterator);
    }

}