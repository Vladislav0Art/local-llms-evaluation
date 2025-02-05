package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.internal.Attributes;

import static org.junit.Assert.*;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes1 = new Attributes();
        attributes1.add("key_eight", "value_eight");

        Attributes attributes2 = new Attributes();
        attributes2.addAll(attributes1);

        assertTrue(attributes2.hasKey("key_eight"));
    }

}