package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

public class GeneratedRemoveIgnoreCase_SetValidKeyAndValue_RemoveTheAttributeIgnoreCaseTest {

    @Test
    public void removeIgnoreCase_SetValidKeyAndValue_RemoveTheAttributeIgnoreCaseTest() {
        Attributes instance = new Attributes();
        instance.put("test", "value");
        instance.removeIgnoreCase("TEST");
        assertFalse(instance.hasKey("test"));
    }

}