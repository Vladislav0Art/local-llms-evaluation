package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedHasDeclaredValueForKey_singleKey {

    @Test
    public void hasDeclaredValueForKey_singleKey() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes.add(attribute.getKey(), attribute.getValue());
        assertTrue(attributes.hasDeclaredValueForKey(attribute.getKey()));
    }

}