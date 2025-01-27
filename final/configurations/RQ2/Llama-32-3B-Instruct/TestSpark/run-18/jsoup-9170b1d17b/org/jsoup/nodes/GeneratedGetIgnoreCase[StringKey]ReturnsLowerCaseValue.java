package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedGetIgnoreCase[StringKey]

ReturnsLowerCaseValue {

    @Test
    public void getIgnoreCase[ StringKey]ReturnsLowerCaseValue() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.getIgnoreCase("KEY"));
    }

}