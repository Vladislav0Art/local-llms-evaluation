package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;

import java.io.IOException;
import java.util.Iterator;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        Iterator<Attribute> itr = attributes.iterator();
        assertTrue(itr.hasNext());
    }

}