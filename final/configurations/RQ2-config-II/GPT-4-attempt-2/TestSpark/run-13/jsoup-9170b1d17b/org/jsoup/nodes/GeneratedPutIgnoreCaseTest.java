package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedPutIgnoreCaseTest {

    @Test
    public void putIgnoreCaseTest() {
        Attributes attributes = new Attributes();
        attributes.putIgnoreCase("Key", "value");
        assertTrue(attributes.hasKeyIgnoreCase("key"));
    }

}