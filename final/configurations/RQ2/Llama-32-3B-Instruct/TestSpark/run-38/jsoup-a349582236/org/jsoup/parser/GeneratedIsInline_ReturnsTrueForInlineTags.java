package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_ReturnsTrueForInlineTags {

    @Test
    public void isInline_ReturnsTrueForInlineTags() {
        assertTrue(Tag.class.isAssignableFrom(EmptyTag.class));
        EmptyTag emptyTag = (EmptyTag) Tag.valueOf("");
        assertTrue(emptyTag.isInline());
        assertTrue(Tag.valueOf("span").isInline());
    }

}