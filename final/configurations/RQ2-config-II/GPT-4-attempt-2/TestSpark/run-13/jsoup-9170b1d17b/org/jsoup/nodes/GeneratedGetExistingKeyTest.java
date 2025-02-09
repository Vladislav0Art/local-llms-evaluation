package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetExistingKeyTest {

    @Test
    public void getExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertEquals("value", attributes.get("key"));
    }

}