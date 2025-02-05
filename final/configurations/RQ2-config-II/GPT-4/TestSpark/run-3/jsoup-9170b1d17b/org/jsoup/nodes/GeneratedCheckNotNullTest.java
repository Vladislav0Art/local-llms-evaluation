package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedCheckNotNullTest {

    @Test
    public void checkNotNullTest() {
        assertEquals("", Attributes.checkNotNull(null));
        assertEquals("value", Attributes.checkNotNull("value"));
    }

}