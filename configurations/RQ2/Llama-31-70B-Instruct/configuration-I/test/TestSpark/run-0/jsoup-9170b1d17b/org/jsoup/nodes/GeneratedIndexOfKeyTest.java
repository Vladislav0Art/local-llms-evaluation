package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedIndexOfKeyTest {

    @Test
    public void indexOfKeyTest() {
        Attributes attributes = new Attributes();
        assertEquals(-1, attributes.indexOfKey("key"));
    }

}