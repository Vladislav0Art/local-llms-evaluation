package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedInternalKeyTest {

    @Test
    public void internalKeyTest() {
        assertEquals("data-key", Attributes.internalKey("key"));
    }

}