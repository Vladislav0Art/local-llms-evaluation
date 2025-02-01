package org.jsoup.nodes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedRemoveAttributeTest {

    @Test
    public void removeAttributeTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");
        attributes.remove("key");
        assertThat(attributes.hasKey("key"), is(false));
    }

}