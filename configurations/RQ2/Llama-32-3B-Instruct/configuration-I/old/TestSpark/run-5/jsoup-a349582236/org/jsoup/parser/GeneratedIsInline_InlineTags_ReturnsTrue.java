package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsInline_InlineTags_ReturnsTrue {

    @Test
    public void isInline_InlineTags_ReturnsTrue() {
        Tag tag = new Tag("span");
        assertTrue(tag.isInline());
    }

}