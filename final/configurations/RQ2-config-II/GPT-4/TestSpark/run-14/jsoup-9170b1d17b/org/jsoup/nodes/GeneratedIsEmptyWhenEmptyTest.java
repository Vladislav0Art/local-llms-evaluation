package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.internal.Attributes;

import static org.junit.Assert.*;

public class GeneratedIsEmptyWhenEmptyTest {

    @Test
    public void isEmptyWhenEmptyTest() {
        Attributes attributes = new Attributes();
        assertTrue(attributes.isEmpty());
    }

}