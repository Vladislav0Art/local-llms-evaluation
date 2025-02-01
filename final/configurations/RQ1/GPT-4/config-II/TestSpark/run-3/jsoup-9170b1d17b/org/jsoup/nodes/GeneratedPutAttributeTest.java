package org.jsoup.nodes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedPutAttributeTest {

    @Test
    public void putAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.put("key", "value");
        assertThat(attributes.hasKey("key"), is(true));
    }

}