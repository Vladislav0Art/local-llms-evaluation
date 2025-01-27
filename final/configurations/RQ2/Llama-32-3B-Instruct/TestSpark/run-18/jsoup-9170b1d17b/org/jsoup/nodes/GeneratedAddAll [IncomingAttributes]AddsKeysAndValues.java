package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedAddAll [IncomingAttributes]

AddsKeysAndValues {

    @Test
    public void addAll[ IncomingAttributes]AddsKeysAndValues() {
        Attributes incoming = new Attributes();
        incoming.put("key", "value");
        Attributes attributes = new Attributes();
        attributes.addAll(incoming);
        assertEquals(1, attributes.size());
        assertEquals("value", attributes.get("key"));
    }

}