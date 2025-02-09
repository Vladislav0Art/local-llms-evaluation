package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_FormTag_ReturnsFalse {

    @Test
    public void isBlock_FormTag_ReturnsFalse() {
        Tag tag = new Tag("form");
        assertFalse(tag.isBlock());
    }

}