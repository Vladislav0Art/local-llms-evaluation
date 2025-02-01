package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attributes1 = new Attributes();
        attributes1.put("key", "value");
        Attributes attributes2 = attributes1.clone();

        assertEquals(attributes1, attributes2);
        assertNotSame(attributes1, attributes2);
    }

}