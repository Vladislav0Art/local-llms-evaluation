package org.jsoup.parser;

import org.jsoup.helper.Validate;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmpty_ValidTag_ReturnsFalse {

    @Test
    public void isEmpty_ValidTag_ReturnsFalse() {
        String name = "div";
        Tag tag = new Tag(name);
        assertFalse(tag.isEmpty());
    }

}