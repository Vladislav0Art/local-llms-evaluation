package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.ParserSettings;
import org.jsoup.parser.ParseError;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GeneratedIteratorReturnsOneElement {

    @Test
    public void iteratorReturnsOneElement() {
        Attributes attributes = new Attributes();
        Attribute attribute = new Attribute("test", "value");
        attributes.add(attribute.getKey(), attribute.getValue());
        Iterator<Attribute> iterator = attributes.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(1, iterator.next().getKey());
    }

}