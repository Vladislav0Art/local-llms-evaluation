package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        Attributes attr = new Attributes();
        attr.put("key", "value");
        assertNotEquals(0, attr.hashCode());
    }

}