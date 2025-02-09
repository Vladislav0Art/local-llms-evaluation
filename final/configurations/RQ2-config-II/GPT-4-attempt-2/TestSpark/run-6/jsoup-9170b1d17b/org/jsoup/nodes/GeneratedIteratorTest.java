package org.jsoup.nodes;

import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Attribute;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.*;

public class GeneratedIteratorTest {

    @Test
    public void iteratorTest() {
        Attributes att = new Attributes();
        att.put("key", "value");
        Iterator<Attribute> it = att.iterator();
        assertTrue(it.hasNext());
    }

}