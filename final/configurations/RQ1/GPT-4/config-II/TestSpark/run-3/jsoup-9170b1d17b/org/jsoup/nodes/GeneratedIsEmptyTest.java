package org.jsoup.nodes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        Attributes attributes = new Attributes();
        assertThat(attributes.isEmpty(), is(true));

        attributes.add("key", "value");
        assertThat(attributes.isEmpty(), is(false));
    }

}