package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedSizeTest {

    @Test
    public void sizeTest() {
        Attributes attr = new Attributes();
        attr.put("key1", "value1");
        attr.put("key2", "value2");

        assertEquals(2, attr.size());
    }

}