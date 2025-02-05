package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Attributes attr = new Attributes();
        attr.put("key", "value");
        Attributes cloneAttr = attr.clone();

        assertEquals(cloneAttr, attr);
    }

}