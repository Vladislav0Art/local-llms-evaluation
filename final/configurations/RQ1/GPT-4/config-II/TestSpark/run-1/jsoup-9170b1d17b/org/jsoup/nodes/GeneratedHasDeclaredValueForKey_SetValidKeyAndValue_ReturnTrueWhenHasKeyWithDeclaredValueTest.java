package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

public class GeneratedHasDeclaredValueForKey_SetValidKeyAndValue_ReturnTrueWhenHasKeyWithDeclaredValueTest {

    @Test
    public void hasDeclaredValueForKey_SetValidKeyAndValue_ReturnTrueWhenHasKeyWithDeclaredValueTest() {
        Attributes instance = new Attributes();
        instance.put("test", "value");
        boolean result = instance.hasDeclaredValueForKey("test");
        assertTrue(result);
    }

}