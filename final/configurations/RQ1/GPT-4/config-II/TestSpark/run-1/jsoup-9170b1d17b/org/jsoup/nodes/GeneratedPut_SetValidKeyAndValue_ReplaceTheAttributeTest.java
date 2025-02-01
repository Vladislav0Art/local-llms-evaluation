package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

public class GeneratedPut_SetValidKeyAndValue_ReplaceTheAttributeTest {

    @Test
    public void put_SetValidKeyAndValue_ReplaceTheAttributeTest() {
        Attributes instance = new Attributes();
        instance.put("test", "value");
        instance.put("test", "newValue");
        assertEquals("newValue", instance.get("test"));
    }

}