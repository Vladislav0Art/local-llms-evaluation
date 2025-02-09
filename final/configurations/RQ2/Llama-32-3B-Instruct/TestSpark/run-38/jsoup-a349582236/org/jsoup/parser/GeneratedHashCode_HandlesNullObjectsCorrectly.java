package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedHashCode_HandlesNullObjectsCorrectly {

    @Test
    public void hashCode_HandlesNullObjectsCorrectly() {
        Tag tag1 = null;
        Tag tag2 = null;
        assertEquals(0, tag1.hashCode());
        assertEquals(0, tag2.hashCode());
    }

}