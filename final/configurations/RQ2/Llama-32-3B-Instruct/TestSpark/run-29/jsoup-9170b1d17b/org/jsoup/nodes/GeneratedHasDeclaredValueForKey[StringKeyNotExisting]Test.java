package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedHasDeclaredValueForKey[StringKeyNotExisting]

Test {

    @Test
    public void hasDeclaredValueForKey[ StringKeyNotExisting]Test() {
        Attributes attributes = new Attributes();
        assertFalse(attributes.hasDeclaredValueForKey("non-existent-key"));
    }

}