package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

public class GeneratedHasDeclaredValueForKeyIgnoreCase_SetValidKeyAndValue_ReturnTrueWhenHasKeyWithDeclaredValueTest {

    @Test
    public void hasDeclaredValueForKeyIgnoreCase_SetValidKeyAndValue_ReturnTrueWhenHasKeyWithDeclaredValueTest() {
        Attributes instance = new Attributes();
        instance.put("test", "value");
        boolean result = instance.hasDeclaredValueForKeyIgnoreCase("TEST");
        assertTrue(result);
    }

}