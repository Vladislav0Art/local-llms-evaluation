package org.jsoup.nodes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() throws CloneNotSupportedException {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");

        Attributes clone = attributes.clone();
        assertThat(clone.hasKey("key"), is(true));
    }

}