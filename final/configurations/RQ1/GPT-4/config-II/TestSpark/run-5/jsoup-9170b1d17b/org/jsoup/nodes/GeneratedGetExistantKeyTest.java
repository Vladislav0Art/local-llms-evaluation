package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.helper.Validate;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

public class GeneratedGetExistantKeyTest {

    @Test
    public void getExistantKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

}