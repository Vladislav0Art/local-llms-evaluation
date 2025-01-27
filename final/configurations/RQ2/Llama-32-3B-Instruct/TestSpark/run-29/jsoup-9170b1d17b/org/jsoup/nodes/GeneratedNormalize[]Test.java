package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedNormalize[]

Test {

    @Test
    public void normalize[] Test() {
        Attributes attributes = new Attributes();
        attributes.put("test", "value");
        attributes.normalize();
        assertTrue(attributes.get("test").equals("value"));
    }

}