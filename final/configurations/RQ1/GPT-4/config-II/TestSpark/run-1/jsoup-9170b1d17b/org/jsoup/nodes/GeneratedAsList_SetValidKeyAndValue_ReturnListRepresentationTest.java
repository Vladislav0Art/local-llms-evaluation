package org.jsoup.nodes;

import static org.junit.Assert.*;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

public class GeneratedAsList_SetValidKeyAndValue_ReturnListRepresentationTest {

    @Test
    public void asList_SetValidKeyAndValue_ReturnListRepresentationTest() {
        Attributes instance = new Attributes();
        instance.put("test", "value");
        assertTrue(instance.asList().size() == 1);
        assertTrue(instance.asList().get(0).getKey().equals("test"));
        assertTrue(instance.asList().get(0).getValue().equals("value"));
    }

}