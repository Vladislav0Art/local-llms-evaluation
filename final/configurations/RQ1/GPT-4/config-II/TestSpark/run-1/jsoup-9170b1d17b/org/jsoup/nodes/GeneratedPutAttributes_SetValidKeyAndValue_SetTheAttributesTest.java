package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

public class GeneratedPutAttributes_SetValidKeyAndValue_SetTheAttributesTest {

    @Test
    public void putAttributes_SetValidKeyAndValue_SetTheAttributesTest() {
        Attributes instance = new Attributes();
        Attribute attribute = new Attribute("test", "value");
        instance.put(attribute);
        assertTrue(instance.hasKey("test"));
    }

}