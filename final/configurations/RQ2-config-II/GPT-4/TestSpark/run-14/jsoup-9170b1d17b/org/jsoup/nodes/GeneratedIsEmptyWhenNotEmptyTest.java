package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.internal.Attributes;

import static org.junit.Assert.*;

public class GeneratedIsEmptyWhenNotEmptyTest {

    @Test
    public void isEmptyWhenNotEmptyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key_seven", "value_seven");
        assertFalse(attributes.isEmpty());
    }

}