package org.jsoup.nodes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedGetAttributeWhenExistTest {

    @Test
    public void getAttributeWhenExistTest() {
        Attributes attributes = new Attributes();
        attributes.add("key", "value");

        String result = attributes.get("key");
        assertThat(result, is("value"));
    }

}