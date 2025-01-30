package org.jsoup.nodes;

import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedEmptyIteratorTest {

    @Test
    public void emptyIteratorTest() {
        final Attributes attributes = new Attributes();
        final Iterator<Attribute> iterator = attributes.iterator();
        iterator.next();
    }

}