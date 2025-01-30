package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCheckCloneTest {

    @Test
    public void checkCloneTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        Attributes cloneAttributes = attributes.clone();
        assertEquals(attributes, cloneAttributes);
    }

}