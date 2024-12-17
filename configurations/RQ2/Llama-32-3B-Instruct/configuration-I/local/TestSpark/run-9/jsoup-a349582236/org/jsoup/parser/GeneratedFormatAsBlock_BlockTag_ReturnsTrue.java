package org.jsoup.parser;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedFormatAsBlock_BlockTag_ReturnsTrue {

    @Test
    public void formatAsBlock_BlockTag_ReturnsTrue() {
        String tagName = "p";
        ParseSettings settings = null;
        Tag tag = Tag.valueOf(tagName, settings);
        assertTrue(tag.formatAsBlock());
    }

}