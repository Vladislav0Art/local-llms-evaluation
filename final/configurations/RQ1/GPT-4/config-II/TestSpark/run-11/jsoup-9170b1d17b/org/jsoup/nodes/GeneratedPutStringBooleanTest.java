package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedPutStringBooleanTest {

    @Test
    public void putStringBooleanTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", true);
        assertEquals("", attributes.get("key"));
    }

}