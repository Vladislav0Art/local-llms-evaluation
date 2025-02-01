package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

public class GeneratedGetIgnoreCase_SetValidKeyAndValue_ReturnsTheSetValueTest {

    @Test
    public void getIgnoreCase_SetValidKeyAndValue_ReturnsTheSetValueTest() {
        Attributes instance = new Attributes();
        instance.put("test", "value");
        String result = instance.getIgnoreCase("TEST");
        assertEquals("value", result);
    }

}