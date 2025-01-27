package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetIgnoreCase[StringKeyExisting]

Test {

    @Test
    public void getIgnoreCase[ StringKeyExisting]Test() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        assertEquals("value", attributes.getIgnoreCase("test"));
    }

}