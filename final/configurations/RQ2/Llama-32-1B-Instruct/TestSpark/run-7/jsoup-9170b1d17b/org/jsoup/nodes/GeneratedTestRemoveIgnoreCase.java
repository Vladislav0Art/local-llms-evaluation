package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedTestRemoveIgnoreCase {

    @Test
    public void testRemoveIgnoreCase() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("KEY1", "Value 1");
        attributes.removeIgnoreCase("nonExistentKey");
        assertFalse(attributes.hasDeclaredValueForKey("KEY1"));
    }

}