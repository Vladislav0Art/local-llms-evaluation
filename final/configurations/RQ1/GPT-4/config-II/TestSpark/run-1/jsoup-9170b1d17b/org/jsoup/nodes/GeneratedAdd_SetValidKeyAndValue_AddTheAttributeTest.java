package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

public class GeneratedAdd_SetValidKeyAndValue_AddTheAttributeTest {

    @Test
    public void add_SetValidKeyAndValue_AddTheAttributeTest() {
        Attributes instance = new Attributes();
        instance.add("test", "value");
        assertTrue(instance.hasKey("test"));
    }

}