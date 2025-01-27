package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_MultipleEmptyTags_ReturnsTrue {

    @Test
    public void isEmpty_MultipleEmptyTags_ReturnsTrue() {
        for (int i = 0; i < 100; i++) {
            Tag tag = Tag.valueOf("");
        }
        assertTrue(Tag.isEmpty());
    }

}