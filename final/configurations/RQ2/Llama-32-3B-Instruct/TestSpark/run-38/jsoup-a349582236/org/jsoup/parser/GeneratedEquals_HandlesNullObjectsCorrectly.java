package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEquals_HandlesNullObjectsCorrectly {

    @Test
    public void equals_HandlesNullObjectsCorrectly() {
        Tag tag1 = new Tag();
        Tag tag2 = null;
        assertFalse(tag1.equals(tag2));
        assertTrue(tag2 == null || tag1.equals((Object) tag2));
    }

}