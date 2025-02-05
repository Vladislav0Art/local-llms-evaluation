package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.*;
import org.junit.Test;

public class GeneratedGetIgnoreCaseTest {

    @Test
    public void getIgnoreCaseTest() {
        Attributes attr = new Attributes();
        attr.put("key", "value");
        assertEquals("value", attr.getIgnoreCase("KEY"));
    }

}