package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.internal.Attributes;

import static org.junit.Assert.*;

public class GeneratedGetIgnoreCaseWithExistingKeyTest {

    @Test
    public void getIgnoreCaseWithExistingKeyTest() {
        Attributes attributes = new Attributes();
        attributes.add("key_one", "value_one");
        assertEquals("value_one", attributes.getIgnoreCase("KEY_ONE"));
    }

}