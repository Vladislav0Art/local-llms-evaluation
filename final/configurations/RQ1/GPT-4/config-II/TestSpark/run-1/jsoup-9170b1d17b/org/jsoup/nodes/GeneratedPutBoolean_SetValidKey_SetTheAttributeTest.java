package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

public class GeneratedPutBoolean_SetValidKey_SetTheAttributeTest {

    @Test
    public void putBoolean_SetValidKey_SetTheAttributeTest() {
        Attributes instance = new Attributes();
        instance.put("test", true);
        assertTrue(instance.hasKey("test"));
    }

}