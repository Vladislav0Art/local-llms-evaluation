package org.jsoup.nodes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedAddAttributeTest {

    @Test
    public void addAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        assertThat(attributes.hasKey("key"), is(true));
    }

}