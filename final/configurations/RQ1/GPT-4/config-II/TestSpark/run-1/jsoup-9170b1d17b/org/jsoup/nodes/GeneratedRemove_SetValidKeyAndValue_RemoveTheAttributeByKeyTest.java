package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

public class GeneratedRemove_SetValidKeyAndValue_RemoveTheAttributeByKeyTest {

    @Test
    public void remove_SetValidKeyAndValue_RemoveTheAttributeByKeyTest() {
        Attributes instance = new Attributes();
        instance.put("test", "value");
        instance.remove("test");
        assertFalse(instance.hasKey("test"));
    }

}