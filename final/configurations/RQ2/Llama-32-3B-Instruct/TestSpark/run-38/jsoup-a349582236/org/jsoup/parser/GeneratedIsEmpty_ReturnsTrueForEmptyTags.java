package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_ReturnsTrueForEmptyTags {

    @Test
    public void isEmpty_ReturnsTrueForEmptyTags() {
        assertTrue(Tag.class.isAssignableFrom(EmptyTag.class));
        EmptyTag emptyTag = (EmptyTag) Tag.valueOf("");
        assertTrue(emptyTag.isEmpty());
    }

}