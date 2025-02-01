package org.jsoup.nodes;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class GeneratedGetAttributeWhenNotExistTest {

    @Test
    public void getAttributeWhenNotExistTest() {
        Attributes attributes = new Attributes();
        String result = attributes.get("key");
        assertThat(result, is(""));
    }

}