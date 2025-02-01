package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.helper.Validate;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.*;

public class GeneratedGetInexistantKeyTest {

    @Test
    public void getInexistantKeyTest() {
        Attributes attributes = new Attributes();
        assertEquals("", attributes.get("key"));
    }

}