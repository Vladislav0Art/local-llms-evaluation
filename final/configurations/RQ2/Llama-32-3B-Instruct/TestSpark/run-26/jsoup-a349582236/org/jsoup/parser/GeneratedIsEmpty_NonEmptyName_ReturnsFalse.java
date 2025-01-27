package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_NonEmptyName_ReturnsFalse {

    @Test
    public void isEmpty_NonEmptyName_ReturnsFalse() {
        Tag tag = new Tag("test");
        assertFalse(tag.isEmpty());
    }

}