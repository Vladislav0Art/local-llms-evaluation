package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedPutExistingKeyTest {

    @Test
    public void putExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("existing_key", "old_value");
        attributes.put("existing_key", "new_value");
        assertEquals("new_value", attributes.get("existing_key"));
    }

}