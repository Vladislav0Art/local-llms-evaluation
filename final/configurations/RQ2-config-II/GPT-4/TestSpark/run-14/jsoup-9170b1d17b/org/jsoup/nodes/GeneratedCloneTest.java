package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.internal.Attributes;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key_eleven", "value_eleven");
        Attributes attributes2 = attributes1.clone();
        assertEquals(attributes1, attributes2);
    }

}