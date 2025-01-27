package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_InlineTag_ReturnsTrue {

    @Test
    public void isInline_InlineTag_ReturnsTrue() {
        Tag tag = new Tag();
        tag.setName("span");
        assertTrue(tag.isInline());
    }

}