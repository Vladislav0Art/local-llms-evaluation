package org.jsoup.nodes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedAttributeIteratorTest {

    @Test
    public void attributeIteratorTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.add("key1", "value1");

        Iterator<Attribute> iterator = attributes.iterator();
        Attribute attribute = iterator.next();

        assertThat(attribute.getKey(), is("key"));
        assertThat(attribute.getValue(), is("value"));

        attribute = iterator.next();
        assertThat(attribute.getKey(), is("key1"));
        assertThat(attribute.getValue(), is("value1"));

        try {
            attribute = iterator.next();
        } catch (NoSuchElementException ex) {
            assert true;
        }
    }

}