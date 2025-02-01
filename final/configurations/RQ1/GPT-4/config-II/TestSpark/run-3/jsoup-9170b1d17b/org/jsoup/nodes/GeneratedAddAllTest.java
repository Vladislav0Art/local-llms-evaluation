package org.jsoup.nodes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedAddAllTest {

    @Test
    public void addAllTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");

        Attributes other = new Attributes();
        other.add("key1", "value1");

        attributes.addAll(other);

        assertThat(attributes.hasKey("key1"), is(true));
        assertThat(attributes.size(), is(2));
    }

}