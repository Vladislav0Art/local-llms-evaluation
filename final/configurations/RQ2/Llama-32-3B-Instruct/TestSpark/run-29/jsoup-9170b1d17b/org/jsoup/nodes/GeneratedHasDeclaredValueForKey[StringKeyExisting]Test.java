package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedHasDeclaredValueForKey[StringKeyExisting]

Test {

    @Test
    public void hasDeclaredValueForKey[ StringKeyExisting]Test() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        assertTrue(attributes.hasDeclaredValueForKey("test"));
    }

}