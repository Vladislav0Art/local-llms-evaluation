package org.jsoup.nodes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedSizeTest {

    @Test
    public void sizeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.add("key1", "value1");

        assertThat(attributes.size(), is(2));
    }

}