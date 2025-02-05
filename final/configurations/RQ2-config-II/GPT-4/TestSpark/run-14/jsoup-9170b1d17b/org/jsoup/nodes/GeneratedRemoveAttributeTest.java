package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.internal.Attributes;

import static org.junit.Assert.*;

public class GeneratedRemoveAttributeTest {

    @Test
    public void removeAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key_four", "value_four");
        attributes.remove("key_four");
        assertFalse(attributes.hasKey("key_four"));
    }

}