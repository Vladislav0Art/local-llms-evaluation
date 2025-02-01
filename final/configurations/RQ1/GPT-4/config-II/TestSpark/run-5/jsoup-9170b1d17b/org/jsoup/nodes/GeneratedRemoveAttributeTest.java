package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.helper.Validate;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

public class GeneratedRemoveAttributeTest {

    @Test
    public void removeAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        attributes.remove("key");
        assertFalse(attributes.hasKey("key"));
    }

}