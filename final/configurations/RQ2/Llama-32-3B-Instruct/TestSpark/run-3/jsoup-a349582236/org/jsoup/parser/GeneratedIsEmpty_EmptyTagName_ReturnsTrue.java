package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_EmptyTagName_ReturnsTrue {

    @Test
    public void isEmpty_EmptyTagName_ReturnsTrue() {
        Tag tag = new Tag();
        assertEquals(true, tag.isEmpty());
    }

}