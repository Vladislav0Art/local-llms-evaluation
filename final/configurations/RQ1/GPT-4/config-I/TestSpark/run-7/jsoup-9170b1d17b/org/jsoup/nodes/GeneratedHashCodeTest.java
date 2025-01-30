package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Attributes attributes1 = new Attributes();
        attributes1.put("key", "value");

        Attributes attributes2 = new Attributes();
        attributes2.put("key", "value");

        assertEquals(attributes1.hashCode(), attributes2.hashCode());
    }

}