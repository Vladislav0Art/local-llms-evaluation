package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_BlockTag_ReturnsFalse {

    @Test
    public void isInline_BlockTag_ReturnsFalse() {
        Tag tag = new Tag("div");
        assertFalse(tag.isInline());
    }

}