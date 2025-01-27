package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedRemove[StringKeyExisting]

Test {

    @Test
    public void remove[ StringKeyExisting]Test() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        attributes.remove("test");
        assertFalse(attributes.hasKey("test"));
    }

}