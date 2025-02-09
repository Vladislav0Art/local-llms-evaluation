package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsBlock_ReturnsFalseForInlineTags {

    @Test
    public void isBlock_ReturnsFalseForInlineTags() {
        assertTrue(Tag.class.isAssignableFrom(EmptyTag.class));
        EmptyTag emptyTag = (EmptyTag) Tag.valueOf("");
        assertFalse(emptyTag.isBlock());
        assertFalse(Tag.valueOf("img").isBlock());
    }

}