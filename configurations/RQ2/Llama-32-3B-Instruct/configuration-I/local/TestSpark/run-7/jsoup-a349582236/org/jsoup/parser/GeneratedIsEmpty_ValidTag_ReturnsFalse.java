package org.jsoup.parser;

import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedIsEmpty_ValidTag_ReturnsFalse {

    @Test
    public void isEmpty_ValidTag_ReturnsFalse() {
        Tag tag = new Tag("div");
        assertFalse(tag.isEmpty());
    }

}