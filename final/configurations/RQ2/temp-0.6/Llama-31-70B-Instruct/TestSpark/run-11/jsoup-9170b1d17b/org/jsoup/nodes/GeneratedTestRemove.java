package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.nodes.Attributes;

public class GeneratedTestRemove {

    @Test
    public void testRemove() {
        Attributes attributes = new Attributes();
        attributes.put("testKey", "testValue");
        attributes.remove("testKey");
        assertEquals(0, attributes.size());
    }

}