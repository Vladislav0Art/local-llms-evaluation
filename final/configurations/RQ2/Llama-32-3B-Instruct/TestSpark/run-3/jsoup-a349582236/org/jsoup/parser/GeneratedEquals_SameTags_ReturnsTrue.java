package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEquals_SameTags_ReturnsTrue {

    @Test
    public void equals_SameTags_ReturnsTrue() {
        Tag tag1 = new Tag();
        Tag tag2 = new Tag();
        assertEquals(tag1, tag2);
    }

}