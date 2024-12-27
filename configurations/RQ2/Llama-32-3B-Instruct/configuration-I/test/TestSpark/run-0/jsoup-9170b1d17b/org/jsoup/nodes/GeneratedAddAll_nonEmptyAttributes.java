package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

public class GeneratedAddAll_nonEmptyAttributes {

    @Test
    public void addAll_nonEmptyAttributes() {
        Attributes attributes1 = new Attributes();
        Attribute attribute = new Attribute("key", "value");
        attributes1.add(attribute.getKey(), attribute.getValue());
        Attributes attributes2 = new Attributes();
        attribute = new Attribute("otherKey", "otherValue");
        attributes2.add(attribute.getKey(), attribute.getValue());
        Attributes result = new Attributes();
        result.addAll(attributes1);
        result.addAll(attributes2);
        assertTrue(result.hasKey(attribute.getKey()));
    }

}