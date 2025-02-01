package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

public class GeneratedIsEmpty_SetValidKeyAndValue_ReturnFalseTest {

    @Test
    public void isEmpty_SetValidKeyAndValue_ReturnFalseTest() {
        Attributes instance = new Attributes();
        instance.put("test", "value");
        boolean result = instance.isEmpty();
        assertFalse(result);
    }

}